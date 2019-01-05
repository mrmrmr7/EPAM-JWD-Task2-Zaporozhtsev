package com.mrmrmr7.task.data_actions.expressionInterpreter;

public class NumberExpression implements Expression {
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpet() {
        return number;
    }
}
