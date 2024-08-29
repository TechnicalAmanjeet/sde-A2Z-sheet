package Step_001.Lec_002;

public class P_005_Pattern {
    public static void main(String[] args) {
//      n = 3
//      * * *
//      * *
//      *

        Solution_P_005 solution = new Solution_P_005();
        solution.printFifthPattern(4);
    }
}

class Solution_P_005 {
    protected void printFifthPattern(int n) {
        while (n > 0) {
            int i = n;
            while (i-- > 0) {
                System.out.print("* ");
            }
            --n;
            System.out.println();
        }
    }
}
