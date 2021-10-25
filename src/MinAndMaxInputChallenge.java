import java.util.Scanner;

public class MinAndMaxInputChallenge {


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number or (0 to stop): ");
        int num = obj.nextInt();
        int max = num;
        int min = num;

        while (num != 0) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            System.out.println("Enter a number or (0 to stop): ");

            num = obj.nextInt();
        }
        if (max != 0 && min != 0) {
            System.out.println("the max number is " + max);
            System.out.println("the min number is " + min);

        }
    }
}