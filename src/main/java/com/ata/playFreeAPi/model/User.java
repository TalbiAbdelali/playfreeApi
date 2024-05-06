package com.ata.playFreeAPi.model;

import com.ata.playFreeAPi.enums.Level;
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
    @Column(name="pseudo", nullable = false)
    private String pseudo;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="birthday", nullable = true)
    private String birthday;
    @Column(name="phone", nullable = false)
    private String phone;
    @Column(name="soccerlevel")
    private String soccerLevel;
    @Column(name="availablity", nullable = false)
    private boolean available;
    /*@Lob
    @Column(name="profileImage")
    private byte[] profileImage;*/

    public User() {
    }

    public User(String pseudo, String email, String birthday, String phone, Level soccerLevel, boolean available) {
        this.pseudo = pseudo;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.soccerLevel = soccerLevel.toString();
        this.available = available;
    }
}
