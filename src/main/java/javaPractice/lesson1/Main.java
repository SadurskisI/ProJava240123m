package javaPractice.lesson1;

import java.util.Arrays;

class LivingSpace {
    public String street;
    public int builder;
    public int floor;
    public String[] family;

    public void getSizeOfFamily(){
        System.out.println(family.length);
    }

    public LivingSpace(String street, int builder, int floor, String[] family) {
        this.street = street;
        this.builder = builder;
        this.floor = floor;
        this.family = family;
    }
    @Override
    public String toString(){
        return "Str: " + street + "; Builder: " + builder + "; fl.: " + floor + "; family: " + Arrays.toString(family);
    }

    public String getStreet() {
        return street;
    }
    public int getBuilder() {
        return builder;
    }
    public int getFloor() {
        return floor;
    }
    public String[] getFamily() {
        return family;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void setBuilder(int builder) {
        this.builder = builder;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void setFamily(String[] family) {
        this.family = family;
    }
}

public class Main {
    public static void main(String[] args) {
        LivingSpace space = new LivingSpace(
                "Seesrt.",10,3,new String[]{"Bob","Anna","Emily"}
        );

        System.out.println(space);
        space.setFloor(7);
        System.out.println(space);

    }
}