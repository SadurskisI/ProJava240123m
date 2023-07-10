package javaPro.lesson23.task2;

import javaPro.lesson17.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Hello");
        list.add(new Cat(3,"Black"));
        String text =(String) list.get(1);
        System.out.println(text);

        Cat cat = new Cat(7,"White");

    }
}
