package Step_001.Lec_002;

public class P_022_Pattern {
    public static void main(String[] args) {
        Solution_P_022.printTwentyTwoPattern(5);
    }
}

class Solution_P_022 {
    protected static void printTwentyTwoPattern(int n) {
        for(int i=0;i<2*n-1;i++){

            for(int j=0;j<2*n-1;j++){

                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;

                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)));
            }

            System.out.println();
        }
    }
}
