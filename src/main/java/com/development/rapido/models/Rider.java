package com.development.rapido.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Rider extends User {
    private RiderStatus riderStatus;
    private List<Ride> rideRequest;
    private Vehicle vehicle;
}
