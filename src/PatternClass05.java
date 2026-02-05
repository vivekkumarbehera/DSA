public class PatternClass05 {
    public static void main(String[] args) {

        pattern5(5);
    }
        static void pattern5(int n){
            for (int row = 1; row <=n ; row++) {
                for (int column = 1; column <=row ; column++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int row = 1; row <=n ; row++) {
                for (int column = 1; column <=n-row+ 2 ; column++) {
                    System.out.print("*");

                }
                System.out.println();
            }

        }
    }
