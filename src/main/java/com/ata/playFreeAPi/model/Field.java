package com.ata.playFreeAPi.model;

import jakarta.persistence.*;

@Table
@Entity
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="location", nullable = false)
    private String location;
    @Column(name="availablity", nullable = false)
    private boolean availablity;
    @Column(name="name", nullable = false)
    private String name;

}
