package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftShiftExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(2);
        NumberExpression right = new NumberExpression(3);
        LeftShiftExpression leftShiftExpression = new LeftShiftExpression(left, right);

        int actual = leftShiftExpression.interpet();
        int expected = 16;

        assertEquals(expected, actual);
    }
}