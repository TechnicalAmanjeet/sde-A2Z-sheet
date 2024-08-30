package Step_001.Lec_002;

public class P_011_Pattern {
    public static void main(String[] args) {
//      int n = 3;
//      1
//      0 1
//      1 0 1

        Solution_P_011 sol = new Solution_P_011();

        sol.printEleventhPattern(10);
    }
}

class  Solution_P_011 {
    protected void printEleventhPattern(int n) {
        int number = 0, iterator = 1;

        while (iterator <= n) {
            if (iterator % 2 == 0) {
                number = 1;
            } else {
                number = 0;
            }

            int i = iterator;

            while (i-- > 0) {
                number = getNumberToPrint(number);
                System.out.print(number + " ");
            }

            ++iterator;
            System.out.println();
        }
    }

    protected int getNumberToPrint(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        return -1;
    }

}
