package org.booking.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class FlightModel {
    @Id
    @Column
    private UUID id;
    @Column
    private String airline;
    @Column
    private String origin;
    @Column
    private String destination;

    public FlightModel(UUID id, String airline, String origin, String destination) {
        this.id = id;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
    }

    public FlightModel() {

    }

    public UUID getId() {
        return id;
    }

    public String getAirline() {
        return airline;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
