public class PattternClass04 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");

            }
            System.out.println();
        }

    }
}
