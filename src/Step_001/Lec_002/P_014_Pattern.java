package Step_001.Lec_002;

public class P_014_Pattern {
    public static void main(String[] args) {
//        n = 3
//        A
//        A B
//        A B C

        Solution_P_014 sol = new Solution_P_014();
        sol.printFortenthPattern(10);
    }
}

class Solution_P_014 {
    protected void printFortenthPattern(int n) {
        int i = 1;

        while (i <= n) {
            char character = 'A';
            int t= i;

            while ( t-- > 0) {
                System.out.print(character++ + " ");
            }

            ++i;
            System.out.println();
        }
    }
}