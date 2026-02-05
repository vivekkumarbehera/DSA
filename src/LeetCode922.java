public class LeetCode922 {
    public static void main(String[] args) {
        int [] arr={4,2,5,7};
        int []result=swap(arr);
        for(int num:result) {
            System.out.println(num+" ");
        }
    }
   public static int[] swap(int[] nums) {
        // Bubble Sort style: Move even numbers to even index and odd to odd index
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                // If even index pe odd number hai aur agle pe even hai — swap
                if (j % 2 == 0 && nums[j] % 2 != 0 && nums[j + 1] % 2 == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                // If odd index pe even number hai aur agle pe odd hai — swap
                else if (j % 2 != 0 && nums[j] % 2 == 0 && nums[j + 1] % 2 != 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    public static int[] sortArrayByParityII(int[] nums) {
           int n = nums.length;
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

        return sortArrayByParityII(nums);
    }
}
