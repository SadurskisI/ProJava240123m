package javaPro.lesson16.task2;

import java.util.List;

public class CustomPersonFilter implements PersonFilter{
    @Override
    public void print(List<Person> people, boolean isHealthy, int age) {
        for (Person person: people){
            if (isHealthy){
                if (person.getId() %2 == 0 && person.getAge() <= age && person.isHealthy()){
                    System.out.println(person);
                }
            }else {
                if (person.getId() %2 != 0 && person.getAge() <= age && !person.isHealthy()){
                    System.out.println(person);
                }
            }
        }
    }
}
