package com.mrmrmr7.task.data_actions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAsNumberCastTest {

    @Test
    public void convertTest() {
        String actual = WordAsNumberCast.convert("(five)");
        String expected = "5";
        assertEquals(expected, actual);
    }
}