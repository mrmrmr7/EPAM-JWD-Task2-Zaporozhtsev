package parser;

import symbol_structuries.SymbolInterface;

import java.util.List;

public abstract class DataParser implements ParserChain<SymbolInterface> {
    private DataParser next;

    @Override
    public void linkWith(ParserChain<SymbolInterface> next) {
        this.next = (DataParser) next;
    }

    protected List<SymbolInterface> nextParse(SymbolInterface toParse) {

        if (this.next != null) {
            System.out.println("ne tut");
            return this.next.parse(toParse);
        }

        return null;
    }
}
