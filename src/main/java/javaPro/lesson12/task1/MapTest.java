package javaPro.lesson12.task1;

import javaPro.lesson10.task2.Cat;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Banana", 97);
        map.put("Potato", 64);
        map.put("Cherry", 150);
        map.put("Strawberry", 120);
        map.put("Orange", 82);
        map.put("Carrot", 35);
        map.put("Tomato", 59);
        map.put("Potato", 72);

        System.out.println("Цена на морковь: " + map.get("Carrot"));
        System.out.println("Цена на картофель: " + map.get("Potato"));
        System.out.println("Цена несуществуещего ключа: " + map.get("Apple"));

        System.out.println();
        System.out.println("Вывод всех елементов с помощью for-each");

//
        List<Cat> cats = new ArrayList<>();
        for (Cat currentCat : cats) {
        }
//

        int stringNumber = 1;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.printf("%d. Продукт - %s, цена - %d.\n", stringNumber++, key, value);
        }

        System.out.println("Все продукты магазина: ");

        for (String product : map.keySet()) {
            System.out.println(product);
        }


        System.out.println("Все цены магазина: ");

        for (Integer price : map.values()) {
            System.out.println(price);
        }

//        iterator for Map
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if ("Tomato".equals(pair.getKey()) || pair.getValue() > 100) { // "Tomato" вначале ибо ключ может быть Null а у Null нету метода .equals и упадёт исключение
                iterator.remove();
            }
        }

        stringNumber = 1;
        System.out.println("Все продукты после удаления: ");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.printf("%d. Продукт - %s, цена - %d.\n", stringNumber++, key, value);


        }
    }
}
