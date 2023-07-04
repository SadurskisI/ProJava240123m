package javaPro.lesson22.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        System.out.println(checkString("https://www.example.com"));
        System.out.println(checkString("https://example.com"));
        System.out.println(checkString("www.example.com"));
        System.out.println(checkString("https//www"));
        System.out.println(checkString("www"));
        System.out.println(checkString("dwww"));
        System.out.println(checkString("...www"));

    }

    public static boolean checkString(String source){
        String regEx = ".*www.*";
        Pattern pattern = Pattern.compile(regEx);
        System.out.println("Pattern - " + pattern.pattern());
        boolean result = pattern.matcher(source).matches();
        return result;
    }
}
