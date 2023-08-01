package algorithms.lesson01.bubbleSorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {


        int[] arr = {5,1,6,4,3,};
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        System.out.println("BubbleSort: " + Arrays.toString(bubbleSort(arr)));

//        System.out.println("Rocksort: "+ Arrays.toString(rockSort(arr)));

        System.out.println("InsertionSort: " + Arrays.toString(insertionSort(arr)));
    }

    public static int[] bubbleSort (int[] arr){
        for (int i=0; i< arr.length-1; i++){
            boolean changed = false;
            for (int j=0;j< arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changed = true;
                }
            }if (!changed) break;
        }return arr;
    }

    public static int[] rockSort (int[] arr){

        for (int i =0;i<arr.length-1; i++){
            boolean changed = false;
            for (int j= arr.length-2 ; j>=i ;j--){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true;
                    System.out.println("Rocksort: "+Arrays.toString(arr));
                }

            }if (!changed) break;
        }
     return arr;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 2; i < array.length; i++) {
            int key = array[i];

            while (i >= 1 && array[i - 1] > key) {
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = key;
        }
        return array;
    }
}
