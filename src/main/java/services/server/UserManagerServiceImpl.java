package services.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.usermanager.PermissionCheckRequest;
import com.example.usermanager.PermissionCheckResponse;
import com.example.usermanager.UserAuthenticateRequest;
import com.example.usermanager.UserAuthenticateResponse;
import com.example.usermanager.UserManagerServiceGrpc;

import client.services.JmDNSManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserManagerServiceImpl extends UserManagerServiceGrpc.UserManagerServiceImplBase {

    private final Map<String, String> userCredentials = new HashMap<>();
    private final Map<String, String> userPermissions = new HashMap<>();

    public UserManagerServiceImpl() {
        // Initialize the sample user names 
        userCredentials.put("user1", "password1");
        userCredentials.put("admin", "adminpass");
        
        // Initialize the sample user permissions 
        userPermissions.put("user1", "read");
        userPermissions.put("admin", "read,write");
    }

    //Authentication user method
    @Override
    public void userAuthenticate(UserAuthenticateRequest request, StreamObserver<UserAuthenticateResponse> responseObserver) {
        String password = userCredentials.get(request.getUserName());
        UserAuthenticateResponse response;
        //Authentication successufuly message 
        if (password != null && password.equals(request.getPassword())) {
            response = UserAuthenticateResponse.newBuilder()
                    .setAuthenticated(true)
                    .setMessage("User authenticated successfully")
                    .build();
            //Authentication failed message 
        } else {
            response = UserAuthenticateResponse.newBuilder()
                    .setAuthenticated(false)
                    .setMessage("Authentication failed")
                    .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Permission check method 
    @Override
    public void permissionCheck(PermissionCheckRequest request, StreamObserver<PermissionCheckResponse> responseObserver) {
        String permissions = userPermissions.get(request.getUserName());
        PermissionCheckResponse response;
        // Permission granted message 
        if (permissions != null && permissions.contains(request.getResource())) {
            response = PermissionCheckResponse.newBuilder()
                    .setHasPermission(true)
                    .setMessage("Permission granted")
                    .build();
            //permission denied message 
        } else {
            response = PermissionCheckResponse.newBuilder()
                    .setHasPermission(false)
                    .setMessage("Permission denied")
                    .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Main method to start the gRPC server 
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8081)
                .addService(new UserManagerServiceImpl())
                .build();

        server.start();
        System.out.println("User manager Service started at " + server.getPort());

        JmDNSManager jmDNSManager = new JmDNSManager();
        jmDNSManager.registerService("UserManagerService", 8081);

        // Waits the server interruption 
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                server.shutdown();
                jmDNSManager.close();
            } catch (IOException e) {
                System.err.println("Error to close the server: " + e.getMessage());
            }
        }));

        server.awaitTermination();
    }
}