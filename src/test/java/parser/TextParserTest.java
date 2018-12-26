package parser;

import data_actions.TextAction;
import symbol_structuries.Paragraph;
import symbol_structuries.Text;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextParserTest {

    @Test
    public void parseTest() {
        Text text = new Text(TextAction.getTextByPath("/home/meow/Programming/Java/EPAM-JWD-Task2-Zaporozhtsev/src/main/resources/text.txt"));

        TextParser textParser = new TextParser();

        text.add(textParser.parse(text));

        List<Paragraph> paragraphs = new ArrayList<>();
        paragraphs.add(new Paragraph("(0)dfghjkl;lkjgfhjkhgfh"));
        paragraphs.add(new Paragraph("(1)dfghhgfdhjgfhkgfhujyhtfjyfjfhjfasfd"));
        assertEquals(paragraphs.get(1).getText(), ((Paragraph) text.getParagraphes().get(1)).getText());
    }
}