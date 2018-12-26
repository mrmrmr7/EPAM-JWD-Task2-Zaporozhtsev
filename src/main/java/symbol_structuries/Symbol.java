package symbol_structuries;

public class Symbol implements SymbolInterface {
    private char symbol = '\u0000';

    public Symbol() {

    }

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String printAll() {
        System.out.println(symbol);
        return null;
    }

    @Override
    public String getText() {
        return String.valueOf(symbol);
    }
}
