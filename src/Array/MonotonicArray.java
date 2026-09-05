package Array;

public class MonotonicArray {
    public static void main(String[] args) {


    }
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        boolean increasing = true;
        boolean decreasing = true;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
                increasing = false;
            }
            if (nums[i] < nums[j]) {
                decreasing = false;
            }
            i++;
        }
        return increasing || decreasing;
    }
}
