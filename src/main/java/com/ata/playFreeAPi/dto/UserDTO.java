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

}
