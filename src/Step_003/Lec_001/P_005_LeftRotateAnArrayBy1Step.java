package Step_003.Lec_001;

public class P_005_LeftRotateAnArrayBy1Step {
    public static void main(String[] args) {
        Solution_P_005_LeftRotateAnArrayBy1Step.rotate(new int[]{1,2,3,4,5,6,7,8}, 3);
    }
}

class Solution_P_005_LeftRotateAnArrayBy1Step {
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] temp = new int[nums.length];

        for (int i = 0; i + k < nums.length; i++) {
            temp[i+k] = nums[i];
        }

        int i = 0;
        for (int j = k; j < nums.length; j++) {
            temp[i++] = nums[j];
        }

        for (int j=0;j<nums.length;++j) {
            nums[j] = temp[j];
        }

    }
}
