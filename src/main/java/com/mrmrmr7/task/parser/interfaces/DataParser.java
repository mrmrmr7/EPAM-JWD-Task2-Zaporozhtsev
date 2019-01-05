package com.mrmrmr7.task.parser.interfaces;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class DataParser implements ParserChain<SymbolInterface> {
    private DataParser next;

    @Override
    public ParserChain<SymbolInterface> linkWith(ParserChain<SymbolInterface> next) {
        this.next = (DataParser) next;
        return next;
    }

    protected List<SymbolInterface> nextParse(SymbolInterface toParse) {

        if (this.next != null) {
            return this.next.parse(toParse);
        }

        return new ArrayList<>();
    }
}
