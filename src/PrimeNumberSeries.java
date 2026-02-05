import java.util.Scanner;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("There are no prime numbers less than or equal to " + num);
        } else {
            System.out.println("Prime numbers up to " + num + " are:");
            for (int i = 2; i <= num; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}