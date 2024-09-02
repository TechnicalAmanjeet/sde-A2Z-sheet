package Step_001.Lec_004;

import java.util.Collections;
import java.util.Scanner;

public class P_004_ReverseBits {
    public static void main(String[] args) {
        int n = 555;
        Solution_P_004_ReverseBits.returnReverseBitLeetcode(n);
    }
}

class Solution_P_004_ReverseBits {
    public static void reverseBits() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            System.out.println(returnReverseBit(Integer.toBinaryString(num)));
        }
    }

    protected static int returnReverseBit(String num) {
        double maxInt = Integer.MAX_VALUE, minInt = Integer.MIN_VALUE;
        int revBitInt = 0;

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                double data = (double)(revBitInt) + (Math.pow(2, i));
                revBitInt = (int)data;
            }
        }
        return revBitInt;
    }

    protected static long returnReverseBitCodingNinja(long n) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31)
                result <<= 1;
        }
        return result;
    }

    protected static int returnReverseBitLeetcode(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31)
                result <<= 1;
        }
        return result;
    }
}
