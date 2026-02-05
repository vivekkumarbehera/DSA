public class PatternProblem06 {
    public static void main(String[] args) {
        D(5);
    }
    static void D(int rows){
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }

            // Print stars with a space between
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
