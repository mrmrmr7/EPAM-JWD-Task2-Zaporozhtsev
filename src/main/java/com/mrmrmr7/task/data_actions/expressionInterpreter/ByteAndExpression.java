package com.mrmrmr7.task.data_actions.expressionInterpreter;

public class ByteAndExpression implements Expression {
    Expression left;
    Expression right;

    public ByteAndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpet() {
        return left.interpet() & right.interpet();
    }
}
