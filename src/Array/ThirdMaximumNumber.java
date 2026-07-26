package Array;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        int element = 0;
        int n = nums.length;
        if (n == 1) {
            element = nums[0];
        } else if (n == 2) {
            element = Math.max(nums[0], nums[1]);
        } else {
            Arrays.sort(nums);
            int count = 0;
            int prev = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1 || nums[i] != prev) {
                    count++;
                    prev = nums[i];
                }
                if (count == 3) {
                    element = nums[i];
                    break;
                }
            }
            if (count < 3) {
                element = nums[n - 1];
            }
        }
        return element;
    }
}
