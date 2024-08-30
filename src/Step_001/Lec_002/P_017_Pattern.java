package Step_001.Lec_002;

public class P_017_Pattern {
    public static void main(String[] args) {
//        n = 3
//            A
//          A B A
//        A B C B A

        Solution_P_017.printSeventeenthPattern(10);
    }
}

class Solution_P_017 {
    protected static void printSeventeenthPattern(int n) {
        int i = 1;

        while (i <= n) {
            char character = 'A';
            int numberOfCharacter = i;
            int numberOfSpace = n - i;

            while ( numberOfSpace-- > 0 ) {
                System.out.print("  ");
            }

            while ( numberOfCharacter-- > 0 ) {
                System.out.print(character++ + " ");
            }

            numberOfCharacter = i - 1;
            character--;
            while ( numberOfCharacter-- > 0 ) {
                System.out.print(--character + " ");
            }
            ++i;
            System.out.println();
        }
    }
}
