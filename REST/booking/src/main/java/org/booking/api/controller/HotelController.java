package org.booking.api.controller;

import com.google.protobuf.Empty;
import infres.ws.grpc.BookHotelRoomServiceGrpc;
import infres.ws.grpc.HotelListReply;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.booking.api.model.HotelModel;
import org.booking.api.model.mapper.HotelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HotelController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hotels")
    public ResponseEntity<List<HotelModel>> getHotels() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8081)
                .usePlaintext()
                .build();
        BookHotelRoomServiceGrpc.BookHotelRoomServiceBlockingStub stub = BookHotelRoomServiceGrpc.newBlockingStub(channel);
        HotelListReply hotelsResponse = stub.getHotelList(Empty.newBuilder().build());
        List<HotelModel> hotels = hotelsResponse.getListList().stream().map(HotelMapper::map).toList();
        channel.shutdown();
        return ResponseEntity.ok(hotels);
    }
}
