package javaPro.lesson06.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        System.out.println(numbers3);

        changeValue(numbers3);

        System.out.println(numbers3);

        List<Integer> newList = newList(numbers3);

        System.out.println(numbers3);
        System.out.println(newList);


        List<Integer> numbers4 = new ArrayList<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(4);
        numbers4.add(5);

        System.out.println(numbers4);
        removeEven(numbers4);
        System.out.println(numbers4);

        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("From");
        words.add("Java Class");

        System.out.println(words);
        System.out.println(wordCount(words));


    }

    private static void changeValue(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
    }

    private static List<Integer> newList(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : numbers) {
            newList.add(i * 2);
        }
        return newList;
    }

//    Так не надо ! ! ! ! ! ! ! !! ! ! ! !  ! ;D
//    private static void removeEven(List<Integer> numbers){
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) %2 == 0){
//                numbers.remove(i);
//            }
//        }
//    }

    private static void removeEven(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private static int wordCount(List<String> words) {
        int wordCounter = 0;
        for (String i:words) {
            i = i.trim();
            wordCounter += i.length();
        }return wordCounter;
    }


}
