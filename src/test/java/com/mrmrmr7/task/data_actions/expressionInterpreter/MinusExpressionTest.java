package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinusExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(13);
        NumberExpression right = new NumberExpression(7);
        MinusExpression leftShiftExpression = new MinusExpression(left, right);

        int actual = leftShiftExpression.interpet();
        int expected = 6;

        assertEquals(expected, actual);
    }
}