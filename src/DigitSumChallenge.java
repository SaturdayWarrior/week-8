

public class DigitSumChallenge {
    public  static int sumDigit(int number){

        if (number < 10){
            System.out.println("Error" );
            return -1;
        }
        int sum = 0;
        while (number > 0){
            sum = sum + number %10;
            number = number/10;

        }
        System.out.println("the sum of the digit is: "+sum);
        return sum;
       }

    public static void main(String[] args) {
        sumDigit(125);
        sumDigit(123);
        sumDigit(0);
        sumDigit(9);
        sumDigit(12);

    }


    }
