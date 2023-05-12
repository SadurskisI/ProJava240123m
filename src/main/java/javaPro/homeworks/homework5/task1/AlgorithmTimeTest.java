package javaPro.homeworks.homework5.task1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AlgorithmTimeTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        int listSize = list.size();

//Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
        long time1 = System.currentTimeMillis();
        for (Integer number : list) {
            int tmp = number;
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));

//        Сделать то же самое с помощью классического for.
        time1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.indexOf(i);
        }
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));

//Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную,
// а потом эту переменную использовать внутри условия цикла.
        time1 = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            int tmp = list.indexOf(i);
        }
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));

//Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
        time1 = System.currentTimeMillis();
        for (int i = listSize - 1; i >= 0; i--) {
            int tmp = list.indexOf(i);
        }
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));

//Сделать то же самое, но используя Iterator.
        time1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));

//Сделать то же самое, но используя ListIterator.
//Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл
        time1 = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        time2 = System.currentTimeMillis();
        System.out.println((time2 - time1));
    }
}
