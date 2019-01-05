import com.mrmrmr7.task.data_actions.TextAction;
import org.junit.jupiter.api.Test;
import com.mrmrmr7.task.parser.*;
import com.mrmrmr7.task.parser.interfaces.ParserChain;
import com.mrmrmr7.task.symbol_structuries.Paragraph;
import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;
import com.mrmrmr7.task.symbol_structuries.Text;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void taskTest() {
        Text text = new Text(TextAction.getTextFromFile("/home/meow/Programming/Java/EPAM-JWD-Task2-Zaporozhtsev/src/main/resources/text.txt"));

        System.out.println(text.getData());
        ParserChain<SymbolInterface> parser = new TextParser();

        parser.linkWith(new ParagraphParser())
                .linkWith(new SentenceParser())
                .linkWith(new WordParser());

        text.add(parser.parse(text));

        List<Paragraph> paragraphs = new ArrayList<>();

        System.out.println(text.printAll());

        paragraphs.add(new Paragraph("It has survived - not only (five) centuries, but also the leap into 13<<2 electronic " +
                "typesetting, remaining 3>>5 essentially 6&9|(3&4) unchanged. It was popularised in the " +
                "5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1) with the release of Letraset sheets containing Lorem " +
                "Ipsum passages, and more recently with desktop publishing software like Aldus " +
                "PageMaker including versions of Lorem Ipsum.\n"));

        assertEquals(paragraphs.get(0).getData(), text.getParagraphes().get(0).getData());
    }
}
