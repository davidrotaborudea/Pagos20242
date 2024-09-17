package com.davidrotabor.payments.service;

import com.davidrotabor.payments.model.PaymentMethod;
import com.davidrotabor.payments.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethod> getPaymentsMethods() {
        return (List<PaymentMethod>) paymentMethodRepository.findAll();
    }

    public Optional<PaymentMethod> getPaymentMethods(Long paymentMethodId) {
        return paymentMethodRepository.findById(paymentMethodId);
    }
}
