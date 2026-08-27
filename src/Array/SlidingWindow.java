package Array;
public class SlidingWindow {
    public static void main(String[] args) {
      int[] arr = {100,48,82,57,34,112,65};
      int k =3;
      SlidingWindow(arr,3);
    }
        public static void SlidingWindow(int nums[], int k) {
            int windowSum = 0;
            int high = Integer.MIN_VALUE;
            for (int i = 0; i < k; i++) {
                windowSum += nums[i];
            }

            high = windowSum;
            for (int i = 1; i <= nums.length - k; i++) {
                windowSum = windowSum - nums[i - 1] + nums[i + k - 1];

                high = Math.max(high, windowSum);
            }

            System.out.println("Maximum sum = " + high);
        }
}
