import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number# " + count);
            boolean validNumber = obj.hasNextInt();
            if (validNumber) {
                int number = obj.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            obj.nextLine();
            System.out.println("Sum of the number is " + sum);
        }
    }
}