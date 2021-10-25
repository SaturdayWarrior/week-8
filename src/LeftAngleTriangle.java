import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, num_rows;

        System.out.println("Input the number of rows: ");
        num_rows = scan.nextInt();

        for (i = 0; i <= num_rows; i++) {
            for (j = 1; j <= num_rows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


