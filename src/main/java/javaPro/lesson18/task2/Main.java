package javaPro.lesson18.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("10","20","30","10","100","50");

        String result1 = list.stream().reduce((x1,x2) -> x1 + x2).orElse("");
        System.out.println("result 1 - " + result1);

        String  result2 = list.stream().reduce((x1,x2) ->
                String.valueOf(Integer.parseInt(x1) + Integer.parseInt(x2))).orElse("");
        System.out.println("Result 2 - " + result2);


        System.out.println("List - \n" + list );

        // count `10` with `equals`
        long count = list.stream().filter(x -> x.equals("10")).count();
        System.out.println(" `10` count is - " + count);

        //count `10` with `contains`
        count = list.stream().filter(x -> x.contains("10")).count();
        System.out.println(" `10` substring count is - " + count);


        List<String> resultList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Result list - " + resultList);

        resultList = list.stream().sorted((x1,x2) -> Integer.parseInt(x1) - Integer.parseInt(x2)).collect(Collectors.toList());
        System.out.println("Result list 2 - "+resultList);
    }
}
