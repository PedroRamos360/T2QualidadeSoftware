package com.rodrigoappelt.qualidade.test;

import mockit.Expectations;
import org.testng.annotations.Test;
import mockit.Mocked;
import static org.testng.Assert.assertEquals;

public class PaymentProcessorTest {

    @Mocked
    private Calculator calculator;

    @Test
    public void testCalculateTotal() {
        // Mock behavior
        new Expectations() {{
            calculator.multiply(10.0, 3); result = 30.0;
        }};

        PaymentProcessor paymentProcessor = new PaymentProcessor(calculator);
        double total = paymentProcessor.calculateTotal(10.0, 3);
        assertEquals(total, 30.0);
    }
}

