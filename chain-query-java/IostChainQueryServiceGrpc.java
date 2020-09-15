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
    comments = "Source: chain-query/iost-query.proto")
public final class IostChainQueryServiceGrpc {

  private IostChainQueryServiceGrpc() {}

  public static final String SERVICE_NAME = "chainquery.api.IostChainQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> getGetAccountMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = IostChainQueryServiceGrpc.getGetAccountMethod) == null) {
      synchronized (IostChainQueryServiceGrpc.class) {
        if ((getGetAccountMethod = IostChainQueryServiceGrpc.getGetAccountMethod) == null) {
          IostChainQueryServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.IostChainQueryService", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IostChainQueryServiceMethodDescriptorSupplier("GetAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> getGetAccountByPubMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> getGetAccountByPubMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> getGetAccountByPubMethod;
    if ((getGetAccountByPubMethod = IostChainQueryServiceGrpc.getGetAccountByPubMethod) == null) {
      synchronized (IostChainQueryServiceGrpc.class) {
        if ((getGetAccountByPubMethod = IostChainQueryServiceGrpc.getGetAccountByPubMethod) == null) {
          IostChainQueryServiceGrpc.getGetAccountByPubMethod = getGetAccountByPubMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.IostChainQueryService", "GetAccountByPub"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IostChainQueryServiceMethodDescriptorSupplier("GetAccountByPub"))
                  .build();
          }
        }
     }
     return getGetAccountByPubMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> getGetRAMInfoMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> getGetRAMInfoMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest, com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> getGetRAMInfoMethod;
    if ((getGetRAMInfoMethod = IostChainQueryServiceGrpc.getGetRAMInfoMethod) == null) {
      synchronized (IostChainQueryServiceGrpc.class) {
        if ((getGetRAMInfoMethod = IostChainQueryServiceGrpc.getGetRAMInfoMethod) == null) {
          IostChainQueryServiceGrpc.getGetRAMInfoMethod = getGetRAMInfoMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest, com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.IostChainQueryService", "GetRAMInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IostChainQueryServiceMethodDescriptorSupplier("GetRAMInfo"))
                  .build();
          }
        }
     }
     return getGetRAMInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> getGetGasRatioMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> getGetGasRatioMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest, com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> getGetGasRatioMethod;
    if ((getGetGasRatioMethod = IostChainQueryServiceGrpc.getGetGasRatioMethod) == null) {
      synchronized (IostChainQueryServiceGrpc.class) {
        if ((getGetGasRatioMethod = IostChainQueryServiceGrpc.getGetGasRatioMethod) == null) {
          IostChainQueryServiceGrpc.getGetGasRatioMethod = getGetGasRatioMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest, com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.IostChainQueryService", "GetGasRatio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IostChainQueryServiceMethodDescriptorSupplier("GetGasRatio"))
                  .build();
          }
        }
     }
     return getGetGasRatioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> getGetContractStorageMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest,
      com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> getGetContractStorageMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> getGetContractStorageMethod;
    if ((getGetContractStorageMethod = IostChainQueryServiceGrpc.getGetContractStorageMethod) == null) {
      synchronized (IostChainQueryServiceGrpc.class) {
        if ((getGetContractStorageMethod = IostChainQueryServiceGrpc.getGetContractStorageMethod) == null) {
          IostChainQueryServiceGrpc.getGetContractStorageMethod = getGetContractStorageMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest, com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chainquery.api.IostChainQueryService", "GetContractStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IostChainQueryServiceMethodDescriptorSupplier("GetContractStorage"))
                  .build();
          }
        }
     }
     return getGetContractStorageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IostChainQueryServiceStub newStub(io.grpc.Channel channel) {
    return new IostChainQueryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IostChainQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IostChainQueryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IostChainQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IostChainQueryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IostChainQueryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * get account
     * </pre>
     */
    public void getAccount(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * get account by pub_key
     * </pre>
     */
    public void getAccountByPub(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountByPubMethod(), responseObserver);
    }

    /**
     * <pre>
     * get current blockchain ram information
     * </pre>
     */
    public void getRAMInfo(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRAMInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * get gas ratio infomation
     * </pre>
     */
    public void getGasRatio(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGasRatioMethod(), responseObserver);
    }

    /**
     * <pre>
     * get contract storage
     * </pre>
     */
    public void getContractStorage(com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContractStorageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest,
                com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountByPubMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest,
                com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse>(
                  this, METHODID_GET_ACCOUNT_BY_PUB)))
          .addMethod(
            getGetRAMInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
                com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse>(
                  this, METHODID_GET_RAMINFO)))
          .addMethod(
            getGetGasRatioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest,
                com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse>(
                  this, METHODID_GET_GAS_RATIO)))
          .addMethod(
            getGetContractStorageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest,
                com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse>(
                  this, METHODID_GET_CONTRACT_STORAGE)))
          .build();
    }
  }

  /**
   */
  public static final class IostChainQueryServiceStub extends io.grpc.stub.AbstractStub<IostChainQueryServiceStub> {
    private IostChainQueryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IostChainQueryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IostChainQueryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IostChainQueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * get account
     * </pre>
     */
    public void getAccount(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get account by pub_key
     * </pre>
     */
    public void getAccountByPub(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountByPubMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get current blockchain ram information
     * </pre>
     */
    public void getRAMInfo(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRAMInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get gas ratio infomation
     * </pre>
     */
    public void getGasRatio(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGasRatioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get contract storage
     * </pre>
     */
    public void getContractStorage(com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContractStorageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IostChainQueryServiceBlockingStub extends io.grpc.stub.AbstractStub<IostChainQueryServiceBlockingStub> {
    private IostChainQueryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IostChainQueryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IostChainQueryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IostChainQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get account
     * </pre>
     */
    public com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse getAccount(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get account by pub_key
     * </pre>
     */
    public com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse getAccountByPub(com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountByPubMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get current blockchain ram information
     * </pre>
     */
    public com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse getRAMInfo(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRAMInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get gas ratio infomation
     * </pre>
     */
    public com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse getGasRatio(com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGasRatioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get contract storage
     * </pre>
     */
    public com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse getContractStorage(com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContractStorageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IostChainQueryServiceFutureStub extends io.grpc.stub.AbstractStub<IostChainQueryServiceFutureStub> {
    private IostChainQueryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IostChainQueryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IostChainQueryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IostChainQueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse> getAccount(
        com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get account by pub_key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse> getAccountByPub(
        com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountByPubMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get current blockchain ram information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse> getRAMInfo(
        com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRAMInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get gas ratio infomation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse> getGasRatio(
        com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGasRatioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get contract storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse> getContractStorage(
        com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContractStorageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT_BY_PUB = 1;
  private static final int METHODID_GET_RAMINFO = 2;
  private static final int METHODID_GET_GAS_RATIO = 3;
  private static final int METHODID_GET_CONTRACT_STORAGE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IostChainQueryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IostChainQueryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.bibox.dex.proto.query.IOSTQueryProto.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_PUB:
          serviceImpl.getAccountByPub((com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetAccountByPubResponse>) responseObserver);
          break;
        case METHODID_GET_RAMINFO:
          serviceImpl.getRAMInfo((com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.RAMInfoResponse>) responseObserver);
          break;
        case METHODID_GET_GAS_RATIO:
          serviceImpl.getGasRatio((com.bibox.dex.proto.query.IOSTQueryProto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GasRatioResponse>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_STORAGE:
          serviceImpl.getContractStorage((com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.query.IOSTQueryProto.GetContractStorageResponse>) responseObserver);
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

  private static abstract class IostChainQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IostChainQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bibox.dex.proto.query.IOSTQueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IostChainQueryService");
    }
  }

  private static final class IostChainQueryServiceFileDescriptorSupplier
      extends IostChainQueryServiceBaseDescriptorSupplier {
    IostChainQueryServiceFileDescriptorSupplier() {}
  }

  private static final class IostChainQueryServiceMethodDescriptorSupplier
      extends IostChainQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IostChainQueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IostChainQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IostChainQueryServiceFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByPubMethod())
              .addMethod(getGetRAMInfoMethod())
              .addMethod(getGetGasRatioMethod())
              .addMethod(getGetContractStorageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
