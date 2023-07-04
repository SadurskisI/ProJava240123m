package algorithms.lesson4;

import java.util.Arrays;


public class Main {

    public static void main(String args[]) {
        int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort((array))));

    }
    public static int[] combine(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int k=0;
        int[] arr = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while (i<arr1.length)
            arr[k++] = arr1[i++];
        while (j<arr2.length)
            arr[k++] = arr2[j++];
        return arr;
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length<=1){
            return arr;
        }
        int middle = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,middle);
        int[] right = Arrays.copyOfRange(arr,middle,arr.length);
        return combine(mergeSort(left),mergeSort(right));
    }
}