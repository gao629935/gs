package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoRepeatCharacterSubstringTest {

    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        NoRepeatCharacterSubstring no = new NoRepeatCharacterSubstring();
        int result = no.lengthOfLongestSubstring("adfgedfgqa");
        System.out.println(result);

    }
}