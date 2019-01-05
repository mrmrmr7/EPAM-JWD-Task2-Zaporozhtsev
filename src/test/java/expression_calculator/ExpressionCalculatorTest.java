package expression_calculator;

import com.mrmrmr7.task.data_actions.ExpressionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionCalculatorTest {

    @Test
    void calculateExpressionTest() {
        assertEquals(0, ExpressionCalculator.calculate("6&9|(3&4)"));
    }
}