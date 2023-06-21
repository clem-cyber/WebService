package org.booking.api.model.mapper;

import infres.ws.grpc.HotelReply;
import org.booking.api.model.HotelModel;

import java.util.UUID;

public class HotelMapper {
    public static HotelModel map(HotelReply hotelServer) {
        return new HotelModel(UUID.randomUUID(), hotelServer.getName(), hotelServer.getLocation());
    }
}
