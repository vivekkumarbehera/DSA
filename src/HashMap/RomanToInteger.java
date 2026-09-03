package HashMap;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c = s.toCharArray();

        int sum = 0;

        for (int i = 0; i < c.length; i++) {

            int current = map.get(c[i]);

            if (i + 1 < c.length && current < map.get(c[i + 1])) {
                sum = sum - current;
            } else {
                sum = sum + current;
            }
        }

        return sum;
    }
}