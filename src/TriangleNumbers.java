import java.util.Scanner;

public class TriangleNumbers {

    /* public static void main(String[] args) {
         int i , j , y;

         System.out.println("Enter number of row: ");
         Scanner scn =new Scanner(System.in);
         y = scn.nextInt();
         for (i=1; i>=y; i++){
             for (j=1; j>=y; i++)
                 System.out.println(j);
                // System.out.println("");
             }
         }
     }*/
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
