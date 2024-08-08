package com.example.bookservice;

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
    comments = "Source: book_service.proto")
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.bookservice.IndexBookRequest,
      com.example.bookservice.IndexBookResponse> getIndexBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexBook",
      requestType = com.example.bookservice.IndexBookRequest.class,
      responseType = com.example.bookservice.IndexBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.bookservice.IndexBookRequest,
      com.example.bookservice.IndexBookResponse> getIndexBookMethod() {
    io.grpc.MethodDescriptor<com.example.bookservice.IndexBookRequest, com.example.bookservice.IndexBookResponse> getIndexBookMethod;
    if ((getIndexBookMethod = BookServiceGrpc.getIndexBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getIndexBookMethod = BookServiceGrpc.getIndexBookMethod) == null) {
          BookServiceGrpc.getIndexBookMethod = getIndexBookMethod = 
              io.grpc.MethodDescriptor.<com.example.bookservice.IndexBookRequest, com.example.bookservice.IndexBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "IndexBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.IndexBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.IndexBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("IndexBook"))
                  .build();
          }
        }
     }
     return getIndexBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.bookservice.UpdateBookRequest,
      com.example.bookservice.UpdateBookResponse> getUpdateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBook",
      requestType = com.example.bookservice.UpdateBookRequest.class,
      responseType = com.example.bookservice.UpdateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.bookservice.UpdateBookRequest,
      com.example.bookservice.UpdateBookResponse> getUpdateBookMethod() {
    io.grpc.MethodDescriptor<com.example.bookservice.UpdateBookRequest, com.example.bookservice.UpdateBookResponse> getUpdateBookMethod;
    if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
          BookServiceGrpc.getUpdateBookMethod = getUpdateBookMethod = 
              io.grpc.MethodDescriptor.<com.example.bookservice.UpdateBookRequest, com.example.bookservice.UpdateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "UpdateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.UpdateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.UpdateBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("UpdateBook"))
                  .build();
          }
        }
     }
     return getUpdateBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.bookservice.SearchBooksRequest,
      com.example.bookservice.SearchBooksResponse> getSearchBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchBooks",
      requestType = com.example.bookservice.SearchBooksRequest.class,
      responseType = com.example.bookservice.SearchBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.bookservice.SearchBooksRequest,
      com.example.bookservice.SearchBooksResponse> getSearchBooksMethod() {
    io.grpc.MethodDescriptor<com.example.bookservice.SearchBooksRequest, com.example.bookservice.SearchBooksResponse> getSearchBooksMethod;
    if ((getSearchBooksMethod = BookServiceGrpc.getSearchBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSearchBooksMethod = BookServiceGrpc.getSearchBooksMethod) == null) {
          BookServiceGrpc.getSearchBooksMethod = getSearchBooksMethod = 
              io.grpc.MethodDescriptor.<com.example.bookservice.SearchBooksRequest, com.example.bookservice.SearchBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BookService", "SearchBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.SearchBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.bookservice.SearchBooksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("SearchBooks"))
                  .build();
          }
        }
     }
     return getSearchBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    return new BookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void indexBook(com.example.bookservice.IndexBookRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.IndexBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIndexBookMethod(), responseObserver);
    }

    /**
     */
    public void updateBook(com.example.bookservice.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.UpdateBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBookMethod(), responseObserver);
    }

    /**
     */
    public void searchBooks(com.example.bookservice.SearchBooksRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.SearchBooksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIndexBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.bookservice.IndexBookRequest,
                com.example.bookservice.IndexBookResponse>(
                  this, METHODID_INDEX_BOOK)))
          .addMethod(
            getUpdateBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.bookservice.UpdateBookRequest,
                com.example.bookservice.UpdateBookResponse>(
                  this, METHODID_UPDATE_BOOK)))
          .addMethod(
            getSearchBooksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.bookservice.SearchBooksRequest,
                com.example.bookservice.SearchBooksResponse>(
                  this, METHODID_SEARCH_BOOKS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractStub<BookServiceStub> {
    private BookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void indexBook(com.example.bookservice.IndexBookRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.IndexBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIndexBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBook(com.example.bookservice.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.UpdateBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchBooks(com.example.bookservice.SearchBooksRequest request,
        io.grpc.stub.StreamObserver<com.example.bookservice.SearchBooksResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.bookservice.IndexBookResponse indexBook(com.example.bookservice.IndexBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getIndexBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.bookservice.UpdateBookResponse updateBook(com.example.bookservice.UpdateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.bookservice.SearchBooksResponse> searchBooks(
        com.example.bookservice.SearchBooksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition 
   * </pre>
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractStub<BookServiceFutureStub> {
    private BookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.bookservice.IndexBookResponse> indexBook(
        com.example.bookservice.IndexBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIndexBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.bookservice.UpdateBookResponse> updateBook(
        com.example.bookservice.UpdateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX_BOOK = 0;
  private static final int METHODID_UPDATE_BOOK = 1;
  private static final int METHODID_SEARCH_BOOKS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INDEX_BOOK:
          serviceImpl.indexBook((com.example.bookservice.IndexBookRequest) request,
              (io.grpc.stub.StreamObserver<com.example.bookservice.IndexBookResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOOK:
          serviceImpl.updateBook((com.example.bookservice.UpdateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.example.bookservice.UpdateBookResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BOOKS:
          serviceImpl.searchBooks((com.example.bookservice.SearchBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.example.bookservice.SearchBooksResponse>) responseObserver);
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

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.bookservice.BookServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getIndexBookMethod())
              .addMethod(getUpdateBookMethod())
              .addMethod(getSearchBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
