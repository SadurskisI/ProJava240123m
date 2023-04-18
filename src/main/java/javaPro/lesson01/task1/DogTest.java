package javaPro.lesson01.task1;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
//        dog1.bark();
//        dog1.age = 2.5;
//        System.out.println(dog1.age);
//        System.out.println(dog1.color);

        Dog dog2 = new Dog("Haski",2,"White");
        Dog dog3 = new Dog("Doodle", "gold");

        dog2.setAge(7);
        System.out.println(dog2.getAge());
        dog2.setAge(-3);
        System.out.println(dog2.getAge());

        Dog dog = new Dog("Haski",-4,"green");
        System.out.println("Dog = "+ dog.getAge());
    }
}
