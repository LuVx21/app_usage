package org.luvx.grpc.service.sdk.client;

import org.luvx.grpc.service.proto.user.UserInfoGrpc;
import org.luvx.grpc.service.proto.user.UserInfoGrpc.UserInfoBlockingStub;
import org.luvx.grpc.service.proto.user.UserOperateGrpc;
import org.luvx.grpc.service.proto.user.UserOperateGrpc.UserOperateBlockingStub;
import org.luvx.grpc.service.proto.user.UserRequest;
import org.luvx.grpc.service.proto.user.UserResponse;
import org.luvx.grpc.service.sdk.RpcConfig;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserRpcClientImpl implements UserRpcClient {
    private static final UserInfoBlockingStub stub;
    private static final UserOperateBlockingStub stub1;

    static {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", RpcConfig.port)
                .usePlaintext()
                .build();
        stub = UserInfoGrpc.newBlockingStub(channel);
        stub1 = UserOperateGrpc.newBlockingStub(channel);
    }

    @Override
    public UserResponse selectUserInfo(UserRequest request) {
        return stub.selectUserInfo(request);
    }

    @Override
    public UserResponse updateUser(UserRequest request) {
        return stub.updateUser(request);
    }

    @Override
    public UserResponse updatePassword(UserRequest request) {
        return stub1.updatePassword(request);
    }
}