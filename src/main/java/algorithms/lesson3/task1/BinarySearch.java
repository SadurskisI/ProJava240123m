package algorithms.lesson3.task1;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("index - "+binarySearch(arr,5,0,arr.length-1));

    }

    public static int binarySearch(int[] arr, int k, int start, int end){
        if (end>=start){
            int mid = (start + end) / 2;
            if (k == arr[mid]){ return mid; }
            else if (k > arr[mid]){ return binarySearch(arr,k,mid + 1,end); }
            else return binarySearch(arr,k,start,mid);
        }
        return -1;
    }
}
