package lesson01.task1;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.age = 2.5;
        System.out.println(dog1.age);
        System.out.println(dog1.color);
    }
}
