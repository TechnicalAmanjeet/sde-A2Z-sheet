package Step_001.Lec_002;

public class P_003_Pattern {
    public static void main(String[] args) {
        //      N = 3

//      1
//      1 2
//      1 2 3

        Solution_P_003 sol = new Solution_P_003();
        sol.printThirdPattern(10);
    }
}

class Solution_P_003 {
    protected void printThirdPattern(int n) {
        int i = 1;

        while (i <= n) {
            int t = 1;

            while (t <= i) {
                System.out.print(String.valueOf(t) + " ");
                ++t;
            }
            ++i;
            System.out.println();
        }
    }
}
