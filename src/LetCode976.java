public class LetCode976 {
    public static void main(String[] args) {
        int[] nums={2,1,2};
       int p= largestPerimeter(nums);
        System.out.println(p);
    }
    public static int largestPerimeter(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] < nums[j]) {
                    int temp = 0;
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int sum=0;
        for (int i = 0; i < nums.length-2 ; i++) {
            if (nums[i+1]+nums[i+2]>nums[i]){
                sum = nums[i]+nums[i+2]+nums[i+1];
                break;
            }
        }
        return sum;
    }

}
