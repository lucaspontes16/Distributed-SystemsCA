package client.services;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.example.usermanager.PermissionCheckRequest;
import com.example.usermanager.PermissionCheckResponse;
import com.example.usermanager.UserAuthenticateRequest;
import com.example.usermanager.UserAuthenticateResponse;
import com.example.usermanager.UserManagerServiceGrpc;


public class UserManagerServiceClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        UserManagerServiceGrpc.UserManagerServiceBlockingStub stub = UserManagerServiceGrpc.newBlockingStub(channel);

        // Autenticar usuário
        UserAuthenticateRequest authRequest = UserAuthenticateRequest.newBuilder()
                .setUserName("user1")
                .setPassword("password1")
                .build();
        UserAuthenticateResponse authResponse = stub.userAuthenticate(authRequest);
        System.out.println(authResponse.getMessage());

        // Checar permissão do usuário
        PermissionCheckRequest permRequest = PermissionCheckRequest.newBuilder()
                .setUserName("user1")
                .setResource("read")
                .build();
        PermissionCheckResponse permResponse = stub.permissionCheck(permRequest);
        System.out.println(permResponse.getMessage());

        channel.shutdown();
    }
}