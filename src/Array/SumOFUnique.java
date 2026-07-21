package Array;

public class SumOFUnique {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(num(nums)); // Output: 4 (1 + 3)
    }

    public static int num(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue; // skip if already marked duplicate

            boolean isDuplicate = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true; // mark duplicates
                    isDuplicate = true;
                }
            }

            // only add if not duplicate
            if (!isDuplicate) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
