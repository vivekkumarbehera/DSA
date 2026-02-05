public class PatternProblem3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n-row+1 ; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
