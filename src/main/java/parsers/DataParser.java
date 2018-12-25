package parsers;

import symbol_structuries.SymbolInterface;

import java.util.List;

public abstract class DataParser implements ParserChain<SymbolInterface> {
    private DataParser next;

    @Override
    public ParserChain<SymbolInterface> linkWith(ParserChain<SymbolInterface> next) {
        System.out.println(this.next);
        this.next = ((DataParser) next).next;
        return this.next;
    }

    protected SymbolInterface nextParse(SymbolInterface toParse) {

        if (this.next != null) {
            next.parse(toParse);
        }

        System.out.println("Null expected");
        return null;
    }
}
