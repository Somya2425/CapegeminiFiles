package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void testSubtract(){
        assertEquals(2,calculator.subtract(4,2));
    }
}
