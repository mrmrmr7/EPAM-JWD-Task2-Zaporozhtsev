package interpreter;

public class RightShiftExpression implements Expression {
    Expression left;
    Expression right;

    public RightShiftExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpet() {
        return left.interpet() >> right.interpet();
    }
}
