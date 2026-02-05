
public class LeetCodeProblem29 {
    public static void main(String[] args) {
        int d=-2147483648;
        int dv=-1;
        int du= divide(d,dv);
        System.out.println(du);


    }
    public static int divide(int dividend, int divisor) {
           if (dividend == 0){
               return 0;
           }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Avoid overflow
        }
           return dividend/divisor;
    }
}