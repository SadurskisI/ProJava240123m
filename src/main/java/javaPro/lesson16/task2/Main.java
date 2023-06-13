package javaPro.lesson16.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Person>, boolean isHealthy, Integer id;
        //choose healthy person with odd id when isHealthy - true
        //choose unHealthy persons with even id when isHealthy - false

        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasya",1,true, 21));
        people.add(new Person("Oleg",2,false, 22));
        people.add(new Person("Armen",3,false, 24));
        people.add(new Person("Alexander",4,false, 23));
        people.add(new Person("Igors",5,true, 23));
        people.add(new Person("Eugen",6,true, 20));
        people.add(new Person("Max",7,false, 19));
        people.add(new Person("Ivan",8,true, 28));
        people.add(new Person("Alex", 9, true, 27));
        people.add(new Person("Alexa", 10, true, 29));
        people.add(new Person("Alexis", 11, true, 22));
        people.add(new Person("Abbi", 12, false, 11));
        people.add(new Person("Britani", 13, true, 2));
        people.add(new Person("Sandra", 14, false, 7));
        people.add(new Person("Peter", 15, true, 59));
        people.add(new Person("Boris", 16, false, 45));
        people.add(new Person("Sergej", 17, false, 7));
        people.add(new Person("Nadja", 18, false, 26));

        CustomPersonFilter customPersonFilter = new CustomPersonFilter();
        System.out.println("First list with true");
        customPersonFilter.print(people,true,40);
        System.out.println();
        System.out.println("Second list with false");
        customPersonFilter.print(people,false,40);



        PersonFilter filter2 = new PersonFilter() {
            @Override
            public void print(List<Person> list, boolean isHealthy, int age) {
                for (Person person : people) {

                    if (isHealthy) {
                        if (person.getId() % 2 == 0 && person.getAge() <= age && person.isHealthy()) {
                            System.out.println(person);
                        }
                    } else {
                        if (person.getId() % 2 != 0 && person.getAge() <= age && !person.isHealthy()) {
                            System.out.println(person);
                        }

                    }
                }
            }
        };
        System.out.println();
        System.out.println("Первая выборка с помощью анонимного класса:");
        filter2.print(people, true, 40);


        PersonFilter filter3 = (x, y, z) -> {
            for (Person person : x) {

                if (y) {
                    if (person.getId() % 2 == 0 && person.getAge() <= z && person.isHealthy()) {
                        System.out.println(person);
                    }
                } else {
                    if (person.getId() % 2 != 0 && person.getAge() <= z && !person.isHealthy()) {
                        System.out.println(person);
                    }

                }
            }
        };
        System.out.println();

        System.out.println("Первая выборка с помощью lambda:");
        filter3.print(people,true,40);
        System.out.println();
    }
}
