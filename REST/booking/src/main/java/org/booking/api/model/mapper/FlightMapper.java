package org.booking.api.model.mapper;

import infres.ws.grpc.FlightReply;
import infres.ws.grpc.HotelReply;
import org.booking.api.model.FlightModel;
import org.booking.api.model.HotelModel;

import java.util.UUID;

public class FlightMapper {
    public static FlightModel map(FlightReply flightServer) {
        return new FlightModel(UUID.randomUUID(), flightServer.getAirline(), flightServer.getOrigin(), flightServer.getDestination());
    }
}
