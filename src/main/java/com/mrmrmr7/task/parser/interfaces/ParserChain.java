package com.mrmrmr7.task.parser.interfaces;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.List;

public interface ParserChain<T> {
    List<SymbolInterface> parse(SymbolInterface smt);
    ParserChain<T> linkWith(ParserChain<T> next);
}
