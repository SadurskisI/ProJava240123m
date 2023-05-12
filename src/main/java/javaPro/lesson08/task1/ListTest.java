package javaPro.lesson08.task1;

import java.util.Iterator;

public class ListTest {

    public static void main(String[] args) {

        //
        MyLinkedList list = new MyLinkedList();


        // место вызова метода
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");



        // блок тестирования
        // выводим в консоль размер листа
        System.out.println("Размер листа - " + list.size());
        System.out.println();

        // выводим в консоль лист с помощю метода toString()
        System.out.println("вывод с помощью toString");
        System.out.println(list);
        System.out.println();


        // выводим в консоль лист с помощью for
        System.out.println("вывод с помощью for");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //выводим с помощью for-each
        System.out.println("вывод с помощью for-each");
        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();

        // выводим с помощью итератора
        System.out.println("Вывод с помощью итератора");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();


        list.clear();
        System.out.println("After clear");
        System.out.println(list);
    }
}

