import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] nums={5,1,1,2,0,0};
       int[] result=sortArray(nums);
        System.out.println(Arrays.toString(result));

    }
    public  static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
