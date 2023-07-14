package com.practice.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    // Test methods need to be public and void


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero(){
        int sum = calculator.add(0,0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne(){
        int sum = calculator.add(1,1);
        assertEquals(2, sum, "Was expecting sum of 2");
    }

    @Test
    public void canAddNegatives(){
        int sum = calculator.add(-1, -3);
        assertEquals(-4, sum, "Was expecting sum of -4");
    }

    @Test
    @Disabled //Can also use @Ignore
    public void canAddMaxIntPlusOne(){
        int sum = calculator.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void annuityExample(){
        String answer = calculator.calcAnnuity("22000", 7, "0.06", 1);
        assertEquals("$184,664.43", answer);
    }
    @Test
    public void annuityExample2(){
        String answer = calculator.calcAnnuity("1200", 10, "0.08", 4);
        assertEquals("$72,482.38", answer);
    }
}
