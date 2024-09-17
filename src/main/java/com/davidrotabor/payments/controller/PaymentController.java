package com.davidrotabor.payments.controller;

import com.davidrotabor.payments.model.Payment;
import com.davidrotabor.payments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("payment")
@CrossOrigin(origins = "*")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return paymentService.getPayments();
    }

    @GetMapping("/byId")
    public Optional<Payment> getByIdPayments(@PathVariable Long id) {
        return paymentService.getPayment(id);
    }
}
