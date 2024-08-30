package Step_001.Lec_002;

public class P_012_Pattern {
    public static void main(String[] args) {
//        n = 3
//        1         1
//        1 2     2 1
//        1 2 3 3 2 1

        Solution_P_012 sol = new Solution_P_012();
        sol.printTwelthPattern(10);
    }
}

class Solution_P_012 {
    protected void printTwelthPattern(int n) {
        int p = n, t = 1;

        while (t <= n) {
            int i = t, num = 1;

            while (i-- > 0) {
                System.out.print(num++ + " ");
            }

            i = p - t;
            while (i-- > 0) {
                System.out.print("  ");
            }

            i = p - t;
            while (i-- > 0) {
                System.out.print("  ");
            }

            num = t;
            i = t;
            while (i-- > 0) {
                System.out.print(num-- + " ");
            }

            System.out.println();
            ++t;
        }
    }
}
