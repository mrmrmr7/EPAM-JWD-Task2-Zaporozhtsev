package com.mrmrmr7.task.data_actions.expressionInterpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberExpressionTest {

    @Test
    void interpetTest() {
        NumberExpression numberExpression = new NumberExpression(13);

        int actual = numberExpression.interpet();
        int expected = 13;

        assertEquals(expected, actual);
    }
}