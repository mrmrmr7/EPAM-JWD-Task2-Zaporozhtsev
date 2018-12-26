package symbol_structuries;

import java.util.ArrayList;
import java.util.List;

public class Word implements TextInterface {
    private final String name = "Word";
    public List<SymbolInterface> word = new ArrayList<>();

    public Word() {

    }

    public Word(String word) {
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {

    }

    @Override
    public void remove(int id) {
        word.remove(id);
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String printAll() {
        word.stream().forEach(SymbolInterface::printAll);
        return null;
    }

}
