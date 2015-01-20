package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegulaitionExpressionMatchTest {

    @Test
    public void testIsMatch() throws Exception {
        RegulaitionExpressionMatch match = new RegulaitionExpressionMatch();
        boolean result = match.isMatch("abcabc",".");
        assertEquals(result,true);
    }
}