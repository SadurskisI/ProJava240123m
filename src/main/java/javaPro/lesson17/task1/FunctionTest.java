package javaPro.lesson17.task1;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<Double,Long> function = x -> Math.round(x);

        System.out.println(function.apply(3.65));
    }
}
