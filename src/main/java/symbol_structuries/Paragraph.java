package symbol_structuries;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextInterface {
    private String paragraph;
    private List<SymbolInterface> sentences = new ArrayList<>();

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.sentences.addAll(toAdd);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public String getText() {
        return paragraph;
    }

    @Override
    public String printAll() {
        return null;
    }
}
