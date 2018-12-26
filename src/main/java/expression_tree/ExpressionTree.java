package expression_tree;

import java.util.ArrayList;
import java.util.List;

public class ExpressionTree implements ExpressionLevel {
    private String expression;
    List<ExpressionLayout> layout = new ArrayList<>();

    public ExpressionTree(List<ExpressionLayout> layout) {
        this.layout = layout;
    }

    public ExpressionTree(String expression) {
        this.expression = expression;
    }

    @Override
    public int calculateExpressoin(String expression) {
        int res = 0;
        int layoutIndex = 0;
        int startIndex;
        int endIndex;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                startIndex = i;
                layoutIndex++;
            }

            if (expression.charAt(i) == ')') {
                layoutIndex--;
                if (layoutIndex == 1) {
                    endIndex = i;
                    layout.add(new ExpressionLayout(expression.substring(0, i)));
                }
            }
        }

        layout.forEach(ExpressionLayout::getExpression);

        return res;
    }
}
