package Step001.Step001_05;

public class ProintNosReverse_03 {
    public static void main(String[] args) {
        int[] x = printNos(7);
        System.out.println(x);
    }


    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] nums = new int[x];

        return printNosReverse(nums, -1, x);
    }

    private static int[] printNosReverse(int[] nums, int i, int x) {
        if (++i == x-1) {
            nums[i] = x-i;
            return nums;
        }

        ++i;
        nums[i-1] = x-i+1;
        --i;
        return printNosReverse(nums, i, x);
    }

}


