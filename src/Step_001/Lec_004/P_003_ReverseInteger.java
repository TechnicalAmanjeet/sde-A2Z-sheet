package Step_001.Lec_004;

public class P_003_ReverseInteger {
    public static void main(String[] args) {
        Solution_P_003.reverseBruteForce(321);
    }
}

class Solution_P_003 {
    public static int reverseBruteForce(int x) {
        int reversedNum = 0;
        double maxValue = Integer.MAX_VALUE, minValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);
        while (x != 0) {
            if (((double)reversedNum * 10) > maxValue || ((double)reversedNum * 10) < minValue) {
                return 0;
            }
            reversedNum = reversedNum * 10 + x % 10;

            x = x / 10;
        }

        return reversedNum;
    }

    protected static int recursiveReverse(int x) {
        return recursiveReverseSolution(x, x, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    protected static int recursiveReverseSolution(int num, int x, double intMax, double intMin, int reverse) {
        if (x == 0) return reverse;

        if (intMax < (double)reverse * 10 || intMin > (double)reverse * 10) {
            return 0;
        }


        return recursiveReverseSolution(num, x/10, intMax, intMin, (reverse * 10) + (x % 10));
    }
}