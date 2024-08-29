package Step_001.Lec_002;

public class P_006_Pattern {
    public static void main(String[] args) {
//      n = 3
//      1 2 3
//      1 2
//      1

        Solution_P_006 sol = new Solution_P_006();
        sol.printSixthPattern(3);
    }
}

class Solution_P_006 {
    protected void printSixthPattern(int n) {
        while (n > 0) {
            int i = 1;
            while (i<=n) {
                System.out.print(i + " ");
                ++i;
            }
            System.out.println();
            --n;
        }
    }
}
