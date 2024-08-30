package Step_001.Lec_002;

public class P_010_Pattern {
    public static void main(String[] args) {

        Solution_P_010 sol = new Solution_P_010();
        sol.printTenthPattern(3);
    }
}

class Solution_P_010 {
    protected void printTenthPattern(int n) {
        int i = 1;

        while (i <= n) {
            int t = i++;

            while (t-- > 0) {
                System.out.print("* ");
            }
            System.out.println();
        }

        --n;
        while (n > 0) {
            i = n;
            while (i-- > 0) {
                System.out.print("* ");
            }
            --n;
            System.out.println();
        }
    }
}
