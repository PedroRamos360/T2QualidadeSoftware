package com.rodrigoappelt.qualidade.test;

import mockit.Expectations;
import mockit.Verifications;
import org.testng.annotations.Test;
import mockit.Mocked;
import static org.testng.Assert.assertEquals;

public class PaymentProcessorTest {

    @Mocked Calculator calculator;

    @Test
    public void testCalculateTotal() {
        // cria o comportamento mock da funcao
        new Expectations() {{
            calculator.multiply(10.0, 3); result = 30.0;
        }};

        PaymentProcessor paymentProcessor = new PaymentProcessor(calculator);
        double total = paymentProcessor.calculateTotal(10.0, 3);
        assertEquals(total, 30.0);

        // checa se a funcao foi chamada mesmo
        new Verifications() {{
            calculator.multiply(10.0, 3); times = 1;
        }};
    }
}

