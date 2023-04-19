package javaPro.homeworks.homework1;

public class Person {
    String fullName;
    int age;

    void move(){
        System.out.println(fullName + " идёт");
    }

    void talk(){
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){}


    public static void main(String[] args) {

        Person person1 = new Person();

        Person person2 = new Person("Ivan Ivanov", 25);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
