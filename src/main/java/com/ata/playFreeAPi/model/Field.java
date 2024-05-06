package com.ata.playFreeAPi.model;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="location", nullable = false)
    private String location;
    @Column(name="availability", nullable = false)
    private boolean availability;
    @Column(name="name", nullable = false)
    private String name;

    public Field() {
    }

    public Field(long id, String location, boolean availability, String name) {
        this.id = id;
        this.location = location;
        this.availability = availability;
        this.name = name;
    }
}
