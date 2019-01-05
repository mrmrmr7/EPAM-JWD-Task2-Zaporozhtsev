package com.mrmrmr7.task.data_actions;

import org.junit.jupiter.api.Test;
import com.mrmrmr7.task.parser.ParagraphParser;
import com.mrmrmr7.task.parser.SentenceParser;
import com.mrmrmr7.task.parser.TextParser;
import com.mrmrmr7.task.parser.WordParser;
import com.mrmrmr7.task.parser.interfaces.ParserChain;
import com.mrmrmr7.task.symbol_structuries.Text;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import static org.junit.jupiter.api.Assertions.*;

class TextActionTest {

    @Test
    void getTextFromFileTest() {
        String actual = TextAction.getTextFromFile("/home/meow/Programming/Java/EPAM-JWD-Task2-Zaporozhtsev/src/main/resources/text.txt");
        String expected = "It has survived - not only 5 centuries, but also the leap into 52 electronic typesetting, remaining 0 essentially 0 unchanged. It was popularised in the 5 with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. \n" +
                "    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here, making it look like readable English. \n" +
                "    It is a 1200 established fact that a reader will be of a page when looking at its layout. \n" +
                "    Bye.";
        assertEquals(expected, actual);
    }

    @Test
    void sortParagraphsBySentenceCountTest() {
        String data = TextAction.getTextFromFile("/home/meow/Programming/Java/EPAM-JWD-Task2-Zaporozhtsev/src/main/resources/text.txt");
        Text text = new Text(data);
        ParserChain<SymbolInterface> parserChain = new TextParser();

        parserChain
                .linkWith(new ParagraphParser())
                .linkWith(new SentenceParser())
                .linkWith(new WordParser());

        text.add(parserChain.parse(text));

        TextAction.sortParagraphsBySentenceCount(text);
        String expected = "    It is a 1200 established fact that a reader will be of a page when looking at its layout. \n" +
                "    Bye. \n" +
                "    It has survived - not only 5 centuries, but also the leap into 52 electronic typesetting, remaining 0 essentially 0 unchanged. It was popularised in the 5 with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. \n" +
                "    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here, making it look like readable English. \n    ";

        String actual = text.printAll();

        assertEquals(expected,actual);
    }
}