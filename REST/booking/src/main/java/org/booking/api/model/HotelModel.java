package org.booking.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class HotelModel {
    @Id
    @Column
    private UUID id;
    @Column
    private String name;
    @Column
    private String location;

    public HotelModel(UUID id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public HotelModel() {

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
