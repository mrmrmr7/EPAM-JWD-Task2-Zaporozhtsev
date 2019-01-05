package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByteAndExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(13);
        NumberExpression right = new NumberExpression(7);
        ByteAndExpression byteAndExpression = new ByteAndExpression(left, right);

        int actual = byteAndExpression.interpet();
        int expected = 5;

        assertEquals(expected, actual);
    }
}