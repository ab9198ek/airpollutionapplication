package com.airpollution.core.controllers;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void before() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        Integer actual = calculator.add(3,2);
        Integer expected = 5;

        Assert.isTrue(expected == actual, "Should be same");
    }

    @Test
    void testAddNegative() {
        Integer actual = calculator.add(-3,-6);
        Integer expected = -9;

        Assert.isTrue(expected == actual, "Should be same");
    }
}
