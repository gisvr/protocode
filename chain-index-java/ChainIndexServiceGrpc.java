package com.bibox.dex.proto.index;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.3-SNAPSHOT)",
    comments = "Source: chain-index/index.proto")
public final class ChainIndexServiceGrpc {

  private ChainIndexServiceGrpc() {}

  public static final String SERVICE_NAME = "chainindex.api.ChainIndexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest,
      com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> getSubscribeEventMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest,
      com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> getSubscribeEventMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest, com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> getSubscribeEventMethod;
    if ((getSubscribeEventMethod = ChainIndexServiceGrpc.getSubscribeEventMethod) == null) {
      synchronized (ChainIndexServiceGrpc.class) {
        if ((getSubscribeEventMethod = ChainIndexServiceGrpc.getSubscribeEventMethod) == null) {
          ChainIndexServiceGrpc.getSubscribeEventMethod = getSubscribeEventMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest, com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chainindex.api.ChainIndexService", "SubscribeEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainIndexServiceMethodDescriptorSupplier("SubscribeEvent"))
                  .build();
          }
        }
     }
     return getSubscribeEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChainIndexServiceStub newStub(io.grpc.Channel channel) {
    return new ChainIndexServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChainIndexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChainIndexServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChainIndexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChainIndexServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChainIndexServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *订阅事件
     * </pre>
     */
    public void subscribeEvent(com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest,
                com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse>(
                  this, METHODID_SUBSCRIBE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class ChainIndexServiceStub extends io.grpc.stub.AbstractStub<ChainIndexServiceStub> {
    private ChainIndexServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainIndexServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainIndexServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainIndexServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *订阅事件
     * </pre>
     */
    public void subscribeEvent(com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChainIndexServiceBlockingStub extends io.grpc.stub.AbstractStub<ChainIndexServiceBlockingStub> {
    private ChainIndexServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainIndexServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainIndexServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainIndexServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *订阅事件
     * </pre>
     */
    public java.util.Iterator<com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse> subscribeEvent(
        com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChainIndexServiceFutureStub extends io.grpc.stub.AbstractStub<ChainIndexServiceFutureStub> {
    private ChainIndexServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainIndexServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainIndexServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainIndexServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE_EVENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChainIndexServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChainIndexServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_EVENT:
          serviceImpl.subscribeEvent((com.bibox.dex.proto.index.IndexProto.SubscribeEventRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.index.IndexProto.SubscribeEventReponse>) responseObserver);
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

  private static abstract class ChainIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChainIndexServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bibox.dex.proto.index.IndexProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChainIndexService");
    }
  }

  private static final class ChainIndexServiceFileDescriptorSupplier
      extends ChainIndexServiceBaseDescriptorSupplier {
    ChainIndexServiceFileDescriptorSupplier() {}
  }

  private static final class ChainIndexServiceMethodDescriptorSupplier
      extends ChainIndexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChainIndexServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChainIndexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChainIndexServiceFileDescriptorSupplier())
              .addMethod(getSubscribeEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
