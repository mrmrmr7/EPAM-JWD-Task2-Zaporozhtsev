package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.data_actions.ExpressionCalculator;
import com.mrmrmr7.task.symbol_structuries.MathExpression;

public class MathExpressionParser {

    public static String calculateExpression(MathExpression mathExpression) {
        int res = 0;
        String toCalculate = mathExpression.getData();

        res = ExpressionCalculator.calculate(toCalculate);

        return String.valueOf(res);
    }
}
