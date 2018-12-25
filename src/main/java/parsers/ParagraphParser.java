package parsers;

import symbol_structuries.Paragraph;
import symbol_structuries.Sentence;
import symbol_structuries.SymbolInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends DataParser {
    @Override
    public List<SymbolInterface> parse(SymbolInterface smt) {
        String paragraph = ((Paragraph) smt).getText();
        List<SymbolInterface> sentences = new ArrayList<>();

        Pattern pattern = Pattern.compile(Regex.SENTENCE.toString());
        Matcher matcher = pattern.matcher(paragraph);

        if (matcher.find()) {
            String[] splitted = paragraph.split(Regex.SENTENCE.toString());

            Arrays
                    .stream(splitted)
                    .forEach(s -> {
                        Sentence sentence = new Sentence(s);
                        sentences.add(sentence);
                        nextParse(sentence);
                    });
        }
        return sentences;
    }

}
