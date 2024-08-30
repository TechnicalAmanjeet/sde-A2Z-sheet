package Step_001.Lec_002;

public class P_015_Pattern {
    public static void main(String[] args) {
//        n = 3
//        A B C
//        A B
//        A

        Solution_P_015.printFifteenthPattern(10);
    }
}

class Solution_P_015 {
    protected static void printFifteenthPattern(int n) {
        while (n > 0) {
            int i = n;
            char character = 'A';

            while (i-- >0) {
                System.out.print(character++ + " ");
            }
            System.out.println();
            --n;
        }
    }
}
