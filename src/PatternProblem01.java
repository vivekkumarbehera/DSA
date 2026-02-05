import java.util.Scanner;

public class PatternProblem01 {
    public static void main(String[] args) {
        //star triangle
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        System.out.println("Enter the number here :  "+b );
        pattern(b);

    }
    static void pattern(int n){
        for (int row=1;row<=n;row++){
            for (int column = 1; column <= row ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
