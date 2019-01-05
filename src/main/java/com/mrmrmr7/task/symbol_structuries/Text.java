package com.mrmrmr7.task.symbol_structuries;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.interfaces.TextInterface;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextInterface {
    private String text;
    private List<SymbolInterface> paragraphes = new ArrayList<>();

    public Text() {

    }

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        toAdd.forEach(s -> { paragraphes.add(s); });
    }

    @Override
    public String getData() {
        return this.text;
    }

    @Override
    public int getChildCount() {
        return paragraphes.size();
    }

    @Override
    public String printAll() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("    ");
        this.paragraphes.forEach(s -> {
            stringBuilder.append(s.printAll());
            stringBuilder.append("\n    ");
        });
        return stringBuilder.toString();
    }

    public List<SymbolInterface> getParagraphes() {
        return this.paragraphes;
    }


}
