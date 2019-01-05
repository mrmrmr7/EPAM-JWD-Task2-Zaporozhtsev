package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.data_actions.ExpressionCalculator;
import com.mrmrmr7.task.symbol_structuries.MathExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathExpressionParserTest {

    @Test
    void calculateExpressionTest() {
        MathExpression mathExpression = new MathExpression("7+7-7-7-7");
        String actual = MathExpressionParser.calculateExpression(mathExpression);
        String expected = "-7";
        assertEquals(expected, actual);
    }
}