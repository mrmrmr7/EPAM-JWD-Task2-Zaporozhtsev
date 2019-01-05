package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.parser.interfaces.DataParser;
import com.mrmrmr7.task.symbol_structuries.Sentence;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser extends DataParser {

    @Override
    public List<SymbolInterface> parse(SymbolInterface smt) {
        String paragraph = smt.getData();
        List<SymbolInterface> sentences = new ArrayList<>();

        Pattern pattern = Pattern.compile(Regex.SENTENCE);
        Matcher matcher = pattern.matcher(paragraph);

        int lastMatch = 0;

        while (matcher.find()) {
            Sentence sentence = new Sentence(paragraph.substring(lastMatch, matcher.start() + 1));
            sentence.add(nextParse(sentence));
            sentences.add(sentence);
            lastMatch = matcher.end();
        }

        return sentences;
    }

}
