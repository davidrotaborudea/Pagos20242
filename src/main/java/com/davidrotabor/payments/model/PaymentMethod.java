package com.davidrotabor.payments.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class PaymentMethod implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentMethodId;

    private String method;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Payment> payments;
}
