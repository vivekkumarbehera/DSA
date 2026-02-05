import java.util.Arrays;

public class MinMovesToStudent {
    public static void main(String[] args) {
        int seats[] = {3, 1, 5};
        int[] student = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, student));  // Output: 4
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);     // ✅ sort karna jaruri
        Arrays.sort(students);  // ✅ sort karna jaruri

        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}
