package javaPro.lesson22.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        check("A");
        check("B");
        check("C");
        check("D");
        check("AA");
        check("ABC");
        System.out.println();

        check2("easdytruugh");
        check2("asdkqwew9sdASDBTYQ");


    }

    public static void check(String source){
        String regEx = "[ABC]+";
        Pattern pattern = Pattern.compile(regEx);
        System.out.println(pattern.matcher(source).matches());
    }
    public static void check2(String source){
        String regEx = "[A-Za-z]{3,}";
        String regEx1 = "[^A-Za-z]{3,}";
        String regEx2 = "\\w{3,}";
        String regEx3 = "[0-7]*";
        Pattern pattern = Pattern.compile(regEx);
        Pattern pattern1 = Pattern.compile(regEx1);
        Pattern pattern2 = Pattern.compile(regEx2);
        Pattern pattern3 = Pattern.compile(regEx3);
        System.out.println(pattern.matcher(source).matches());
        System.out.println(pattern1.matcher(source).matches());
        System.out.println(pattern2.matcher(source).matches());
        System.out.println(pattern3.matcher(source).matches());



    }
}
