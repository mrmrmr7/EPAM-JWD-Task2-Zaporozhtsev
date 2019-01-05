package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.data_actions.WordAsNumberCast;
import com.mrmrmr7.task.parser.interfaces.DataParser;
import com.mrmrmr7.task.symbol_structuries.Symbol;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends DataParser {
    @Override
    public List<SymbolInterface> parse(SymbolInterface smt) {
        String word = smt.getData();

        Pattern pattern = Pattern.compile(Regex.NUMERAL_AS_WORD);
        Matcher matcher = pattern.matcher(word);

        if (matcher.find()) {
            word = WordAsNumberCast.convert(word);
        }

        List<SymbolInterface> symbols = new ArrayList<>();

        for (char chr : word.toCharArray()) {
            symbols.add(new Symbol(chr));
        }

        return symbols;
    }

}
