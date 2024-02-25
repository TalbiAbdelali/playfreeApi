package com.ata.playFreeAPi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserDTO {
    private String pseudo;
    private String email;
    private String phone;
    private String soccerlevel;
    private boolean availablity;

    public UserDTO(String pseudo, String email, String phone, String soccerlevel, boolean availablity) {
        this.pseudo = pseudo;
        this.email = email;
        this.phone = phone;
        this.soccerlevel = soccerlevel;
        this.availablity = availablity;
    }
}
