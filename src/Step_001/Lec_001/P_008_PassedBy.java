package Step_001.Lec_001;

public class P_008_PassedBy {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] response = solution.passedBy(10, 20);
    }
}

class Solution {
    static int[] passedBy(int a, int b) {
        // code here

        return new int[]{a + 1, b+2};
    }
}