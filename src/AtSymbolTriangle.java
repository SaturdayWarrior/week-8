import java.util.Scanner;

public class AtSymbolTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num of rows: ");
        int rows = scan.nextInt();

        //do for each row
        for (int i = 1; i <= rows; ++i) {
            //print @ i times
            for (int j = 1; j <= i; ++j) {
                System.out.print("@ ");
            }
            //to go to the next line
            System.out.println();

        }
    }
}