import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] height={1,1,4,2,1,3};
        System.out.println( heightChecker(height));

    }
    public static int heightChecker(int[] heights) {
        int[] excepted = heights.clone();
        Arrays.sort(excepted);
        int count=0;
        for (int i = 0; i < heights.length ; i++) {
            if(heights[i] != excepted[i]){
                count++;

            }
        }
        return count;
    }
}
