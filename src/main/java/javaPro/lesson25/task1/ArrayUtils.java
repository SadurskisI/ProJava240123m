package javaPro.lesson25.task1;

public class ArrayUtils {

    /**
     * Method return array with size 'size'
     * with integers from 1 to 'size'
     *
     * @param size array size
     * @return array with integers
     */
    public static int[] getArray(int size){
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i+1;
        }
        return result;
    }
}
