package javaPro.lesson16.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan",25,3,4.53, Gender.MALE ));
        students.add(new Student("Igors",23,4,5.00, Gender.MALE));
        students.add(new Student("Alex",21,1,4.26, Gender.MALE));
        students.add(new Student("Alexa",21,4,4.95, Gender.FEMALE));
        students.add(new Student("Kate",21,4,4.95, Gender.FEMALE));
        students.add(new Student("Nika",21,4,4.95, Gender.FEMALE));
        students.add(new Student("Max",24,3,3.74, Gender.MALE));
        students.add(new Student("John",27,4,3.55, Gender.MALE));
        students.add(new Student("Eugen",29,2,3.97, Gender.MALE));

        System.out.println("All student list: ");
        for (Student student: students){
            System.out.println(student);
        }
        System.out.println();

        // вывести студентов у которых курс больше 1 и средний балл выше 4.5


        System.out.println("Students after filtration");
        StudentUtils.printStudents(students,new StudentFilter());
        System.out.println();

        // вывести студентов у которых пол женский и имя содержит букву "K" no casesensetive

        System.out.println("Students after second filtration:");
        StudentUtils.printStudents(students, new SecondFilter());
        System.out.println();

        // Вывести студентов у которых средний балл 4.3 или ниже и возраст 25 и ниже
        System.out.println("Students with annonymous class");

        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAverageRate() <= 4.3 && student.getAge() <= 25;
            }
        });
        System.out.println();



        System.out.println("Another students with annonymous class");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() < 5 && student.getGender().equals(Gender.MALE);
            }
        });
        System.out.println();


        System.out.println("Students with lambda syntax");
        StudentUtils.printStudents(students, x -> x.getCourse() == 3 && x.getName().length() < 5);
        System.out.println();






    }
}
