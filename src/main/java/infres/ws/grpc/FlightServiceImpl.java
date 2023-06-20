package infres.ws.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class FlightServiceImpl extends FlightServiceGrpc.FlightServiceImplBase {

    @Override
    public void getFlight(Empty request, StreamObserver<FlightReply> responseObserver) {
        FlightReply response = FlightReply.newBuilder()
                .setAirline("Easyjet")
                .setOrigin("Marseille")
                .setDestination("Paris")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getFlightList(Empty request, StreamObserver<FlightListReply> responseObserver) {
        FlightReply flight1 = FlightReply.newBuilder()
                .setAirline("Easyjet")
                .setOrigin("Marseille")
                .setDestination("Paris")
                .build();

        FlightReply flight2 = FlightReply.newBuilder()
                .setAirline("AirFrance")
                .setOrigin("Toulouse")
                .setDestination("Marseille")
                .build();

        FlightListReply response = FlightListReply.newBuilder()
                .addList(flight1)
                .addList(flight2)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
