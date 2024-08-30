package Step_001.Lec_002;

public class P_020_Pattern {
    public static void main(String[] args) {
//        n=3
//        *         *
//        * *     * *
//        * * * * * *
//        * *     * *
//        *         *
        Solution_P_020.printTwenteenthPattern(5);
    }
}

class Solution_P_020 {
    protected static void printTwenteenthPattern(int n) {
        int i = 1;
        while (i <= n) {
            int numberOfStar=i;
            int numberOfSpace = n-numberOfStar;

            while (numberOfStar-- > 0) {
                System.out.printf("* ");
            }

            while (numberOfSpace-- > 0) {
                System.out.printf("  ");
            }

            numberOfStar=i;
            numberOfSpace = n-numberOfStar;

            while (numberOfSpace-- > 0) {
                System.out.printf("  ");
            }

            while (numberOfStar-- > 0) {
                System.out.printf("* ");
            }
            System.out.println();
            ++i;
        }

        i=n-1;
        while (i>0) {
            int numberOfStar=i;
            int numberOfSpace = n-numberOfStar;

            while (numberOfStar-- > 0) {
                System.out.printf("* ");
            }

            while (numberOfSpace-- > 0) {
                System.out.printf("  ");
            }

            numberOfStar=i;
            numberOfSpace = n-numberOfStar;

            while (numberOfSpace-- > 0) {
                System.out.printf("  ");
            }

            while (numberOfStar-- > 0) {
                System.out.printf("* ");
            }
            System.out.println();
            --i;
        }
    }
}
