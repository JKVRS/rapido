package com.development.rapido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RideSummary extends Ride {
    @OneToMany
    List<Payment> payments;
}
