package interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Context {
    public Expression evalute(String s) {
        int pos = s.length() - 1;

        Pattern pattern = Pattern.compile("T-?([0-9]*)");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            return new NumberExpression(Integer.parseInt(s));
        }

        while (pos > 0) {
            if (Character.isDigit(s.charAt(pos))) {
                pos--;
            } else {

                Expression left = evalute(s.substring(0, ((s.charAt(pos) == '<') || (s.charAt(pos) == '>'))
                                                            ? pos - 1
                                                            : pos ));

                Expression right = new NumberExpression(Integer.valueOf(s.substring(pos + 1, s.length())));

                char operator = s.charAt(pos);

                switch (operator) {
                    case '+': return new PlusExpression(left, right);
                    case '-': return new MinusExpression(left, right);
                    case '>': return new RightShiftExpression(left, right);
                    case '<': return new LeftShiftExpression(left, right);
                }
            }
        }
        int res = Integer.valueOf(s);
        return new NumberExpression(res);
    }

}
