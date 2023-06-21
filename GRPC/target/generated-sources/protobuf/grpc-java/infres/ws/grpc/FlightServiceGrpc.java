package infres.ws.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: hotel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlightServiceGrpc {

  private FlightServiceGrpc() {}

  public static final String SERVICE_NAME = "infres.ws.grpc.FlightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.FlightReply> getGetFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlight",
      requestType = com.google.protobuf.Empty.class,
      responseType = infres.ws.grpc.FlightReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.FlightReply> getGetFlightMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, infres.ws.grpc.FlightReply> getGetFlightMethod;
    if ((getGetFlightMethod = FlightServiceGrpc.getGetFlightMethod) == null) {
      synchronized (FlightServiceGrpc.class) {
        if ((getGetFlightMethod = FlightServiceGrpc.getGetFlightMethod) == null) {
          FlightServiceGrpc.getGetFlightMethod = getGetFlightMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, infres.ws.grpc.FlightReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  infres.ws.grpc.FlightReply.getDefaultInstance()))
              .setSchemaDescriptor(new FlightServiceMethodDescriptorSupplier("GetFlight"))
              .build();
        }
      }
    }
    return getGetFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.FlightListReply> getGetFlightListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlightList",
      requestType = com.google.protobuf.Empty.class,
      responseType = infres.ws.grpc.FlightListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      infres.ws.grpc.FlightListReply> getGetFlightListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, infres.ws.grpc.FlightListReply> getGetFlightListMethod;
    if ((getGetFlightListMethod = FlightServiceGrpc.getGetFlightListMethod) == null) {
      synchronized (FlightServiceGrpc.class) {
        if ((getGetFlightListMethod = FlightServiceGrpc.getGetFlightListMethod) == null) {
          FlightServiceGrpc.getGetFlightListMethod = getGetFlightListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, infres.ws.grpc.FlightListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlightList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  infres.ws.grpc.FlightListReply.getDefaultInstance()))
              .setSchemaDescriptor(new FlightServiceMethodDescriptorSupplier("GetFlightList"))
              .build();
        }
      }
    }
    return getGetFlightListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlightServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightServiceStub>() {
        @java.lang.Override
        public FlightServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightServiceStub(channel, callOptions);
        }
      };
    return FlightServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightServiceBlockingStub>() {
        @java.lang.Override
        public FlightServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightServiceBlockingStub(channel, callOptions);
        }
      };
    return FlightServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightServiceFutureStub>() {
        @java.lang.Override
        public FlightServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightServiceFutureStub(channel, callOptions);
        }
      };
    return FlightServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FlightServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFlight(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.FlightReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightMethod(), responseObserver);
    }

    /**
     */
    public void getFlightList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.FlightListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFlightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                infres.ws.grpc.FlightReply>(
                  this, METHODID_GET_FLIGHT)))
          .addMethod(
            getGetFlightListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                infres.ws.grpc.FlightListReply>(
                  this, METHODID_GET_FLIGHT_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class FlightServiceStub extends io.grpc.stub.AbstractAsyncStub<FlightServiceStub> {
    private FlightServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFlight(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.FlightReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlightList(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<infres.ws.grpc.FlightListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FlightServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FlightServiceBlockingStub> {
    private FlightServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public infres.ws.grpc.FlightReply getFlight(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public infres.ws.grpc.FlightListReply getFlightList(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FlightServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FlightServiceFutureStub> {
    private FlightServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<infres.ws.grpc.FlightReply> getFlight(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<infres.ws.grpc.FlightListReply> getFlightList(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FLIGHT = 0;
  private static final int METHODID_GET_FLIGHT_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FlightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FLIGHT:
          serviceImpl.getFlight((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<infres.ws.grpc.FlightReply>) responseObserver);
          break;
        case METHODID_GET_FLIGHT_LIST:
          serviceImpl.getFlightList((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<infres.ws.grpc.FlightListReply>) responseObserver);
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

  private static abstract class FlightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return infres.ws.grpc.Hotel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlightService");
    }
  }

  private static final class FlightServiceFileDescriptorSupplier
      extends FlightServiceBaseDescriptorSupplier {
    FlightServiceFileDescriptorSupplier() {}
  }

  private static final class FlightServiceMethodDescriptorSupplier
      extends FlightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlightServiceFileDescriptorSupplier())
              .addMethod(getGetFlightMethod())
              .addMethod(getGetFlightListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
