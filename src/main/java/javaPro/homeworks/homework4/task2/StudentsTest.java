package javaPro.homeworks.homework4.task2;

import javaPro.homeworks.homework4.task2.Students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsTest {
    public static void main(String[] args) {

            List<Students> list = new ArrayList<>();
            list.add(new Students("Ivan", "Ivanov", 1, 8));
            list.add(new Students("Alex", "Ivanov", 2, 6));
            list.add(new Students("Max","Ivanov", 3, 4));
            list.add(new Students("Oleg", "Ivanov", 4, 9));
            removeStudentByClassNumber(list);
            removeStudentByName(list, "Max");
        }
        public static void removeStudentByName(List<Students> list, String name){
            Iterator<Students> iterator = list.iterator();
            while (iterator.hasNext()){
                if(iterator.next().firstName.equals(name)){
                    iterator.remove();
                }
            }
            System.out.println(list);
        }

    public static void removeStudentByClassNumber(List<Students> list){
        Iterator<Students> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().classNumber<3){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    }

