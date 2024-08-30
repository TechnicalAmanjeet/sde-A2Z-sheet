package Step_001.Lec_002;

public class P_016_Pattern {
    public static void main(String[] args) {
//        n = 3
//        A
//        B B
//        C C C
        Solution_P_016.printSixteenthPattern(10);
    }
}

class Solution_P_016 {
    protected static void printSixteenthPattern(int n) {
        char character = 'A';
        int i = 1;
        while (i <= n) {
            char iterator = character++;
            int t = i;

            while (t-- > 0) {
                System.out.print(iterator + " ");
            }

            ++i;
            System.out.println();
        }
    }
}