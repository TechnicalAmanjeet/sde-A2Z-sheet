package Step_001.Lec_006;

import java.util.HashMap;

public class P_001_CountFreequencyOfArrayElement {
    public static void main(String[] args) {

    }
}

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        int[] countP = new int[Math.max(N, P)];

        for (int i = 0; i < N; i++) {
            countP[arr[i]-1]++;
        }

        for (int i = 0; i < N; i++) {
            arr[i]  = countP[i];
        }
    }

    public static void frequencyCount2(int arr[], int N, int P) {
        // do modify in the given array
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            arr[i]  = map.getOrDefault(i+1, 0);
        }
    }
}

