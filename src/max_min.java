public class max_min {
    public static void main(String[] args) {
        int num[] = {12, 8, 16, 13, 15};
        System.out.println(min(num));
    }

    static int min(int[] num) {
        if (num.length == 0) {
            return -1;
        }
        int min = num[0];  // start with first element
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}
