package parser;

import symbol_structuries.SymbolInterface;

import java.util.List;

public interface ParserChain<T> {
    List<SymbolInterface> parse(SymbolInterface smt);
    void linkWith(ParserChain<T> next);
}
