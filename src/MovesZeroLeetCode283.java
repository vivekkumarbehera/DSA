public class MovesZeroLeetCode283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0; j < nums.length-i-1 ; j++) {
                if (j == 0) {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
