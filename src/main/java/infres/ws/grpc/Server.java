package infres.ws.grpc;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws InterruptedException, IOException {
        io.grpc.Server server = ServerBuilder
                .forPort(8081)
                .addService(new BookHotelRoomServiceImpl())
                .addService(new FlightServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}
