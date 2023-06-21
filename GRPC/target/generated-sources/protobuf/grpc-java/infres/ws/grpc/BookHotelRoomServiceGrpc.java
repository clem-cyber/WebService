package infres.ws.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: hotel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookHotelRoomServiceGrpc {

  private BookHotelRoomServiceGrpc() {}

  public static final String SERVICE_NAME = "infres.ws.grpc.BookHotelRoomService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.RoomReply> getGetRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoom",
      requestType = com.google.protobuf.Empty.class,
      responseType = infres.ws.grpc.RoomReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.RoomReply> getGetRoomMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, infres.ws.grpc.RoomReply> getGetRoomMethod;
    if ((getGetRoomMethod = BookHotelRoomServiceGrpc.getGetRoomMethod) == null) {
      synchronized (BookHotelRoomServiceGrpc.class) {
        if ((getGetRoomMethod = BookHotelRoomServiceGrpc.getGetRoomMethod) == null) {
          BookHotelRoomServiceGrpc.getGetRoomMethod = getGetRoomMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, infres.ws.grpc.RoomReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  infres.ws.grpc.RoomReply.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomServiceMethodDescriptorSupplier("GetRoom"))
              .build();
        }
      }
    }
    return getGetRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.HotelReply> getGetHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotel",
      requestType = com.google.protobuf.Empty.class,
      responseType = infres.ws.grpc.HotelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.HotelReply> getGetHotelMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, infres.ws.grpc.HotelReply> getGetHotelMethod;
    if ((getGetHotelMethod = BookHotelRoomServiceGrpc.getGetHotelMethod) == null) {
      synchronized (BookHotelRoomServiceGrpc.class) {
        if ((getGetHotelMethod = BookHotelRoomServiceGrpc.getGetHotelMethod) == null) {
          BookHotelRoomServiceGrpc.getGetHotelMethod = getGetHotelMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, infres.ws.grpc.HotelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  infres.ws.grpc.HotelReply.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomServiceMethodDescriptorSupplier("GetHotel"))
              .build();
        }
      }
    }
    return getGetHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.HotelListReply> getGetHotelListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHotelList",
      requestType = com.google.protobuf.Empty.class,
      responseType = infres.ws.grpc.HotelListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.HotelListReply> getGetHotelListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, infres.ws.grpc.HotelListReply> getGetHotelListMethod;
    if ((getGetHotelListMethod = BookHotelRoomServiceGrpc.getGetHotelListMethod) == null) {
      synchronized (BookHotelRoomServiceGrpc.class) {
        if ((getGetHotelListMethod = BookHotelRoomServiceGrpc.getGetHotelListMethod) == null) {
          BookHotelRoomServiceGrpc.getGetHotelListMethod = getGetHotelListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, infres.ws.grpc.HotelListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHotelList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  infres.ws.grpc.HotelListReply.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomServiceMethodDescriptorSupplier("GetHotelList"))
              .build();
        }
      }
    }
    return getGetHotelListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookHotelRoomServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceStub>() {
        @java.lang.Override
        public BookHotelRoomServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomServiceStub(channel, callOptions);
        }
      };
    return BookHotelRoomServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookHotelRoomServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceBlockingStub>() {
        @java.lang.Override
        public BookHotelRoomServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomServiceBlockingStub(channel, callOptions);
        }
      };
    return BookHotelRoomServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookHotelRoomServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomServiceFutureStub>() {
        @java.lang.Override
        public BookHotelRoomServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomServiceFutureStub(channel, callOptions);
        }
      };
    return BookHotelRoomServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookHotelRoomServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoom(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.RoomReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomMethod(), responseObserver);
    }

    /**
     */
    public void getHotel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.HotelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelMethod(), responseObserver);
    }

    /**
     */
    public void getHotelList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.HotelListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                infres.ws.grpc.RoomReply>(
                  this, METHODID_GET_ROOM)))
          .addMethod(
            getGetHotelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                infres.ws.grpc.HotelReply>(
                  this, METHODID_GET_HOTEL)))
          .addMethod(
            getGetHotelListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                infres.ws.grpc.HotelListReply>(
                  this, METHODID_GET_HOTEL_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class BookHotelRoomServiceStub extends io.grpc.stub.AbstractAsyncStub<BookHotelRoomServiceStub> {
    private BookHotelRoomServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookHotelRoomServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRoom(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.RoomReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.HotelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.HotelListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookHotelRoomServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookHotelRoomServiceBlockingStub> {
    private BookHotelRoomServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookHotelRoomServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public infres.ws.grpc.RoomReply getRoom(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public infres.ws.grpc.HotelReply getHotel(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public infres.ws.grpc.HotelListReply getHotelList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookHotelRoomServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BookHotelRoomServiceFutureStub> {
    private BookHotelRoomServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookHotelRoomServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<infres.ws.grpc.RoomReply> getRoom(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<infres.ws.grpc.HotelReply> getHotel(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<infres.ws.grpc.HotelListReply> getHotelList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROOM = 0;
  private static final int METHODID_GET_HOTEL = 1;
  private static final int METHODID_GET_HOTEL_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookHotelRoomServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookHotelRoomServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROOM:
          serviceImpl.getRoom((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<infres.ws.grpc.RoomReply>) responseObserver);
          break;
        case METHODID_GET_HOTEL:
          serviceImpl.getHotel((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<infres.ws.grpc.HotelReply>) responseObserver);
          break;
        case METHODID_GET_HOTEL_LIST:
          serviceImpl.getHotelList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<infres.ws.grpc.HotelListReply>) responseObserver);
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

  private static abstract class BookHotelRoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookHotelRoomServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return infres.ws.grpc.Hotel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookHotelRoomService");
    }
  }

  private static final class BookHotelRoomServiceFileDescriptorSupplier
      extends BookHotelRoomServiceBaseDescriptorSupplier {
    BookHotelRoomServiceFileDescriptorSupplier() {}
  }

  private static final class BookHotelRoomServiceMethodDescriptorSupplier
      extends BookHotelRoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookHotelRoomServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookHotelRoomServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookHotelRoomServiceFileDescriptorSupplier())
              .addMethod(getGetRoomMethod())
              .addMethod(getGetHotelMethod())
              .addMethod(getGetHotelListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
