package com.jairaviles.javatest.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
