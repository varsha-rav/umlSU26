package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testZero() {
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-5, calculator.sum(-2, -3));
    }
}
