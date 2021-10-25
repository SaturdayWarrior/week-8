public class ArmstrongNumber {
    public static void main(String[] args) {
        //input any number and check if it Armstrong number or not
        int originalNum, reminder, result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check ArmStrong number: ");
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();
        originalNum=number;
        while (originalNum !=0){
            reminder = originalNum %10;
            result+= Math.pow(reminder,length);
            originalNum /=10;
        }if (result == number){
            System.out.println(number + " Armstrong number.");
        }else {
            System.out.println(number + " Not a Armstrong number");
        }
    }
}
