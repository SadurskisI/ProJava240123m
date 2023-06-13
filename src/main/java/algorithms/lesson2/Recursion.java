package algorithms.lesson2;

public class Recursion {
    public static void main(String[] args) throws Exception {

        System.out.println(progression(5));
        System.out.println(progressionRecursion(5));
        System.out.println(fibonacci(6)); // 0 1 1 2 3 5 8 13
        System.out.println(recursionFibonacci(100)); // 0 1 1 2 3 5 8 13

    }

    public static int progression(int n) throws Exception {
        if (n <=0) throw new Exception("the number should be positive");
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }


    public static int progressionRecursion(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 1;

        return progressionRecursion(n-1)+n;
    }

    public static int fibonacci(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 3; i <= n; i++) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;
    }

    public static int recursionFibonacci(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;

        return recursionFibonacci(n -1) + recursionFibonacci(n - 2);
    }
}
