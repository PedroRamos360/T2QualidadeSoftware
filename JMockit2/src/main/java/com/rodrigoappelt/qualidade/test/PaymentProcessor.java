package com.rodrigoappelt.qualidade.test;

public class PaymentProcessor {
    private Calculator calculator;

    public PaymentProcessor(Calculator calculator) {
        this.calculator = calculator;
    }

    public double calculateTotal(double price, int quantity) {
        // Use the Calculator to calculate total
        return calculator.multiply(price, quantity);
    }
}

