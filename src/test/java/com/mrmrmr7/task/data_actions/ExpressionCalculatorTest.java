package com.mrmrmr7.task.data_actions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionCalculatorTest {

    @Test
    void calculateTest() {
        int actual = ExpressionCalculator.calculate("(123-23)+32");
        int expected = 132;
        assertEquals(expected,actual);
    }
}