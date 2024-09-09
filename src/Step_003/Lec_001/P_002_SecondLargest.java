package Step_003.Lec_001;

import java.util.Arrays;
import java.util.Collections;

public class P_002_SecondLargest {
    public static void main(String[] args) {

    }
}

class Solution_P_002_SecondLargest {
    public int print2largest(int[] arr) {
        // Code Here
        int first = arr[0], second = arr[1];
        if (second > first) {
            first = arr[1];
            second = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }else if (first == second) {
                second = arr[i];
            }
        }

        if (first == second) {
            return -1;
        }

        return second;
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        Arrays.sort(a);
        return new  int[]{a[n-2], a[1]};
    }
}
