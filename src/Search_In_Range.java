public class Search_In_Range {
    public static void main(String[] args) {
        int num[] = {3, 5, 2, 6, 24, 3, 7};
        int target = 24;
        int result = search_in_range(num, target, 1, 5);

        if (result != -1) {
            System.out.println("The result found at index: " + result);
        } else {
            System.out.println("The result is not found.");
        }
    }

    public static int search_in_range(int num[], int target, int start, int end) {
        if (num.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) { //ye index starting se leke end tak jaata hai
            int element = num[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
