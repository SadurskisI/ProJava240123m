package javaPro.lesson06.task3;

public class TestMyArrayList {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("Hello");
        myArrayList.add("World");
        System.out.println();

        myArrayList.add(2,"!!!");
        System.out.println();
        myArrayList.size();

    }
}
