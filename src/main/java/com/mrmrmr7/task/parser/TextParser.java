package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.parser.interfaces.DataParser;
import com.mrmrmr7.task.symbol_structuries.Paragraph;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser extends DataParser {

    @Override
    public List<SymbolInterface> parse(SymbolInterface dataToParse) {
        String textToParse = dataToParse.getData();
        String text = textToParse.trim();
        List<SymbolInterface> paragraphs = new ArrayList<>();

        Pattern pattern = Pattern.compile(Regex.PARAGRAPH);
        Matcher matcher = pattern.matcher(text);

        int lastMatch = 0;

        while (matcher.find()) {
            Paragraph paragraph = new Paragraph(text.substring(lastMatch, matcher.start()));
            paragraph.add(nextParse(paragraph));
            paragraphs.add(paragraph);
            lastMatch = matcher.end();
        }

        Paragraph paragraph = new Paragraph(text.substring(lastMatch));
        paragraph.add(nextParse(paragraph));
        paragraphs.add(paragraph);

        return paragraphs;
    }
}
