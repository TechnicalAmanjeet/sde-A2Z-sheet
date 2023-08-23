package Step001.Step001_05;

public class OneToNWithOutLoop_01 {
    public static void main(String[] args) {
        int i = 0;
        int[] num = new int[]{6,2,3,4,5,6};

        num[i++] = i;

        i = 0;
        num[i] = i++;

        i=0;
        num[i] = ++i;
        System.out.println(i);
        System.out.println();
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] response = new  int[x];

        return printN(0, response, x);
    }

    private static int[] printN(int temp, int[] nums, int max) {
        if (temp == max - 1) {
            nums[temp] = ++temp;
            return nums;
        }

        nums[temp] = ++temp;
        return printN(temp, nums, max);
    }
}
