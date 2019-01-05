package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.interfaces.TextInterface;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextInterface {
    private String paragraph;
    private List<SymbolInterface> sentences = new ArrayList<>();

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.sentences.addAll(toAdd);
    }

    @Override
    public String getData() {
        return paragraph;
    }

    @Override
    public String printAll() {
        StringBuilder stringBuilder = new StringBuilder();
        sentences.forEach(s -> {
            stringBuilder.append(s.printAll());
            String data = s.getData();
        });
        return stringBuilder.toString();
    }

    @Override
    public int getChildCount() {
        return sentences.size();
    }
}
