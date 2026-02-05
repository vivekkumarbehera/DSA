public class CalculateRoatedArray {
    public static void main(String[] args) {
        int num[] = {16,18,0,1,2,6,8};
        System.out.println("Array is rotated " + countRotations(num) + " times.");
    }

    static int countRotations(int nums[]) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // Array is not rotated
            return 0;
        }
        // Number of rotations = pivot + 1
        return pivot+1 ;
    }

    public  static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Check if mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Decide which side to go
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
