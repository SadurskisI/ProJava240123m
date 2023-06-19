package algorithms.homework.homework2;

public class Tower {
        public static void main(String[] args) throws Exception {

            towerSolve(3, "A","C","B");
        }


        public static void towerSolve(int n, String A,String C,String B) throws Exception {
            if (n <=0) throw new Exception("the number should be positive");
            if (n == 1){
                System.out.println("Move - " + A + " to - " + C);
            }
            else {
                towerSolve(n - 1, A, B, C);
                System.out.println("Move - " + A + " to - " + C);
                towerSolve(n -1, B, C, A);
            }
        }
    }

