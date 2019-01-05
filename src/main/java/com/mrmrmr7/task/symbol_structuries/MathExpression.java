package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.interfaces.TextInterface;

import java.util.ArrayList;
import java.util.List;

public class MathExpression implements TextInterface {
    private String expression;
    private String calculatedExpression;
    private List<SymbolInterface> symbols = new ArrayList<>();

    public MathExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.symbols.addAll(toAdd);
    }

    @Override
    public String printAll() {
        return calculatedExpression;
    }

    @Override
    public String getData() {
        return this.expression;
    }

    @Override
    public int getChildCount() {
        return symbols.size();
    }

    public String getCalculatedExpression() {
        return calculatedExpression;
    }

    public void setCalculatedExpression(String calculatedExpression) {
        this.calculatedExpression = calculatedExpression;
    }
}
