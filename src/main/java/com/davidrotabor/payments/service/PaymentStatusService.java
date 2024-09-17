package com.davidrotabor.payments.service;

import com.davidrotabor.payments.model.PaymentStatus;
import com.davidrotabor.payments.repository.PaymentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentStatusService {
    @Autowired
    private PaymentStatusRepository paymentStatusRepository;

    public List<PaymentStatus> getPaymentsStatus() {
        return (List<PaymentStatus>) paymentStatusRepository.findAll();
    }

    public Optional<PaymentStatus> getPaymentStatus(Long paymentStatusId) {
        return paymentStatusRepository.findById(paymentStatusId);
    }
}
