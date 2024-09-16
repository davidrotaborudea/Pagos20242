package com.davidrotabor.payments.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class PaymentStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentStatusId;

    private String status;

    @OneToMany(mappedBy = "paymentStatus")
    private List<Payment> payments;
}
