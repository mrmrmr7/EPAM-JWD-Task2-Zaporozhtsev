package interpreter;

public class LeftShiftExpression implements Expression {
    Expression left;
    Expression right;

    public LeftShiftExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpet() {
        return left.interpet() << right.interpet();
    }
}
