package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        int arr[]={1,4,3,2};
        System.out.println(arrayPairSum(arr));

    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length ; i+=2) {
            sum = sum + Math.min(nums[i],nums[i+1] );
        }
        return sum;
    }
}
