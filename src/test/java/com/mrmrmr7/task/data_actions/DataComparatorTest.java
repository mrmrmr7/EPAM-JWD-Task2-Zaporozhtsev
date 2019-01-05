package com.mrmrmr7.task.data_actions;

import com.mrmrmr7.task.symbol_structuries.Sentence;
import com.mrmrmr7.task.symbol_structuries.Word;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataComparatorTest {

    @Test
    public void compareTest() {
        Sentence sentenceLeft = new Sentence("there smt");
        Sentence sentenceRight = new Sentence("there smt too");
        List<SymbolInterface> forLeft = new ArrayList<>();
        List<SymbolInterface> forRight = new ArrayList<>();

        forLeft.add(new Word("1"));
        forLeft.add(new Word("2"));
        forLeft.add(new Word("3"));
        forLeft.add(new Word("4"));
        sentenceLeft.add(forLeft);

        forRight.add(new Word("1"));
        forRight.add(new Word("2"));
        forRight.add(new Word("3"));
        forRight.add(new Word("4"));
        sentenceRight.add(forRight);

        DataComparator dataComparator = new DataComparator();

        int actual = dataComparator.compare(sentenceLeft, sentenceRight);
        int expected = 0;

        assertEquals(expected, actual);
    }
}