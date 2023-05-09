package javaPro.lesson04.task3;

public class AutoboxingMethods {
    public static void main(String[] args) {



    Integer[] array = {7,9,22};
    System.out.println(getSum(array));


    }
    public static Integer getSum(Integer[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

}
