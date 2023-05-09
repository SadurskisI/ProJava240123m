package javaPro.lesson05.task1;

public class BinarySearch {

    public static int search (int[] numbers,int searchNumber) {
        int start = 0;
        int end = numbers.length-1;
        int counter = 0;
        while (start <= end){
            counter++;
            System.out.println(counter);
            int half = (end + start)/2;
            if (searchNumber == numbers[half]){
                return half;
            } else if (searchNumber < numbers[half]) {
                end = half -1;
            } else {
                start = half + 1;
            }
        }
        return -1;
    }

    public static int simpleSearch(int[] numbers, int searchNumber){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber){
                return i;
            }
        }return -1;
    }
}
