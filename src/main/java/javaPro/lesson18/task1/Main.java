package javaPro.lesson18.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(6,3,8,9,1,0,5,2,4);

        // 1 method with for-each
        int sum = 0;
        for (Integer current : list){
            if (current % 2 != 0){
                sum+= current;
            }
        }
        System.out.println("Result - " + sum);


        // 2 method - with stream and lambda
        // 3 9 1 5
        // reduce 3, 9 -> 3 + 9 = 12
        // reduce 12, 1 -> 12 + 1 = 13
        // reduce 13, 5 -> 13 + 5 = 18
        int sum1 = list.stream().filter(x -> x % 2 != 0).reduce((x1,x2) -> x1 + x2).orElse(-1);

        System.out.println("Result 2 - " + sum1);


        // 3 method with stream and reference
        Integer.sum(3,4);
        int sum2 = list.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).orElse(-1);
        System.out.println("Result 3 - "+ sum2);


    }
}
