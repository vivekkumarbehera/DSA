import java.util.Arrays;

public class RelativeRank {
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] index = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Bubble sort descending with index swap
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (score[j - 1] < score[j]) {
                    int temp = score[j - 1];
                    score[j - 1] = score[j];
                    score[j] = temp;

                    int tempIndex = index[j - 1];
                    index[j - 1] = index[j];
                    index[j] = tempIndex;
                }
            }
        }

        // Ranks assign
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[index[i]] = "Gold Medal";
            } else if (i == 1) {
                result[index[i]] = "Silver Medal";
            } else if (i == 2) {
                result[index[i]] = "Bronze Medal";
            } else {
                result[index[i]] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}
