package lesson01.task1;

public class Dog {
    private String breed;
    private double age;
    private String color;


    public Dog(String breed, double age, String color) {
        if (age < 0) {
            System.out.println("Incorrect age number");
            age = 0;
        }
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Dog(String breed, String color){
        this.breed = breed;
        this.color = color;
    }

    public Dog(){}

    public double getAge(){
        return age;
    }

    public void setAge(double age){
        if (age < 0) {
            System.out.println("Incorrect age number");
            age = 0;
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void bark() {
        System.out.println("Gaav!");
    }

    void sleep(){
        System.out.println("Want some sleep!");
    }

    void eat(){
        System.out.println("Wanna eat!");
    }

}
