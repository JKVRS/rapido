package com.development.rapido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Vehicle {
    @Id
    private Long id;
    @OneToOne
    private User user;
    private String vehicleName;
    private String vehicleType;
    private int vehicleNumber;
    private String vehicleColor;
    private int capacity;
    private int currentCapacity;
}
