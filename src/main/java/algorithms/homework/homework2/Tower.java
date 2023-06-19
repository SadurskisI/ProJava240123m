package algorithms.homework.homework2;

public class Tower {
        public static void main(String[] args) {
            int nDisks = 3;
            TowerSolve(nDisks, "Left", "Middle", "Right");
        }
        public static void TowerSolve(int topN, String from, String inter, String  to) {
            if (topN == 1) {
                System.out.println("Plate 1 from " + from + " to " + to);
            } else {
                TowerSolve(topN - 1, from, to, inter);
                System.out.println("Plate " + topN + " from " + from + " to " + to);
                TowerSolve(topN - 1, inter, from, to);
            }
        }
    }

