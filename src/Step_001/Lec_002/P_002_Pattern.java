package Step_001.Lec_002;

public class P_002_Pattern {
    public static void main(String[] args) {
//      N = 3

//      *
//      * *
//      * * *

        Solution_P_002 sol = new Solution_P_002();
        sol.printSecondPattern(2);
    }
}

class Solution_P_002 {
    protected void printSecondPattern(int N) {
        int i = 1;

        while (i <= N) {
            int t = i++;

            while (t-- > 0) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
