package javaPro.lesson23.task4;

import javaPro.lesson10.task2.Cat;

public class Main {

    public static <E> void print(E e){
        System.out.println(e);
    }

//    public static void print(Cat item){
//
//    }
//
//    public static void print(Double item){
//
//    }

    public static void main(String[] args) {

        print("Hello");
        print(8.5);
        print(new Cat(5,"Black", 4.5));
    }
}
