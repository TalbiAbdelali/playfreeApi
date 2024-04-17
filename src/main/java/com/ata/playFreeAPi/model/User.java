package com.ata.playFreeAPi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="player")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="pseudo", nullable = true)
    private String pseudo;
    @Column(name="email", nullable = true)
    private String email;
    @Column(name="phone", nullable = true)
    private String phone;
    @Column(name="soccerlevel", nullable = true)
    private String soccerlevel;
    @Column(name="availablity", nullable = true)
    private boolean availablity;

    public User() {
    }

    public User(String pseudo, String email, String phone, String soccerlevel, boolean availablity) {
        this.pseudo = pseudo;
        this.email = email;
        this.phone = phone;
        this.soccerlevel = soccerlevel;
        this.availablity = availablity;
    }
}
