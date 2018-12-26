package expression_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionCalculatorTest {

    @Test
    void calculateExpressionTest() {
        ExpressionCalculator expressionCalculator = new ExpressionCalculator();
        assertEquals(8, expressionCalculator.calculateExpression("(((2+2)-(3+3)+(2<<1)))<<2"));
    }
}