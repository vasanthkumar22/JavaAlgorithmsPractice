package array;

import java.util.Arrays;

public class TwoSumArray {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(ints));


    }

    public static int[] twoSum(int[] nums, int target) {
        int check = 0;
        for(int i=0; i < nums.length; i++) {
            check = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == check){
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }



}
