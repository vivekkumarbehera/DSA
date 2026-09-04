package Array;

import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
     int nums[]={0,1,0,3,12};
       moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
      int j =0;
      int temp;
        for (int i = 0; i< nums.length ; i++) {
            if(nums[i]!= 0){
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        System.out.print(Arrays.toString(nums));

    }
}

