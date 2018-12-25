package symbol_structuries;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextInterface{
    private String text;
    private List<SymbolInterface> paragraphes = new ArrayList<>();

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        toAdd.forEach(s -> { paragraphes.add(s); });
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public String printAll() {
        StringBuilder builder = new StringBuilder();
        this.paragraphes.forEach(s -> { builder.append(s.printAll()); });
        return builder.toString();
    }

    public List<SymbolInterface> getParagraphes() {
        return this.paragraphes;
    }


}
