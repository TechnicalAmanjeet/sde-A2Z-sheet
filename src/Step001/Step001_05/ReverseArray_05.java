package Step001.Step001_05;

public class ReverseArray_05 {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4};
        for (int num : reverseArray(x.length, x)) {
            System.out.printf(num + " ");
        }
    }

    public static int[] reverseArray(int n, int []nums) {
        return reverseArrayReccursive(0, nums);
    }

    private static int[] reverseArrayReccursive(int i, int[] nums) {
        if (i == (nums.length/2)) {
            swapNumberInArray(nums, i, nums.length - i);
            return nums;
        }

        swapNumberInArray(nums, i, nums.length - i);
        return reverseArrayReccursive(++i, nums);
    }

    private static void swapNumberInArray(int[] nums, int si, int ei) {
        int temp = nums[si];
        nums[si] = nums[ei - 1];
        nums[ei - 1] = temp;
    }
}
