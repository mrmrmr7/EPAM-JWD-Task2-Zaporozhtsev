package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByteXORExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(13);
        NumberExpression right = new NumberExpression(7);
        ByteXORExpression byteXORExpression = new ByteXORExpression(left, right);

        int actual = byteXORExpression.interpet();
        int expected = 10;

        assertEquals(expected, actual);
    }
}