package com.bibox.dex.proto.transaction;

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
    comments = "Source: chain-transaction/transaction.proto")
public final class TransactionServiceGrpc {

  private TransactionServiceGrpc() {}

  public static final String SERVICE_NAME = "transaction.api.TransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest,
      com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> getQueryTransactionFeeMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest,
      com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> getQueryTransactionFeeMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest, com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> getQueryTransactionFeeMethod;
    if ((getQueryTransactionFeeMethod = TransactionServiceGrpc.getQueryTransactionFeeMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getQueryTransactionFeeMethod = TransactionServiceGrpc.getQueryTransactionFeeMethod) == null) {
          TransactionServiceGrpc.getQueryTransactionFeeMethod = getQueryTransactionFeeMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest, com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transaction.api.TransactionService", "QueryTransactionFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("QueryTransactionFee"))
                  .build();
          }
        }
     }
     return getQueryTransactionFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest,
      com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> getCreateTransactionMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest,
      com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest, com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
          TransactionServiceGrpc.getCreateTransactionMethod = getCreateTransactionMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest, com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transaction.api.TransactionService", "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("CreateTransaction"))
                  .build();
          }
        }
     }
     return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest,
      com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> getCreateInvokeTransactionMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest,
      com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> getCreateInvokeTransactionMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest, com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> getCreateInvokeTransactionMethod;
    if ((getCreateInvokeTransactionMethod = TransactionServiceGrpc.getCreateInvokeTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getCreateInvokeTransactionMethod = TransactionServiceGrpc.getCreateInvokeTransactionMethod) == null) {
          TransactionServiceGrpc.getCreateInvokeTransactionMethod = getCreateInvokeTransactionMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest, com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transaction.api.TransactionService", "CreateInvokeTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("CreateInvokeTransaction"))
                  .build();
          }
        }
     }
     return getCreateInvokeTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest,
      com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> getBroadcastTransactionMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest,
      com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest, com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = TransactionServiceGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getBroadcastTransactionMethod = TransactionServiceGrpc.getBroadcastTransactionMethod) == null) {
          TransactionServiceGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest, com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transaction.api.TransactionService", "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("BroadcastTransaction"))
                  .build();
          }
        }
     }
     return getBroadcastTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionServiceStub newStub(io.grpc.Channel channel) {
    return new TransactionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TransactionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TransactionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TransactionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 查询转账手续费
     * </pre>
     */
    public void queryTransactionFee(com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryTransactionFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 生成交易
     * </pre>
     */
    public void createTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 生成合约调用交易
     * </pre>
     */
    public void createInvokeTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInvokeTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 向链节点广播交易
     * </pre>
     */
    public void broadcastTransaction(com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryTransactionFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest,
                com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse>(
                  this, METHODID_QUERY_TRANSACTION_FEE)))
          .addMethod(
            getCreateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest,
                com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getCreateInvokeTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest,
                com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse>(
                  this, METHODID_CREATE_INVOKE_TRANSACTION)))
          .addMethod(
            getBroadcastTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest,
                com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionServiceStub extends io.grpc.stub.AbstractStub<TransactionServiceStub> {
    private TransactionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询转账手续费
     * </pre>
     */
    public void queryTransactionFee(com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryTransactionFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 生成交易
     * </pre>
     */
    public void createTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 生成合约调用交易
     * </pre>
     */
    public void createInvokeTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInvokeTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 向链节点广播交易
     * </pre>
     */
    public void broadcastTransaction(com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionServiceBlockingStub extends io.grpc.stub.AbstractStub<TransactionServiceBlockingStub> {
    private TransactionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询转账手续费
     * </pre>
     */
    public com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse queryTransactionFee(com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryTransactionFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 生成交易
     * </pre>
     */
    public com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse createTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 生成合约调用交易
     * </pre>
     */
    public com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse createInvokeTransaction(com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateInvokeTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 向链节点广播交易
     * </pre>
     */
    public com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse broadcastTransaction(com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionServiceFutureStub extends io.grpc.stub.AbstractStub<TransactionServiceFutureStub> {
    private TransactionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询转账手续费
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse> queryTransactionFee(
        com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryTransactionFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 生成交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse> createTransaction(
        com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 生成合约调用交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse> createInvokeTransaction(
        com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInvokeTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 向链节点广播交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse> broadcastTransaction(
        com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_TRANSACTION_FEE = 0;
  private static final int METHODID_CREATE_TRANSACTION = 1;
  private static final int METHODID_CREATE_INVOKE_TRANSACTION = 2;
  private static final int METHODID_BROADCAST_TRANSACTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_TRANSACTION_FEE:
          serviceImpl.queryTransactionFee((com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.QueryTransactionFeeResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_CREATE_INVOKE_TRANSACTION:
          serviceImpl.createInvokeTransaction((com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.CreateInvokeTxResponse>) responseObserver);
          break;
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.transaction.TransactionProto.BroadcastTransactionResponse>) responseObserver);
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

  private static abstract class TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bibox.dex.proto.transaction.TransactionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionService");
    }
  }

  private static final class TransactionServiceFileDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier {
    TransactionServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionServiceMethodDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionServiceFileDescriptorSupplier())
              .addMethod(getQueryTransactionFeeMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateInvokeTransactionMethod())
              .addMethod(getBroadcastTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
