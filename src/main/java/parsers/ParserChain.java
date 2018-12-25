package parsers;

import symbol_structuries.SymbolInterface;

import java.util.List;

public interface ParserChain<T> {
    List<SymbolInterface> parse(SymbolInterface smt);
    ParserChain<T> linkWith(ParserChain<T> next);
}
