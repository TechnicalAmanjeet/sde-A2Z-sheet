package Step_001.Lec_002;

public class P_018_Pattern {
    public static void main(String[] args) {
//        n = 3
//        C
//        C B
//        C B A

        Solution_P_018.printEighteenthPattern(10);
    }
}

class Solution_P_018 {
    protected static void printEighteenthPattern(int n) {
        int i = 1;
        while (i<=n) {
            char charector = (char) ('A' + n - 1);
            int iterator = i;

            while (iterator-- > 0) {
                System.out.print(charector-- + " ");
            }
            System.out.println();
            ++i;
        }
    }
}
