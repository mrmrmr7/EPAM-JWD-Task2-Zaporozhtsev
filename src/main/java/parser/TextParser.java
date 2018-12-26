package parser;

import symbol_structuries.Paragraph;
import symbol_structuries.SymbolInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser extends DataParser {

    @Override
    public List<SymbolInterface> parse(SymbolInterface textToParse) {
        String text = textToParse.getText();
        List<SymbolInterface> paragraphs = new ArrayList<>();

        Pattern pattern = Pattern.compile(Regex.PARAGRAPH.toString());
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String[] splitted = text.split("    ");

            Arrays
                    .stream(splitted)
                    .forEach(s -> {
                        Paragraph p = new Paragraph(s);
                        p.add(nextParse(p));
                        paragraphs.add(p);
                    });
        }

        return paragraphs;
    }
}
