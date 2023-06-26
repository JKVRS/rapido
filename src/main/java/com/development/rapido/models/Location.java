package com.development.rapido.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Location extends BaseModel {
    private double latitude;
    private double longitude;
}
