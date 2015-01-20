package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeSubStringTest {

    @Test
    public void testMySolution() throws Exception {
        PalindromeSubString subString = new PalindromeSubString();
        String s = "abcabac";
        String result = subString.MySolution(s);
        System.out.println(result);
    }

    @Test
    public void testLongestPalindrome() throws Exception {
        PalindromeSubString subString = new PalindromeSubString();
        String s = "aaaaaaa";
        String result = subString.longestPalindrome(s);
        System.out.println(result);

    }

    @Test
    public void testPreProcess() throws Exception{
        PalindromeSubString subString = new PalindromeSubString();
        String s = "dfadsafdads";

        System.out.println(subString.PreProcess(s));
    }
}