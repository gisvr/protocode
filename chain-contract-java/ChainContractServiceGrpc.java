package com.bibox.dex.proto.contract;

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
    comments = "Source: chain-contract/contract.proto")
public final class ChainContractServiceGrpc {

  private ChainContractServiceGrpc() {}

  public static final String SERVICE_NAME = "contract.api.ChainContractService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.InvokeRequest,
      com.bibox.dex.proto.contract.ContractProto.InvokeResponse> getInvokeMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.InvokeRequest,
      com.bibox.dex.proto.contract.ContractProto.InvokeResponse> getInvokeMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.InvokeRequest, com.bibox.dex.proto.contract.ContractProto.InvokeResponse> getInvokeMethod;
    if ((getInvokeMethod = ChainContractServiceGrpc.getInvokeMethod) == null) {
      synchronized (ChainContractServiceGrpc.class) {
        if ((getInvokeMethod = ChainContractServiceGrpc.getInvokeMethod) == null) {
          ChainContractServiceGrpc.getInvokeMethod = getInvokeMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.contract.ContractProto.InvokeRequest, com.bibox.dex.proto.contract.ContractProto.InvokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contract.api.ChainContractService", "Invoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.InvokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.InvokeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainContractServiceMethodDescriptorSupplier("Invoke"))
                  .build();
          }
        }
     }
     return getInvokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.TransferRequest,
      com.bibox.dex.proto.contract.ContractProto.TransferResponse> getTransferMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.TransferRequest,
      com.bibox.dex.proto.contract.ContractProto.TransferResponse> getTransferMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.TransferRequest, com.bibox.dex.proto.contract.ContractProto.TransferResponse> getTransferMethod;
    if ((getTransferMethod = ChainContractServiceGrpc.getTransferMethod) == null) {
      synchronized (ChainContractServiceGrpc.class) {
        if ((getTransferMethod = ChainContractServiceGrpc.getTransferMethod) == null) {
          ChainContractServiceGrpc.getTransferMethod = getTransferMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.contract.ContractProto.TransferRequest, com.bibox.dex.proto.contract.ContractProto.TransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contract.api.ChainContractService", "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.TransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.TransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainContractServiceMethodDescriptorSupplier("Transfer"))
                  .build();
          }
        }
     }
     return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest,
      com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> getGetBalanceMethod;

  public static io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest,
      com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest, com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = ChainContractServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (ChainContractServiceGrpc.class) {
        if ((getGetBalanceMethod = ChainContractServiceGrpc.getGetBalanceMethod) == null) {
          ChainContractServiceGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest, com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "contract.api.ChainContractService", "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChainContractServiceMethodDescriptorSupplier("GetBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChainContractServiceStub newStub(io.grpc.Channel channel) {
    return new ChainContractServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChainContractServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChainContractServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChainContractServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChainContractServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChainContractServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 通用合约操作
     * </pre>
     */
    public void invoke(com.bibox.dex.proto.contract.ContractProto.InvokeRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.InvokeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInvokeMethod(), responseObserver);
    }

    /**
     * <pre>
     *transfer
     * </pre>
     */
    public void transfer(com.bibox.dex.proto.contract.ContractProto.TransferRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.TransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     *GetBalance
     * </pre>
     */
    public void getBalance(com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInvokeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.contract.ContractProto.InvokeRequest,
                com.bibox.dex.proto.contract.ContractProto.InvokeResponse>(
                  this, METHODID_INVOKE)))
          .addMethod(
            getTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.contract.ContractProto.TransferRequest,
                com.bibox.dex.proto.contract.ContractProto.TransferResponse>(
                  this, METHODID_TRANSFER)))
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest,
                com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse>(
                  this, METHODID_GET_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class ChainContractServiceStub extends io.grpc.stub.AbstractStub<ChainContractServiceStub> {
    private ChainContractServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainContractServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainContractServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainContractServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 通用合约操作
     * </pre>
     */
    public void invoke(com.bibox.dex.proto.contract.ContractProto.InvokeRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.InvokeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInvokeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *transfer
     * </pre>
     */
    public void transfer(com.bibox.dex.proto.contract.ContractProto.TransferRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.TransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *GetBalance
     * </pre>
     */
    public void getBalance(com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChainContractServiceBlockingStub extends io.grpc.stub.AbstractStub<ChainContractServiceBlockingStub> {
    private ChainContractServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainContractServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainContractServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainContractServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 通用合约操作
     * </pre>
     */
    public com.bibox.dex.proto.contract.ContractProto.InvokeResponse invoke(com.bibox.dex.proto.contract.ContractProto.InvokeRequest request) {
      return blockingUnaryCall(
          getChannel(), getInvokeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *transfer
     * </pre>
     */
    public com.bibox.dex.proto.contract.ContractProto.TransferResponse transfer(com.bibox.dex.proto.contract.ContractProto.TransferRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *GetBalance
     * </pre>
     */
    public com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse getBalance(com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChainContractServiceFutureStub extends io.grpc.stub.AbstractStub<ChainContractServiceFutureStub> {
    private ChainContractServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChainContractServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChainContractServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChainContractServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 通用合约操作
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.contract.ContractProto.InvokeResponse> invoke(
        com.bibox.dex.proto.contract.ContractProto.InvokeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInvokeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *transfer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.contract.ContractProto.TransferResponse> transfer(
        com.bibox.dex.proto.contract.ContractProto.TransferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *GetBalance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse> getBalance(
        com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INVOKE = 0;
  private static final int METHODID_TRANSFER = 1;
  private static final int METHODID_GET_BALANCE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChainContractServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChainContractServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVOKE:
          serviceImpl.invoke((com.bibox.dex.proto.contract.ContractProto.InvokeRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.InvokeResponse>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((com.bibox.dex.proto.contract.ContractProto.TransferRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.TransferResponse>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.bibox.dex.proto.contract.ContractProto.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.bibox.dex.proto.contract.ContractProto.GetBalanceResponse>) responseObserver);
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

  private static abstract class ChainContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChainContractServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bibox.dex.proto.contract.ContractProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChainContractService");
    }
  }

  private static final class ChainContractServiceFileDescriptorSupplier
      extends ChainContractServiceBaseDescriptorSupplier {
    ChainContractServiceFileDescriptorSupplier() {}
  }

  private static final class ChainContractServiceMethodDescriptorSupplier
      extends ChainContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChainContractServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChainContractServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChainContractServiceFileDescriptorSupplier())
              .addMethod(getInvokeMethod())
              .addMethod(getTransferMethod())
              .addMethod(getGetBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
