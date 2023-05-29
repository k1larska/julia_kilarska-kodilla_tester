package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int subResult = calculator.subtract(8, 6);
        assertEquals(2, subResult);
    }
    @Test
    public void testSqr() {
        Calculator calculator = new Calculator();
        int sqrResult = calculator.square(5);
        assertEquals(25, sqrResult);
    }
}
