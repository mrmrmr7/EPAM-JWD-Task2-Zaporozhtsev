package expression_tree;

import interpreter.Expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionLayout {
    private String expression;
    List<ExpressionLayout> expressionList = new ArrayList<>();

    ExpressionLayout (String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return this.expression;
    }
}
