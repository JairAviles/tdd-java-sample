package com.jairaviles.javatest.payments;

public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount) {

        PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));

        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }

}
