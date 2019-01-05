package com.mrmrmr7.task.parser;

import com.mrmrmr7.task.symbol_structuries.Symbol;
import com.mrmrmr7.task.symbol_structuries.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {
    @Test
    public void parseTest() {
        Word word = new Word("to parse");
        WordParser wordParser = new WordParser();
        word.add(wordParser.parse(word));
        String actual = word.getData();
        String expected = "to parse";
        assertEquals(expected, actual);
    }
}