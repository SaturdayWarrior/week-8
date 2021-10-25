import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int i, x = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = scn.nextInt();

        for (i = 2; i <= n / 2; ++i) {
            // condition for non-prime
            if (n % i == 0) {
                x = 1;
                break;
            }
        }

        if (n == 1) {
            System.out.println("1 is neither prime not composite.");
        } else {
            if (x== 0)
                System.out.println(n+" is a prime number." );
            else
                System.out.println(n+ " is not a prime number.");
        }

    }
}
