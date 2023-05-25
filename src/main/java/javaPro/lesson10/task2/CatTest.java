package javaPro.lesson10.task2;

import java.util.Set;
import java.util.TreeSet;

public class CatTest {
    public static void main(String[] args) {

                Cat cat1 = new Cat(7, "Black", 3.65);
                Cat cat2 = new Cat(7, "Black", 3.65);

                boolean result = cat1 == cat2;
                System.out.println("Сравнение при помощи ==: " + result);

                result = cat1.equals(cat2);
                System.out.println("Сравнение при помощи equals: " + result);

                Set<Cat> cats = new TreeSet<>(new CatComparator());

                cats.add(new Cat(5,"Black",2.12));
                cats.add(new Cat(9,"White",3.13));
                cats.add(new Cat(7,"Gold",4.14));
                cats.add(new Cat(3,"Red",5.15));
                cats.add(new Cat(5,"Grey",6.16));
                cats.add(new Cat(2,"Yellow",7.17));
                cats.add(new Cat(1,"Green",8.18));

                for (Cat cat: cats){
                    System.out.println(cat);
                }

    }
}
