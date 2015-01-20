package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void testMySolution() throws Exception {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertEquals(true,palindromeNumber.MySolution(Integer.valueOf(121)));
    }

    @Test
    public void testisPalindrome(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertEquals(true,palindromeNumber.isPalindrome(1221));
    }
}