package com.development.rapido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class LocationMap extends BaseModel {
    private String placeName;
    @OneToOne
    private Location location;
}
