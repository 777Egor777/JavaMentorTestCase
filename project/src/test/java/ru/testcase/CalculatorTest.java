package ru.testcase;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void summation() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.summation(17, 49), 66);
    }

    @Test
    public void subtraction() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.subtraction(123, 75), 48);
    }

    @Test
    public void multiplication() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.multiplication(9, 4), 36);
    }

    @Test
    public void division() throws IOException {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.division(24, 4), 6);
    }
}