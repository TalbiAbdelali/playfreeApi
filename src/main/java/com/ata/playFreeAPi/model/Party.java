package com.ata.playFreeAPi.model;

import jakarta.persistence.*;

import java.util.Date;

@Table
@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="date", nullable = false)
    private Date date;
}
