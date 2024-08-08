package services.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.usermanager.PermissionCheckRequest;
import com.example.usermanager.PermissionCheckResponse;
import com.example.usermanager.UserAuthenticateRequest;
import com.example.usermanager.UserAuthenticateResponse;
import com.example.usermanager.UserManagerServiceGrpc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserManagerServiceImpl extends UserManagerServiceGrpc.UserManagerServiceImplBase {

    private final Map<String, String> userCredentials = new HashMap<>();
    private final Map<String, String> userPermissions = new HashMap<>();

    public UserManagerServiceImpl() {
        // Inicializar dados fictícios de usuários
        userCredentials.put("user1", "password1");
        userCredentials.put("admin", "adminpass");
        
        // Inicializar permissões fictícias
        userPermissions.put("user1", "read");
        userPermissions.put("admin", "read,write");
    }

    @Override
    public void userAuthenticate(UserAuthenticateRequest request, StreamObserver<UserAuthenticateResponse> responseObserver) {
        String password = userCredentials.get(request.getUserName());
        UserAuthenticateResponse response;
        
        if (password != null && password.equals(request.getPassword())) {
            response = UserAuthenticateResponse.newBuilder()
                    .setAuthenticated(true)
                    .setMessage("User authenticated successfully")
                    .build();
        } else {
            response = UserAuthenticateResponse.newBuilder()
                    .setAuthenticated(false)
                    .setMessage("Authentication failed")
                    .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void permissionCheck(PermissionCheckRequest request, StreamObserver<PermissionCheckResponse> responseObserver) {
        String permissions = userPermissions.get(request.getUserName());
        PermissionCheckResponse response;

        if (permissions != null && permissions.contains(request.getResource())) {
            response = PermissionCheckResponse.newBuilder()
                    .setHasPermission(true)
                    .setMessage("Permission granted")
                    .build();
        } else {
            response = PermissionCheckResponse.newBuilder()
                    .setHasPermission(false)
                    .setMessage("Permission denied")
                    .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8081)
                .addService(new UserManagerServiceImpl())
                .build();

        server.start();
        System.out.println("User Manager Service started at " + server.getPort());
        server.awaitTermination();
    }
}