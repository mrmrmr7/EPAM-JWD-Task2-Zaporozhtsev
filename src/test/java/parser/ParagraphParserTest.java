package parser;

import data_actions.TextAction;
import org.junit.jupiter.api.Test;
import symbol_structuries.Paragraph;
import symbol_structuries.SymbolInterface;
import symbol_structuries.Text;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParagraphParserTest {

    @Test
    void parseTest() {
        Text text = new Text(TextAction.getTextByPath("/home/meow/Programming/Java/EPAM-JWD-Task2-Zaporozhtsev/src/main/resources/text.txt"));
        SentenceParser sp = new SentenceParser();
        ParagraphParser pp = new ParagraphParser();
        TextParser tp = new TextParser();
        WordParser wp = new WordParser();
        tp.linkWith(pp);
        pp.linkWith(sp);
        sp.linkWith(wp);

        ParserChain<SymbolInterface> textParser = tp;

        text.add(tp.parse(text));

        List<Paragraph> paragraphs = new ArrayList<>();

        paragraphs.add(new Paragraph("(0)dfghjkl;lkjgfhjkhgfh"));
        paragraphs.add(new Paragraph("(1)dfghhgfdhjgfhkgfhujyhtfjyfjfhjfasfd"));

        assertEquals(paragraphs.get(0).getText(),
                ((Paragraph) text.getParagraphes().get(0))
                        .getText());
    }
}