package javaPro.lesson06.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0,5);
        numbers.add(1,7);

        System.out.println(numbers);

        numbers.add(8);
        numbers.add(9);
//        numbers.add(8,12);

        System.out.println(numbers);



        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(20);
        numbers2.add(30);

        System.out.println(numbers2);

        numbers2.addAll(numbers);

        System.out.println(numbers2);

        int[] array = {1,2,3};

        for (int i:array) {
            numbers2.add(i);
        }

        numbers2.add(1);

        System.out.println(numbers2);

        int value = numbers2.remove(1);

        System.out.println(value);
        System.out.println(numbers2);

        numbers2.set(2,17);

        System.out.println(numbers2);

        System.out.println(numbers2.size());

        System.out.println(numbers2.isEmpty());

        System.out.println(numbers2.contains(8));
        System.out.println(numbers2.contains(18));




    }
}
