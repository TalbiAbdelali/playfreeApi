package com.ata.playFreeAPi.model;

import jakarta.persistence.*;

@Table
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="number", nullable = false)
    private String number;
    @Column(name="location", nullable = false)
    private String color;
    @Column(name="availablity", nullable = false)
    private boolean availablity;

}
