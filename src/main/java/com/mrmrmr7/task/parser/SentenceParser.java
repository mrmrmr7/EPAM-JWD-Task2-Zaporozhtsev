package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.parser.interfaces.DataParser;
import com.mrmrmr7.task.symbol_structuries.MathExpression;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends DataParser {
    @Override
    public List<SymbolInterface> parse(SymbolInterface smt) {
        String sentence = smt.getData().trim();
        List<SymbolInterface> words = new ArrayList<>();

        Pattern pattern = Pattern.compile(Regex.WORD);
        Pattern expressionPattern = Pattern.compile(Regex.EXPRESSION);
        Matcher matcher = pattern.matcher(sentence);

        int lastMatch = 0;

        while (matcher.find()) {
            String sentencePart = sentence.substring(lastMatch, matcher.start());

            if (expressionPattern.matcher(sentencePart).find()) {
                MathExpression expression = new MathExpression(sentencePart);
                MathExpressionParser mep = new MathExpressionParser();
                String result = mep.calculateExpression(expression);
                expression.setCalculatedExpression(result);
                expression.add(nextParse(expression));

                words.add(expression);
            } else {
                Word word = new Word(sentencePart);
                word.add(nextParse(word));
                words.add(word);
            }

            lastMatch = matcher.end();
        }

        return words;
    }

}
