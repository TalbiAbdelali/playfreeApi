package com.ata.playFreeAPi.dto;

import lombok.Data;

@Data
public class FieldDTO {
    private long id;
    private String location;
    private boolean availability;
    private String name;

    public FieldDTO(long id, String location, boolean availability, String name) {
        this.id = id;
        this.location = location;
        this.availability = availability;
        this.name = name;
    }
}
