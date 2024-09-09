package Step_003.Lec_001;

import java.lang.reflect.Array;
import java.util.*;

public class P_004_removeDuplicates {
    public static void main(String[] args) {

    }
}

class Solution_P_004_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Integer[] arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        return set.size();
    }

    public int removeDuplicates2(int[] nums) {
        int count =1;
        for (int i=1;i<nums.length;++i){
            if(nums[i]!=nums[i-1]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
