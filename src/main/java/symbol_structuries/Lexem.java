package symbol_structuries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lexem implements TextInterface{
    private final String name = "Lexem";
    private List<SymbolInterface> words = new ArrayList<>();
    private List<SymbolInterface> expressions = new ArrayList<>();

    public Lexem() {

    }

    public Lexem(String lexem) {
        String[] words = lexem.split("-");

        Arrays
                .stream(words)
                .forEach(s -> { this.words.add(new Word(s)); });
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {

    }

    @Override
    public void remove(int id) {
        words.remove(id);
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String printAll() {
        words.forEach(SymbolInterface::printAll);
        return null;
    }
}
