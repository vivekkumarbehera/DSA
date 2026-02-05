import java.util.ArrayList;
import java.util.List;

public class LetCode442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        LetCode442 obj = new LetCode442();
        List<Integer> duplicates = obj.findDuplicates(nums);
        System.out.println(duplicates);  // Should print [2, 3]
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // Swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                if (i != correct) {
                    // Found duplicate
                    if (!ans.contains(nums[i])) {  // to avoid adding same duplicate twice
                        ans.add(nums[i]);
                    }
                }
                i++;
            }
        }
        return ans;
    }
}
