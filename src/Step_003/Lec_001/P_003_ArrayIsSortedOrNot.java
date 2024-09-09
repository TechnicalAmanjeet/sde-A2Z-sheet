package Step_003.Lec_001;

public class P_003_ArrayIsSortedOrNot {
    public static void main(String[] args) {

    }
}

class Solution_P_003_ArrayIsSortedOrNot {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }

        return 1;
    }
}
