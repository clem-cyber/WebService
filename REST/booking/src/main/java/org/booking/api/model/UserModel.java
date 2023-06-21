package org.booking.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UserModel {
    @Id
    @Column
    private UUID id;
    @Column
    private String name;
    @Column
    private String mail;

    public UserModel(UUID id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public UserModel() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
