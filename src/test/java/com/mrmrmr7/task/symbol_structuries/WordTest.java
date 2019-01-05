package com.mrmrmr7.task.symbol_structuries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void addTest() {
    }

    @Test
    void getDataTest() {
        Word word = new Word("word");
        String actual = word.getData();
        String expected = "word";
        assertEquals(expected, actual);
    }

    @Test
    void printAllTest() {
    }
}