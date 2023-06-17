package com.development.rapido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User extends BaseModel {
    //    @Column(name = "USER_ID", nullable = false, insertable = true, updatable = true, length = 10)
    private String email;
    private Long phone;
    private String name;
    @OneToMany
    private List<RideSummary> ridesHistory;
    private UserType userType;
    @OneToOne
    private Ride currentRide;
    private String password;
}
