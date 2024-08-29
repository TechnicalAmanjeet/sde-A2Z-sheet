package Step_001.Lec_002;

public class P_001_Pattern {
    public static void main(String[] args) {
//        N = 3

//        * * *
//        * * *
//        * * *
//
        Solution_P_001 sol = new Solution_P_001();
        sol.printFirstPattern(10);
    }
}

class Solution_P_001 {
    protected void printFirstPattern(int N) {
        int n = N;
        while (N-- > 0) {
            int t = n;
            while (t-- > 0) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
