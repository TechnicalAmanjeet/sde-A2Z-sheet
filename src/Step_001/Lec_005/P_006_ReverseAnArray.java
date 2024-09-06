package Step_001.Lec_005;

public class P_006_ReverseAnArray {
    public static void main(String[] args) {
        Solution_P_006_ReverseAnArray sol = new Solution_P_006_ReverseAnArray();
        System.out.println(sol.reverseAnArray(new int[]{1, 2, 3, 4, 5}));
    }
}

class Solution_P_006_ReverseAnArray {

    public int[] reverseAnArray(int[] nums) {
        reverseAnArray(nums, 0, nums.length -1);
        return nums;
    }

    private void reverseAnArray(int[] nums, int startIndex, int endIndex) {
        if (startIndex > endIndex) return;

        int temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;
        reverseAnArray(nums, startIndex+1, endIndex - 1);
    }
}
