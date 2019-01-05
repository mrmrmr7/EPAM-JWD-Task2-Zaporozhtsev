package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightShiftExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(2048);
        NumberExpression right = new NumberExpression(2);
        RightShiftExpression rightShiftExpression = new RightShiftExpression(left, right);

        int actual = rightShiftExpression.interpet();
        int expected = 512;

        assertEquals(expected, actual);
    }
}