public class PatternProblem02 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n ; column++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
