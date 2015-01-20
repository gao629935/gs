package leetcode;

/**
 * Created by is on 15/1/15.
 * Given a string S, find the longest palindromic substring in S.
 * 自己实现的是个O（N的平方）复杂度的方式
 */
public class PalindromeSubString {

    public String MySolution(String S){

        char[] StringToChars = S.toCharArray();

        int i = 0;
        int length = StringToChars.length;
        int m = 0;
        int k = 0;

        while(i<length){
            int n = i;
            int j = length - 1;
            while (j>i){
                if(StringToChars[i] == StringToChars[j]){
                    if(m<=j-i+1){
                        m = j-i+1;
                        k = i;
                    }
                    i++;
                    j--;
                }else {
                    j--;
                    if (i!=n){
                        i = n;
                        m = 0;
                        k = 0;
                        break;
                    }

                }
            }
            i++;
        }
        if(m==0)
            return "";

        return S.substring(k,m+k);
    }

    /**
     * 实现的是期望为O（N）复杂度的方法
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String T = PreProcess(s);
        int n = T.length();
        int[] P = new int[n];
        for (int i = 1;i < n-1;i++){
            while (T.toCharArray()[i+1+P[i]] == T.toCharArray()[i-1-P[i]])
                P[i]++;

        }

        // Find the maximum element in P.
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n-1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }

        return s.substring((centerIndex - 1 - maxLen)/2, (centerIndex - 1 + maxLen)/2);
    }
    public String PreProcess(String s){
        int n = s.length();
        if (n == 0) return "^$";
        String ret = "^";
        for (int i = 0;i < n;i++)
            ret += "#" + s.substring(i,i+1);

        ret += "#$";
        return ret;
    }

    /**
     * 实现的是O（N的方）复杂度的方法
     * @param s
     * @return
     */
//    public String longestPalindrome2(String s) {
//        int n = s.length();
//        if (n == 0) return "";
//        string longest = s.substr(0, 1);  // a single char itself is a palindrome
//        for (int i = 0; i < n-1; i++) {
//            string p1 = expandAroundCenter(s, i, i);
//            if (p1.length() > longest.length())
//                longest = p1;
//
//            string p2 = expandAroundCenter(s, i, i+1);
//            if (p2.length() > longest.length())
//                longest = p2;
//        }
//        return longest;
//    }
//
//    string expandAroundCenter(string s, int c1, int c2) {
//        int l = c1, r = c2;
//        int n = s.length();
//        while (l >= 0 && r <= n-1 && s[l] == s[r]) {
//            l--;
//            r++;
//        }
//        return s.substr(l+1, r-l-1);
//    }

}
