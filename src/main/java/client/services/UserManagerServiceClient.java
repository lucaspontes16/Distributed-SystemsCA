package client.services;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

import javax.jmdns.ServiceInfo;

import com.example.usermanager.PermissionCheckRequest;
import com.example.usermanager.PermissionCheckResponse;
import com.example.usermanager.UserAuthenticateRequest;
import com.example.usermanager.UserAuthenticateResponse;
import com.example.usermanager.UserManagerServiceGrpc;


public class UserManagerServiceClient {

    public static void main(String[] args) throws IOException {
    	//JmDNS manager to discover the service 
   	 JmDNSManager jmDNSManager = new JmDNSManager();
        try {
       	 //Discover the book Service 
            ServiceInfo serviceInfo = jmDNSManager.discoverService("UserManagerService");
            
            if (serviceInfo != null) {
           	 ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

           	 try {
        UserManagerServiceGrpc.UserManagerServiceBlockingStub stub = UserManagerServiceGrpc.newBlockingStub(channel);

        // User Authentication 
        UserAuthenticateRequest authRequest = UserAuthenticateRequest.newBuilder()
                .setUserName("user1")
                .setPassword("password1")
                .build();
        UserAuthenticateResponse authResponse = stub.userAuthenticate(authRequest);
        System.out.println(authResponse.getMessage());

        // User permission check 
        PermissionCheckRequest permRequest = PermissionCheckRequest.newBuilder()
                .setUserName("user1")
                .setResource("read")
                .build();
        PermissionCheckResponse permResponse = stub.permissionCheck(permRequest);
        System.out.println(permResponse.getMessage());

           	 }finally {
        //closes the channel 
        channel.shutdown();
           	 }
           	 
             } else {
                 System.out.println("Service not found.");
             }
         } catch (IOException e) {
             System.out.println("Error discovering service with JmDNS: " + e.getMessage());
         } finally {
        	 //close the JmDNS manager 
             jmDNSManager.close();
         }
    }
}