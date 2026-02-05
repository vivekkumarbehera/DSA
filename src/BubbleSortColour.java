public class BubbleSortColour {
    public static void main(String[] args) {
      int[]  nums = {2,0,2,1,1,0};
      sortColors(nums);

    }
    public static void sortColors(int[] nums) {
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
        return;

        }
    }
