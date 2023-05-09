package javaPro.lesson07.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("CCCCC");
        list.add("D");
        list.add("E");


        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            String tmp = listIterator.next();
            if (tmp.length() == 5){
                break;
            }
            System.out.println(tmp);
        }
        while (listIterator.hasPrevious()) {
            String tmp = listIterator.previous();
            System.out.println(tmp);
            if (tmp.equals("B")){
                listIterator.add("AA");
            }
            }
        System.out.println(list);


    }
}
