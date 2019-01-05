package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression left = new NumberExpression(13);
        NumberExpression right = new NumberExpression(7);
        PlusExpression plusExpression = new PlusExpression(left, right);

        int actual = plusExpression.interpet();
        int expected = 20;

        assertEquals(expected, actual);
    }
}