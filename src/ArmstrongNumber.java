public class ArmstrongNumber {
    public static void main(String[] args) {
        int number =153, originalNum, reminder, result=0;
        originalNum=number;
        while (originalNum !=0){
            reminder = originalNum %10;
            result+= Math.pow(reminder,3);
            originalNum /=10;
        }if (result == number){
            System.out.println(number + " Armstrong number.");
        }else {
            System.out.println(number + " Not a Armstrong number");
        }
    }
}
