package symbol_structuries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements TextInterface {
    private String name = "Sentence";
    private List<SymbolInterface> sentence = new ArrayList<>();

    public Sentence() {

    }

    public Sentence(String sentence) {
        String[] lexems = sentence.split(" ");

        Arrays
                .stream(lexems)
                .forEach(s -> { this.sentence.add(new Lexem(s)); });
    }

    public void getText(String text) {

    }

    @Override
    public void add(List<SymbolInterface> toAdd) {
        //sentence.add(toAdd);
    }

    @Override
    public void remove(int id) {
        sentence.remove(id);
    }

    @Override
    public String getText() {
        System.out.println(this.name);
        return null;
    }

    @Override
    public String printAll() {
        StringBuilder builder = new StringBuilder();
        this.sentence.forEach(s -> { builder.append(s.printAll()); });
        return builder.toString();
    }
}
