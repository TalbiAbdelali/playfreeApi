package com.ata.playFreeAPi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="player")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="pseudo", nullable = false)
    private String pseudo;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="phone", nullable = false)
    private String phone;
    @Column(name="soccerlevel", nullable = false)
    private String soccerlevel;
    @Column(name="availablity", nullable = false)
    private boolean availablity;
}
