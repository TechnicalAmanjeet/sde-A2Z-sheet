package Step_001.Lec_002;

public class P_019_Pattern {
    public static void main(String[] args) {
//        n=3
//        * * * * * *
//        * *     * *
//        *         *
//        *         *
//        * *     * *
//        * * * * * *

        Solution_P_019.printNintenthPattern(10);
    }
}

class Solution_P_019 {
    protected static void printNintenthPattern(int n) {
        int i = n;

        while (i > 0) {
            int iterator = i;
            int numberOfStar = n - (n-iterator) * 1;
            int numberOfSpace = n - numberOfStar;

            while (numberOfStar-- > 0) {
                System.out.print("* ");
            }

            while (numberOfSpace-- > 0) {
                System.out.print("  ");
            }

            numberOfStar = n - (n-iterator) * 1;
            numberOfSpace = n - numberOfStar;

            while (numberOfSpace-- > 0) {
                System.out.print("  ");
            }

            while (numberOfStar-- > 0) {
                System.out.print("* ");
            }
            --i;
            System.out.println();
        }

        i = 1;
        while (i <= n) {
            int iterator = i;
            int numberOfStar = iterator;
            int numberOfSpace = n - numberOfStar;

            while (numberOfStar-- > 0) {
                System.out.print("* ");
            }

            while (numberOfSpace-- > 0) {
                System.out.print("  ");
            }

            numberOfStar = iterator;
            numberOfSpace = n - numberOfStar;

            while (numberOfSpace-- > 0) {
                System.out.print("  ");
            }

            while (numberOfStar-- > 0) {
                System.out.print("* ");
            }
            ++i;
            System.out.println();
        }
    }
}
