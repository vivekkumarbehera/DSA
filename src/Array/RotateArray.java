package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

    }
    public static void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        int j =0;
        int n = nums.length;
        for (int i = n-k; i < n ; i++) {
            temp[j]=nums[i];
            j++;
        }
        for (int i = 0; i <n-k ; i++) {
            temp[j]=nums[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
