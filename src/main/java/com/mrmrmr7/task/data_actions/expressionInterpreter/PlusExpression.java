package com.mrmrmr7.task.data_actions.expressionInterpreter;

public class PlusExpression implements Expression {
    Expression left;
    Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpet() {
        return left.interpet() + right.interpet();
    }
}
