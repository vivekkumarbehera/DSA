public class BSRec {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 9, 7};
        System.out.println(BinarySearch(arr, 5, 0, arr.length));

    }

    public static int BinarySearch(int arr[], int target, int start, int end) {
            if (start > end) {
                return -1;
            }
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                return BinarySearch(arr, target, start, mid - 1);
            }
            return BinarySearch(arr, target, mid + 1, end);
        }
    }
