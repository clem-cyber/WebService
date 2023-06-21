package org.booking.api.controller;

import com.google.protobuf.Empty;
import infres.ws.grpc.FlightListReply;
import infres.ws.grpc.FlightServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.booking.api.model.FlightModel;
import org.booking.api.model.mapper.FlightMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @CrossOrigin(origins = "*")
    @GetMapping("/flights")
    public ResponseEntity<List<FlightModel>> getFlights() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("159.31.121.201", 8081)
                .usePlaintext()
                .build();
        FlightServiceGrpc.FlightServiceBlockingStub stub = FlightServiceGrpc.newBlockingStub(channel);
        FlightListReply flightsResponse = stub.getFlightList(Empty.newBuilder().build());
        List<FlightModel> flights = flightsResponse.getListList().stream().map(FlightMapper::map).toList();
        channel.shutdown();
        return ResponseEntity.ok(flights);
    }
}