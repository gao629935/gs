package leetcode;

/**
 * Created by is on 15/1/16.
 * Implement regular expression matching with support for ‘.’ and ‘*’.
 */
public class RegulaitionExpressionMatch {
//    boolean isMatch1(const char *s, const char *p) {
//        assert(s && p);
//        if (*p == '\0') return *s == '\0';
//
//        // next char is not '*': must match current character
//        if (*(p+1) != '*') {
//            assert(*p != '*');
//            return ((*p == *s) || (*p == '.' && *s != '\0')) && isMatch(s+1, p+1);
//        }
//        // next char is '*'
//        while ((*p == *s) || (*p == '.' && *s != '\0')) {
//            if (isMatch(s, p+2)) return true;
//            s++;
//        }
//        return isMatch(s, p+2);
//    }

    int i = 0,j = 0;
    public boolean isMatch(String s,String p){
        if (p.equals(""))
            return s.equals("");
        char[] S = s.toCharArray();
        char[] P = p.toCharArray();

        if (P[j] != '*'){
            boolean result = ((S[i] == P[j]) || (P[j] == '.' && i<S.length)) && isMatch(s.substring(i+1),p.substring(j+1));
            i++;j++;
            return result;
        }
        while ((P[j] == S[i]) || (P[j] == '.' && i <S.length)){
            if (isMatch(s,p.substring(j+2))) return true;
        }
        return isMatch(s,p.substring(j+2));
    }
}
