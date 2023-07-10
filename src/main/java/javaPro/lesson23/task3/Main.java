package javaPro.lesson23.task3;

public class Main {
    public static void main(String[] args) {


        Pair<String, Double> pair = new Pair<>("Hello", 4.5);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<Double,Double> pair1 = new Pair<>(4.5, 5.4);
    }
}
