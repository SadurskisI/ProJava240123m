package javaPro.lesson04.task1;

public class Main {
    public static void main(String[] args) {

        int value = 7;
        Person person = new Person("Igor");
        System.out.println(value);
        System.out.println(person.getName());

        value = changeValue(value);
        changeValue(person);

        System.out.println("После вызова методов");
        System.out.println(value);
        System.out.println(person.getName());
    }

    public static int changeValue(int value){
        value++;
        return value;
    }

    public static void changeValue(Person person){
        person.setName("Max");
    }
}
