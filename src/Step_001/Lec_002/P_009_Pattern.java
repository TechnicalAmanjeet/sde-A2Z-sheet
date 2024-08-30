package Step_001.Lec_002;

public class P_009_Pattern {
    public static void main(String[] args) {
//      n = 3
//          *
//        * * *
//      * * * * *
//      * * * * *
//        * * *
//          *

        Solution_P_009 sol = new Solution_P_009();
        sol.printNinePattern(10);
    }
}

class Solution_P_009 {
    protected void printNinePattern(int n) {
        for (int i = 0; i < n; i++) {
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
