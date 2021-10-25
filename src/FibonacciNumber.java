import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter how many fibonacci number : ");
        int n = scanner.nextInt();
        n = n++;
        int a, b, c, i;
        a = b = 1;
        System.out.print(a + " " + b);
        for (i = 1; i <= n - 2; i++) {
            c = a + b;
            System.out.print(" ");
            System.out.print(c);
            a = b;
            b = c;
        }
    }

}
