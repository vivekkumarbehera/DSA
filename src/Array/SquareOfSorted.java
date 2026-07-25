package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareOfSorted {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println((Arrays.toString(sortedSquares(nums))));
    }


    public static int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            result[i]=nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }

}
