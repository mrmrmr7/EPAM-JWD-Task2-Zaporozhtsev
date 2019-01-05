package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByteOrExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(13);//1101
        NumberExpression right = new NumberExpression(7);//0110
        ByteOrExpression byteOrExpression = new ByteOrExpression(left, right);

        int actual = byteOrExpression.interpet();
        int expected = 15;

        assertEquals(expected, actual);
    }
}