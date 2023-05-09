package javaPro.lesson07.task2;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);



        List<String> list2 = new ArrayList<>();

        list2.add("Hello");
        list2.add("Java");
        list2.add("World");
        list2.add("Cat");
        list2.add("Dog");
        list2.add("AAAAA");

        Iterator<String> iterator1 = list2.iterator();



        while (iterator1.hasNext()){
            String tmp = iterator1.next();
            if (tmp.length() % 2 == 0) {
                iterator1.remove();
            } else if (tmp.length() == 3) {
                System.out.println(tmp);
            }
        }
        System.out.println(list2);


        Vector<String> list3 = new Vector<>();

        list2.add("Hello");
        list2.add("Java");
        list2.add("World");
        list2.add("Cat");
        list2.add("Dog");

        Enumeration<String> enumeration = list3.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement() + " - list3");
        }








    }
}
