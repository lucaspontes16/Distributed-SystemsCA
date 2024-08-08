package com.example.usermanager;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service definition 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user_manager_service.proto")
public final class UserManagerServiceGrpc {

  private UserManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "UserManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.usermanager.UserAuthenticateRequest,
      com.example.usermanager.UserAuthenticateResponse> getUserAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAuthenticate",
      requestType = com.example.usermanager.UserAuthenticateRequest.class,
      responseType = com.example.usermanager.UserAuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.usermanager.UserAuthenticateRequest,
      com.example.usermanager.UserAuthenticateResponse> getUserAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.example.usermanager.UserAuthenticateRequest, com.example.usermanager.UserAuthenticateResponse> getUserAuthenticateMethod;
    if ((getUserAuthenticateMethod = UserManagerServiceGrpc.getUserAuthenticateMethod) == null) {
      synchronized (UserManagerServiceGrpc.class) {
        if ((getUserAuthenticateMethod = UserManagerServiceGrpc.getUserAuthenticateMethod) == null) {
          UserManagerServiceGrpc.getUserAuthenticateMethod = getUserAuthenticateMethod = 
              io.grpc.MethodDescriptor.<com.example.usermanager.UserAuthenticateRequest, com.example.usermanager.UserAuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserManagerService", "UserAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.usermanager.UserAuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.usermanager.UserAuthenticateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerServiceMethodDescriptorSupplier("UserAuthenticate"))
                  .build();
          }
        }
     }
     return getUserAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.usermanager.PermissionCheckRequest,
      com.example.usermanager.PermissionCheckResponse> getPermissionCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PermissionCheck",
      requestType = com.example.usermanager.PermissionCheckRequest.class,
      responseType = com.example.usermanager.PermissionCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.usermanager.PermissionCheckRequest,
      com.example.usermanager.PermissionCheckResponse> getPermissionCheckMethod() {
    io.grpc.MethodDescriptor<com.example.usermanager.PermissionCheckRequest, com.example.usermanager.PermissionCheckResponse> getPermissionCheckMethod;
    if ((getPermissionCheckMethod = UserManagerServiceGrpc.getPermissionCheckMethod) == null) {
      synchronized (UserManagerServiceGrpc.class) {
        if ((getPermissionCheckMethod = UserManagerServiceGrpc.getPermissionCheckMethod) == null) {
          UserManagerServiceGrpc.getPermissionCheckMethod = getPermissionCheckMethod = 
              io.grpc.MethodDescriptor.<com.example.usermanager.PermissionCheckRequest, com.example.usermanager.PermissionCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserManagerService", "PermissionCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.usermanager.PermissionCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.usermanager.PermissionCheckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerServiceMethodDescriptorSupplier("PermissionCheck"))
                  .build();
          }
        }
     }
     return getPermissionCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserManagerServiceStub newStub(io.grpc.Channel channel) {
    return new UserManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserManagerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static abstract class UserManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void userAuthenticate(com.example.usermanager.UserAuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.example.usermanager.UserAuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void permissionCheck(com.example.usermanager.PermissionCheckRequest request,
        io.grpc.stub.StreamObserver<com.example.usermanager.PermissionCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPermissionCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.usermanager.UserAuthenticateRequest,
                com.example.usermanager.UserAuthenticateResponse>(
                  this, METHODID_USER_AUTHENTICATE)))
          .addMethod(
            getPermissionCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.usermanager.PermissionCheckRequest,
                com.example.usermanager.PermissionCheckResponse>(
                  this, METHODID_PERMISSION_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class UserManagerServiceStub extends io.grpc.stub.AbstractStub<UserManagerServiceStub> {
    private UserManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void userAuthenticate(com.example.usermanager.UserAuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.example.usermanager.UserAuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void permissionCheck(com.example.usermanager.PermissionCheckRequest request,
        io.grpc.stub.StreamObserver<com.example.usermanager.PermissionCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPermissionCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class UserManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<UserManagerServiceBlockingStub> {
    private UserManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.usermanager.UserAuthenticateResponse userAuthenticate(com.example.usermanager.UserAuthenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.usermanager.PermissionCheckResponse permissionCheck(com.example.usermanager.PermissionCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getPermissionCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class UserManagerServiceFutureStub extends io.grpc.stub.AbstractStub<UserManagerServiceFutureStub> {
    private UserManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.usermanager.UserAuthenticateResponse> userAuthenticate(
        com.example.usermanager.UserAuthenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.usermanager.PermissionCheckResponse> permissionCheck(
        com.example.usermanager.PermissionCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPermissionCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_AUTHENTICATE = 0;
  private static final int METHODID_PERMISSION_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_AUTHENTICATE:
          serviceImpl.userAuthenticate((com.example.usermanager.UserAuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.usermanager.UserAuthenticateResponse>) responseObserver);
          break;
        case METHODID_PERMISSION_CHECK:
          serviceImpl.permissionCheck((com.example.usermanager.PermissionCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.example.usermanager.PermissionCheckResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.usermanager.UserManagerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserManagerService");
    }
  }

  private static final class UserManagerServiceFileDescriptorSupplier
      extends UserManagerServiceBaseDescriptorSupplier {
    UserManagerServiceFileDescriptorSupplier() {}
  }

  private static final class UserManagerServiceMethodDescriptorSupplier
      extends UserManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserManagerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserManagerServiceFileDescriptorSupplier())
              .addMethod(getUserAuthenticateMethod())
              .addMethod(getPermissionCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
