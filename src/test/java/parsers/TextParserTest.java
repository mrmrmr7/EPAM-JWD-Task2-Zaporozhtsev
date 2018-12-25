package parsers;

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
        textParser.linkWith(new ParagraphParser());

        text.add(textParser.parse(text));

        List<Paragraph> paragraphs = new ArrayList<>();
        paragraphs.add(new Paragraph("(0)dfghjkl;lkjgfhjkhgfh\n"));
        paragraphs.add(new Paragraph("(1)dfghhgfdhjgfhkgfhujyhtfjyfjfhjfasfd\n"));
        assertEquals(paragraphs.get(1).getText(), ((Paragraph) text.getParagraphes().get(1)).getText());
    }
}