import java.util.Arrays;

public class letcode349 {
    public static void main(String[] args){
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
        int[] result= intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
                Arrays.sort(nums1);
                Arrays.sort(nums2);
                for(int num:nums1){
                    for(int num2:nums2){
                       if( num == num2){
                           return new int[]{num};
                       }
                    }

                }
                return new int[]{-1,-1};

    }
}
