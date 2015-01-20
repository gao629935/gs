package leetcode;

/**
 * Created by is on 15/1/14.
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 判定回文数。指定条件是不消耗多余的内存。
 * 考虑多平台复用，不消耗更多的内存。默认负数没有回文数
 */
public class PalindromeNumber {
    public  boolean MySolution(Integer input){
        char[] medium = input.toString().toCharArray();
        for (int i = 0;i<medium.length;i++){
            if (medium[i] != medium[medium.length-1-i]){
                return false;
            }
        }
        return true;
    }

    /**
     * java中可用的方法
     */
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
