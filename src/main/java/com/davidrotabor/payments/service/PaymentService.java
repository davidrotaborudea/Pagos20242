package com.davidrotabor.payments.service;

import com.davidrotabor.payments.model.Payment;
import com.davidrotabor.payments.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPayments() {
        return (List<Payment>) paymentRepository.findAll();
    }

    public Optional<Payment> getPayment(Long paymentId) {
        return paymentRepository.findById(paymentId);
    }
}
