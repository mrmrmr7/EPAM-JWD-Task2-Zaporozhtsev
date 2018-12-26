package symbol_structuries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements TextInterface {
    private String text;
    private List<SymbolInterface> sentence = new ArrayList<>();

    public Sentence() {

    }

    public Sentence(String sentence) {
        this.text = sentence;
    }

    public void getText(String text) {

    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        this.sentence.addAll(toAdd);
    }

    @Override
    public void remove(int id) {
        sentence.remove(id);
    }

    @Override
    public String getText() {
        System.out.println(this.text);
        return text;
    }

    @Override
    public String printAll() {
        StringBuilder builder = new StringBuilder();
        this.sentence.forEach(s -> { builder.append(s.printAll()); });
        return builder.toString();
    }
}
