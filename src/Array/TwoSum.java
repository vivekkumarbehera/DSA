package Array;

import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[]{start,end};
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }

        return new int[]{};
    }
}
