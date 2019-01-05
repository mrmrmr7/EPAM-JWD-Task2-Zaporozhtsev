package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.interfaces.TextInterface;

import java.util.ArrayList;
import java.util.List;

public class Word implements TextInterface {
    private String word;
    public List<SymbolInterface> symbols = new ArrayList<>();

    public Word(String word) {
        this.word = word;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.symbols = toAdd;
    }

    @Override
    public String getData() {
        return this.word;
    }

    @Override
    public String printAll() {
        StringBuilder stringBuilder = new StringBuilder();

        symbols.forEach(s -> {
            stringBuilder.append(s.printAll());
        });

        return stringBuilder.toString();
    }

    @Override
    public int getChildCount() {
        return symbols.size();
    }
}
