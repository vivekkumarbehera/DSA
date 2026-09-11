package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class MinimumIndex {

    public static void main(String[] args) {

    }

    public static String[] findRestaurant(String[] list1, String[] list2) {

        HashSet<String> set = new HashSet<>();

        for (String s : list1) {
            set.add(s);
        }

        int min = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {

            String s = list2[i];

            if (set.contains(s)) {

                for (int j = 0; j < list1.length; j++) {

                    if (list1[j].equals(s)) {

                        int sum = i + j;

                        if (sum < min) {
                            min = sum;
                            result.clear();
                            result.add(s);
                        }
                        else if (sum == min) {
                            result.add(s);
                        }

                        break;
                    }
                }
            }
        }

        return result.toArray(new String[0]);
    }
}