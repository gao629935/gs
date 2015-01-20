package prepare;

/**
 * Created by is on 15/1/15.
 */
public class SubString {
    public static void main(String args[]){
        int lastLen=0;
        String result="";
        String s="123klfj45678lkasd2345";
        java.util.regex.Pattern p= java.util.regex.Pattern.compile("\\d+");
        java.util.regex.Matcher m= p.matcher(s);
        while(m.find()){
            String temp=m.group();
            if(temp.length()>lastLen){
                result=temp;
            }
            lastLen=temp.length();
        }
        System.out.println(result);
    }
}
