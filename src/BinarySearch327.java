public class BinarySearch327 {
    public static void main(String[] args) {
        int[] nums = {-2,5,-1};
        System.out.println(countRangeSum(nums,-2,2));
    }

    public static int countRangeSum(int[] nums, int lower, int upper) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = 0; // reset for new subarray

            for (int j = i; j < nums.length; j++) {

                sum = sum + nums[j];   // add next element

                if (lower <= sum && sum <= upper) {
                    count += 1;
                }
            }
        }

        return count;
    }
}