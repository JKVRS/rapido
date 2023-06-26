package com.development.rapido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Ride extends BaseModel {
    @OneToOne
    private Customer customer;
    @OneToOne
    private Rider rider;
    @OneToOne
    private Vehicle vehicle;
    @OneToOne
    private Location source;
    @OneToOne
    private Location destination;
    private Date requestAt;
    private Double tripFare;
    private int totalPassengers;
}
