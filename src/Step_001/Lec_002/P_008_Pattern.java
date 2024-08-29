package Step_001.Lec_002;

public class P_008_Pattern {
    public static void main(String[] args) {
//      n = 3
//      * * * * *
//        * * *
//          *

        Solution_P_008 sol = new Solution_P_008();
        sol.printEighthPattern(10);
    }
}

class Solution_P_008 {
    protected void printEighthPattern(int n) {
        for (int i = n-1; i >= 0; i--) {
            int numberOfStar = (i * 1) + 1;
            int numberOfSpaceFirstHalf = n - numberOfStar;
            int numberOfSpaceSecondHalf = numberOfSpaceFirstHalf;
            int numberOfStarFirstHalf = numberOfStar - 1;

            while (numberOfSpaceFirstHalf-- > 0) {
                System.out.printf(" ");
            }
            while (numberOfStar-- > 0) {
                System.out.printf("*");
            }

            while (numberOfStarFirstHalf-- > 0) {
                System.out.printf("*");
            }

            while (numberOfSpaceSecondHalf-- > 0) {
                System.out.printf(" ");
            }

            System.out.println();
        }
    }
}
