package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

public class Symbol implements SymbolInterface {
    private char symbol = '\u0000';

    public Symbol() {

    }

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String printAll() {
        return String.valueOf(this.symbol);
    }

    @Override
    public String getData() {
        return String.valueOf(symbol);
    }

    @Override
    public int getChildCount() {
        return 1;
    }
}
