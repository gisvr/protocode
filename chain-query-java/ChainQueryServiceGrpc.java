package com.bibox.dex.proto.query;

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
    comments = "Source: chain-query/query.proto")
public final class ChainQueryServiceGrpc {

  private ChainQueryServiceGrpc() {}

  public static final String SERVICE_NAME = "chainquery.api.ChainQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetBalanceRequest,
      com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> getGetBalanceMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetBalanceRequest,
      com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetBalanceRequest, com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = ChainQueryServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (ChainQueryServiceGrpc.class) {
        if ((getGetBalanceMethod = ChainQueryServiceGrpc.getGetBalanceMethod) == null) {
          ChainQueryServiceGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.QueryProto.GetBalanceRequest, com.bibox.dex.proto.query.QueryProto.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.ChainQueryService", "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.GetBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainQueryServiceMethodDescriptorSupplier("GetBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListUnspentRequest,
      com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> getListUnspentMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListUnspentRequest,
      com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> getListUnspentMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListUnspentRequest, com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> getListUnspentMethod;
    if ((getListUnspentMethod = ChainQueryServiceGrpc.getListUnspentMethod) == null) {
      synchronized (ChainQueryServiceGrpc.class) {
        if ((getListUnspentMethod = ChainQueryServiceGrpc.getListUnspentMethod) == null) {
          ChainQueryServiceGrpc.getListUnspentMethod = getListUnspentMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.QueryProto.ListUnspentRequest, com.bibox.dex.proto.query.QueryProto.ListUnspentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.ChainQueryService", "ListUnspent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.ListUnspentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.ListUnspentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainQueryServiceMethodDescriptorSupplier("ListUnspent"))
                  .build();
          }
        }
     }
     return getListUnspentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListTransactionRequest,
      com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> getListTransactionMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListTransactionRequest,
      com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> getListTransactionMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.ListTransactionRequest, com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> getListTransactionMethod;
    if ((getListTransactionMethod = ChainQueryServiceGrpc.getListTransactionMethod) == null) {
      synchronized (ChainQueryServiceGrpc.class) {
        if ((getListTransactionMethod = ChainQueryServiceGrpc.getListTransactionMethod) == null) {
          ChainQueryServiceGrpc.getListTransactionMethod = getListTransactionMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.QueryProto.ListTransactionRequest, com.bibox.dex.proto.query.QueryProto.ListTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.ChainQueryService", "ListTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.ListTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.ListTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainQueryServiceMethodDescriptorSupplier("ListTransaction"))
                  .build();
          }
        }
     }
     return getListTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest,
      com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> getQueryTransactionMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest,
      com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> getQueryTransactionMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest, com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> getQueryTransactionMethod;
    if ((getQueryTransactionMethod = ChainQueryServiceGrpc.getQueryTransactionMethod) == null) {
      synchronized (ChainQueryServiceGrpc.class) {
        if ((getQueryTransactionMethod = ChainQueryServiceGrpc.getQueryTransactionMethod) == null) {
          ChainQueryServiceGrpc.getQueryTransactionMethod = getQueryTransactionMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest, com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.ChainQueryService", "QueryTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainQueryServiceMethodDescriptorSupplier("QueryTransaction"))
                  .build();
          }
        }
     }
     return getQueryTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest,
      com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> getGetTokensBalanceMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest,
      com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> getGetTokensBalanceMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest, com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> getGetTokensBalanceMethod;
    if ((getGetTokensBalanceMethod = ChainQueryServiceGrpc.getGetTokensBalanceMethod) == null) {
      synchronized (ChainQueryServiceGrpc.class) {
        if ((getGetTokensBalanceMethod = ChainQueryServiceGrpc.getGetTokensBalanceMethod) == null) {
          ChainQueryServiceGrpc.getGetTokensBalanceMethod = getGetTokensBalanceMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest, com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.ChainQueryService", "GetTokensBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainQueryServiceMethodDescriptorSupplier("GetTokensBalance"))
                  .build();
          }
        }
     }
     return getGetTokensBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChainQueryServiceStub newStub(io.grpc.Channel channel) {
    return new ChainQueryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChainQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChainQueryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChainQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChainQueryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChainQueryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取钱包余额
     * </pre>
     */
    public void getBalance(com.bibox.dex.proto.query.QueryProto.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取钱包全部未花费的UTXO
     * </pre>
     */
    public void listUnspent(com.bibox.dex.proto.query.QueryProto.ListUnspentRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUnspentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取钱包全部的交易
     * </pre>
     */
    public void listTransaction(com.bibox.dex.proto.query.QueryProto.ListTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询交易
     * </pre>
     */
    public void queryTransaction(com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询钱包拥有的代币种类及数量
     * </pre>
     */
    public void getTokensBalance(com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTokensBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.QueryProto.GetBalanceRequest,
                com.bibox.dex.proto.query.QueryProto.GetBalanceResponse>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getListUnspentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.QueryProto.ListUnspentRequest,
                com.bibox.dex.proto.query.QueryProto.ListUnspentResponse>(
                  this, METHODID_LIST_UNSPENT)))
          .addMethod(
            getListTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.QueryProto.ListTransactionRequest,
                com.bibox.dex.proto.query.QueryProto.ListTransactionResponse>(
                  this, METHODID_LIST_TRANSACTION)))
          .addMethod(
            getQueryTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest,
                com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse>(
                  this, METHODID_QUERY_TRANSACTION)))
          .addMethod(
            getGetTokensBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest,
                com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse>(
                  this, METHODID_GET_TOKENS_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class ChainQueryServiceStub extends io.grpc.stub.AbstractStub<ChainQueryServiceStub> {
    private ChainQueryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainQueryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainQueryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainQueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取钱包余额
     * </pre>
     */
    public void getBalance(com.bibox.dex.proto.query.QueryProto.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取钱包全部未花费的UTXO
     * </pre>
     */
    public void listUnspent(com.bibox.dex.proto.query.QueryProto.ListUnspentRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUnspentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取钱包全部的交易
     * </pre>
     */
    public void listTransaction(com.bibox.dex.proto.query.QueryProto.ListTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询交易
     * </pre>
     */
    public void queryTransaction(com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询钱包拥有的代币种类及数量
     * </pre>
     */
    public void getTokensBalance(com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTokensBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChainQueryServiceBlockingStub extends io.grpc.stub.AbstractStub<ChainQueryServiceBlockingStub> {
    private ChainQueryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainQueryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainQueryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取钱包余额
     * </pre>
     */
    public com.bibox.dex.proto.query.QueryProto.GetBalanceResponse getBalance(com.bibox.dex.proto.query.QueryProto.GetBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取钱包全部未花费的UTXO
     * </pre>
     */
    public com.bibox.dex.proto.query.QueryProto.ListUnspentResponse listUnspent(com.bibox.dex.proto.query.QueryProto.ListUnspentRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUnspentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取钱包全部的交易
     * </pre>
     */
    public com.bibox.dex.proto.query.QueryProto.ListTransactionResponse listTransaction(com.bibox.dex.proto.query.QueryProto.ListTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询交易
     * </pre>
     */
    public com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse queryTransaction(com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询钱包拥有的代币种类及数量
     * </pre>
     */
    public com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse getTokensBalance(com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTokensBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChainQueryServiceFutureStub extends io.grpc.stub.AbstractStub<ChainQueryServiceFutureStub> {
    private ChainQueryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainQueryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainQueryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainQueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取钱包余额
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.QueryProto.GetBalanceResponse> getBalance(
        com.bibox.dex.proto.query.QueryProto.GetBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取钱包全部未花费的UTXO
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.QueryProto.ListUnspentResponse> listUnspent(
        com.bibox.dex.proto.query.QueryProto.ListUnspentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUnspentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取钱包全部的交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.QueryProto.ListTransactionResponse> listTransaction(
        com.bibox.dex.proto.query.QueryProto.ListTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse> queryTransaction(
        com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询钱包拥有的代币种类及数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse> getTokensBalance(
        com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTokensBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_LIST_UNSPENT = 1;
  private static final int METHODID_LIST_TRANSACTION = 2;
  private static final int METHODID_QUERY_TRANSACTION = 3;
  private static final int METHODID_GET_TOKENS_BALANCE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChainQueryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChainQueryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.bibox.dex.proto.query.QueryProto.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetBalanceResponse>) responseObserver);
          break;
        case METHODID_LIST_UNSPENT:
          serviceImpl.listUnspent((com.bibox.dex.proto.query.QueryProto.ListUnspentRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListUnspentResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTION:
          serviceImpl.listTransaction((com.bibox.dex.proto.query.QueryProto.ListTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.ListTransactionResponse>) responseObserver);
          break;
        case METHODID_QUERY_TRANSACTION:
          serviceImpl.queryTransaction((com.bibox.dex.proto.query.QueryProto.QueryTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.QueryTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TOKENS_BALANCE:
          serviceImpl.getTokensBalance((com.bibox.dex.proto.query.QueryProto.GetTokensBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.QueryProto.GetTokensBalanceResponse>) responseObserver);
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

  private static abstract class ChainQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChainQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bibox.dex.proto.query.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChainQueryService");
    }
  }

  private static final class ChainQueryServiceFileDescriptorSupplier
      extends ChainQueryServiceBaseDescriptorSupplier {
    ChainQueryServiceFileDescriptorSupplier() {}
  }

  private static final class ChainQueryServiceMethodDescriptorSupplier
      extends ChainQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChainQueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChainQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChainQueryServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getListUnspentMethod())
              .addMethod(getListTransactionMethod())
              .addMethod(getQueryTransactionMethod())
              .addMethod(getGetTokensBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
