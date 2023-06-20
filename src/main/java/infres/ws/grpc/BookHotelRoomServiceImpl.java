package infres.ws.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class BookHotelRoomServiceImpl extends BookHotelRoomServiceGrpc.BookHotelRoomServiceImplBase {
    private int room;

    @Override
    public void getRoom(Empty request, StreamObserver<RoomReply> responseObserver) {
        RoomReply response = RoomReply.newBuilder()
                .setMessage(String.valueOf(room))
                .build();

        room++;

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHotel(Empty request, StreamObserver<HotelReply> responseObserver) {
        HotelReply response = HotelReply.newBuilder()
                .setName("Delfiesta")
                .setLocation("Marseille")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHotelList(Empty request, StreamObserver<HotelListReply> responseObserver) {
        HotelReply hotel1 = HotelReply.newBuilder()
                .setName("Coucou")
                .setLocation("Nulle part")
                .build();

        HotelReply hotel2 = HotelReply.newBuilder()
                .setName("Delfiesta")
                .setLocation("Marseille")
                .build();

        HotelListReply response = HotelListReply.newBuilder()
                .addList(hotel1)
                .addList(hotel2)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
