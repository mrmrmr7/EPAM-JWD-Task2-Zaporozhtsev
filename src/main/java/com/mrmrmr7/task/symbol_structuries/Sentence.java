package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.interfaces.TextInterface;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements TextInterface {
    private String sentence;
    private List<SymbolInterface> words = new ArrayList<>();

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.words.addAll(toAdd);
    }

    @Override
    public String getData() {
        return sentence;
    }

    @Override
    public String printAll() {
        StringBuilder stringBuilder = new StringBuilder();

        this.words.forEach(s -> {
            stringBuilder.append(s.printAll());
            stringBuilder.append(" ");
        });

        String lastSymbol = String.valueOf(this.sentence.charAt(sentence.length() - 1));

        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length() , lastSymbol + " ");

        return stringBuilder.toString();
    }

    @Override
    public int getChildCount() {
        return words.size();
    }
}
