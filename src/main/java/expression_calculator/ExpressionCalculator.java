package expression_calculator;

import interpreter.Context;

public class ExpressionCalculator {
    public ExpressionCalculator() {}

    public int calculateExpression(String expression) {
        int index = 0;
        int maxIndex = 0;
        int startAt = 0;
        int endAt;
        int res;
        String deepestExpression;

        Context context = new Context();
        StringBuilder stringBuilder = new StringBuilder(expression);

        while (maxIndex == 0) {

            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == '(') {
                    index++;

                    if (index > maxIndex) {
                        maxIndex = index;
                        startAt = i;
                    }
                }

                if (stringBuilder.charAt(i) == ')') {
                    index--;
                }
            }

            if(maxIndex == 0) {
                res = context.evalute(stringBuilder.toString()).interpet();
                return res;
            }

            endAt = stringBuilder.indexOf(")", startAt - 1);

            deepestExpression = stringBuilder.substring(startAt + 1, endAt);

            res = context.evalute(deepestExpression).interpet();

            stringBuilder.replace(startAt, endAt + 1, String.valueOf(res));

            maxIndex = 0;
            index = 0;
        }

        return 0;
    }
}
