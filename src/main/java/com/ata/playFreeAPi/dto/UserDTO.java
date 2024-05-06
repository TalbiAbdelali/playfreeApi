package com.ata.playFreeAPi.dto;

import com.ata.playFreeAPi.enums.Level;
import lombok.Data;

@Data
public class UserDTO {
    private String pseudo;
    private String email;
    private String phone;
    private String soccerlevel;
    private boolean availablity;

    public UserDTO(String pseudo, String email, String phone, Level soccerlevel, boolean availablity) {
        this.pseudo = pseudo;
        this.email = email;
        this.phone = phone;
        this.soccerlevel = soccerlevel.getLevelDescription();
        this.availablity = availablity;
    }

    public UserDTO() {

    }
}
