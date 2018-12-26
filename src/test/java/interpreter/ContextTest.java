package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    @Test
    void evaluteTest() {
        Context context = new Context();
        int res = context.evalute("2+1").interpet();
        assertEquals(3, res);
    }
}