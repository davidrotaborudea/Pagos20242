package com.davidrotabor.payments.repository;

import com.davidrotabor.payments.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
