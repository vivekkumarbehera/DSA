package Array;

import java.util.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int product;
        Arrays.sort(nums);

        int firstmax = nums[nums.length - 1];
        int secMax = nums[nums.length - 2];

        product = (firstmax-1)  * (secMax-1);

        return product;
    }
}