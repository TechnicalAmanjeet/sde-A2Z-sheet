package Step_003.Lec_001;

public class P_001_LargestElementInArray {
    public static void main(String[] args) {

    }
}

class Solution_P_001_LargestElementInArray {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
