package infres.ws.grpc;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        BookHotelRoomServiceGrpc.BookHotelRoomServiceBlockingStub stub = BookHotelRoomServiceGrpc.newBlockingStub(channel);

        RoomReply roomResponse = stub.getRoom(Empty.newBuilder().build());

        System.out.println(roomResponse.getMessage());

        channel.shutdown();
    }
}
