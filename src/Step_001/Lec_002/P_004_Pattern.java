package Step_001.Lec_002;

public class P_004_Pattern {
    public static void main(String[] args) {
//      n = 3
//      1
//      2 2
//      3 3 3

        Solution_P_004 sol = new Solution_P_004();
        sol.fourthPattern(4);
    }
}

class Solution_P_004 {
    protected void fourthPattern(int n) {
        int i = n;

        for (int j = 1; j <= n; j++) {
            int t = 1;
            while ( t++ <= j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}