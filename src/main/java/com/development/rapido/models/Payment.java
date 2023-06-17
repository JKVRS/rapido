package com.development.rapido.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Payment extends BaseModel {
    private String referenceNumber;
    private PaymentMethod paymentMethod;
    private double amount;
    private PaymentType paymentType;
    private PaymentStatus status;
}
