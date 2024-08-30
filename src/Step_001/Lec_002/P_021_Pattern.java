package Step_001.Lec_002;

public class P_021_Pattern {
    public static void main(String[] args) {
//        n=3
//        ***
//        * *
//        ***

        Solution_P_021.printTwentyOnethPattern(3);
    }
}

class Solution_P_021 {
    protected static void printTwentyOnethPattern(int n) {
        int i = 1;
        int iter =n;

        while (iter-- > 0) {
            System.out.print("*");
        }

        if (n==1) return;

        while (i <= n -2) {
            int numberOfSpace = (n - 2);
            System.out.println();
            System.out.printf("*");

            while (numberOfSpace-- > 0) {
                System.out.print(" ");
            }

            System.out.print("*");
            ++i;
        }
        System.out.println();
         iter = n;

         while (iter-->0) {
             System.out.print("*");
         }
    }
}
