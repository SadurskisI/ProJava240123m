package javaPro.lesson4.task4;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square();

        System.out.println(square1 == square2);
        System.out.println(square1.equals(square2));
    }
}
