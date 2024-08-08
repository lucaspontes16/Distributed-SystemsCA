package com.example.iot;

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
 * service definiiton
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: iot_integration_service.proto")
public final class IoTIntegrationServiceGrpc {

  private IoTIntegrationServiceGrpc() {}

  public static final String SERVICE_NAME = "IoTIntegrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.iot.IoTDevMonitoringRequest,
      com.example.iot.IoTDevMonitoringResponse> getIoTDevMonitoringServMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IoTDevMonitoringServ",
      requestType = com.example.iot.IoTDevMonitoringRequest.class,
      responseType = com.example.iot.IoTDevMonitoringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.iot.IoTDevMonitoringRequest,
      com.example.iot.IoTDevMonitoringResponse> getIoTDevMonitoringServMethod() {
    io.grpc.MethodDescriptor<com.example.iot.IoTDevMonitoringRequest, com.example.iot.IoTDevMonitoringResponse> getIoTDevMonitoringServMethod;
    if ((getIoTDevMonitoringServMethod = IoTIntegrationServiceGrpc.getIoTDevMonitoringServMethod) == null) {
      synchronized (IoTIntegrationServiceGrpc.class) {
        if ((getIoTDevMonitoringServMethod = IoTIntegrationServiceGrpc.getIoTDevMonitoringServMethod) == null) {
          IoTIntegrationServiceGrpc.getIoTDevMonitoringServMethod = getIoTDevMonitoringServMethod = 
              io.grpc.MethodDescriptor.<com.example.iot.IoTDevMonitoringRequest, com.example.iot.IoTDevMonitoringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IoTIntegrationService", "IoTDevMonitoringServ"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.iot.IoTDevMonitoringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.iot.IoTDevMonitoringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IoTIntegrationServiceMethodDescriptorSupplier("IoTDevMonitoringServ"))
                  .build();
          }
        }
     }
     return getIoTDevMonitoringServMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.iot.DeviceControlRequest,
      com.example.iot.DeviceControlResponse> getDeviceControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeviceControl",
      requestType = com.example.iot.DeviceControlRequest.class,
      responseType = com.example.iot.DeviceControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.iot.DeviceControlRequest,
      com.example.iot.DeviceControlResponse> getDeviceControlMethod() {
    io.grpc.MethodDescriptor<com.example.iot.DeviceControlRequest, com.example.iot.DeviceControlResponse> getDeviceControlMethod;
    if ((getDeviceControlMethod = IoTIntegrationServiceGrpc.getDeviceControlMethod) == null) {
      synchronized (IoTIntegrationServiceGrpc.class) {
        if ((getDeviceControlMethod = IoTIntegrationServiceGrpc.getDeviceControlMethod) == null) {
          IoTIntegrationServiceGrpc.getDeviceControlMethod = getDeviceControlMethod = 
              io.grpc.MethodDescriptor.<com.example.iot.DeviceControlRequest, com.example.iot.DeviceControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "IoTIntegrationService", "DeviceControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.iot.DeviceControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.iot.DeviceControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IoTIntegrationServiceMethodDescriptorSupplier("DeviceControl"))
                  .build();
          }
        }
     }
     return getDeviceControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IoTIntegrationServiceStub newStub(io.grpc.Channel channel) {
    return new IoTIntegrationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IoTIntegrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IoTIntegrationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IoTIntegrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IoTIntegrationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * service definiiton
   * </pre>
   */
  public static abstract class IoTIntegrationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ioTDevMonitoringServ(com.example.iot.IoTDevMonitoringRequest request,
        io.grpc.stub.StreamObserver<com.example.iot.IoTDevMonitoringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIoTDevMonitoringServMethod(), responseObserver);
    }

    /**
     */
    public void deviceControl(com.example.iot.DeviceControlRequest request,
        io.grpc.stub.StreamObserver<com.example.iot.DeviceControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIoTDevMonitoringServMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.iot.IoTDevMonitoringRequest,
                com.example.iot.IoTDevMonitoringResponse>(
                  this, METHODID_IO_TDEV_MONITORING_SERV)))
          .addMethod(
            getDeviceControlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.iot.DeviceControlRequest,
                com.example.iot.DeviceControlResponse>(
                  this, METHODID_DEVICE_CONTROL)))
          .build();
    }
  }

  /**
   * <pre>
   * service definiiton
   * </pre>
   */
  public static final class IoTIntegrationServiceStub extends io.grpc.stub.AbstractStub<IoTIntegrationServiceStub> {
    private IoTIntegrationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IoTIntegrationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTIntegrationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IoTIntegrationServiceStub(channel, callOptions);
    }

    /**
     */
    public void ioTDevMonitoringServ(com.example.iot.IoTDevMonitoringRequest request,
        io.grpc.stub.StreamObserver<com.example.iot.IoTDevMonitoringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIoTDevMonitoringServMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deviceControl(com.example.iot.DeviceControlRequest request,
        io.grpc.stub.StreamObserver<com.example.iot.DeviceControlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceControlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * service definiiton
   * </pre>
   */
  public static final class IoTIntegrationServiceBlockingStub extends io.grpc.stub.AbstractStub<IoTIntegrationServiceBlockingStub> {
    private IoTIntegrationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IoTIntegrationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTIntegrationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IoTIntegrationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.iot.IoTDevMonitoringResponse ioTDevMonitoringServ(com.example.iot.IoTDevMonitoringRequest request) {
      return blockingUnaryCall(
          getChannel(), getIoTDevMonitoringServMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.iot.DeviceControlResponse deviceControl(com.example.iot.DeviceControlRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceControlMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service definiiton
   * </pre>
   */
  public static final class IoTIntegrationServiceFutureStub extends io.grpc.stub.AbstractStub<IoTIntegrationServiceFutureStub> {
    private IoTIntegrationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IoTIntegrationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTIntegrationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IoTIntegrationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.iot.IoTDevMonitoringResponse> ioTDevMonitoringServ(
        com.example.iot.IoTDevMonitoringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIoTDevMonitoringServMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.iot.DeviceControlResponse> deviceControl(
        com.example.iot.DeviceControlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceControlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IO_TDEV_MONITORING_SERV = 0;
  private static final int METHODID_DEVICE_CONTROL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IoTIntegrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IoTIntegrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IO_TDEV_MONITORING_SERV:
          serviceImpl.ioTDevMonitoringServ((com.example.iot.IoTDevMonitoringRequest) request,
              (io.grpc.stub.StreamObserver<com.example.iot.IoTDevMonitoringResponse>) responseObserver);
          break;
        case METHODID_DEVICE_CONTROL:
          serviceImpl.deviceControl((com.example.iot.DeviceControlRequest) request,
              (io.grpc.stub.StreamObserver<com.example.iot.DeviceControlResponse>) responseObserver);
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

  private static abstract class IoTIntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IoTIntegrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.iot.IoTIntegrationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IoTIntegrationService");
    }
  }

  private static final class IoTIntegrationServiceFileDescriptorSupplier
      extends IoTIntegrationServiceBaseDescriptorSupplier {
    IoTIntegrationServiceFileDescriptorSupplier() {}
  }

  private static final class IoTIntegrationServiceMethodDescriptorSupplier
      extends IoTIntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IoTIntegrationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IoTIntegrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IoTIntegrationServiceFileDescriptorSupplier())
              .addMethod(getIoTDevMonitoringServMethod())
              .addMethod(getDeviceControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
