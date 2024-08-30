package Step_001.Lec_002;

public class P_013_Pattern {
    public static void main(String[] args) {
//        n = 3
//        1
//        2 3
//        4 5 6

        Solution_P_013 sol = new Solution_P_013();
        sol.printThirteenthPattern(10);
    }
}

class Solution_P_013 {
    protected void printThirteenthPattern(int n) {
        int num = 1, i = 1;

        while (i <= n) {
            int j= i;

            while ( j-- > 0) {
                System.out.print(num++ + " ");
            }
            System.out.println();
            ++i;
        }
    }
}
