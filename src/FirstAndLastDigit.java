public class FirstAndLastDigit {

    static int firstAndLastDigit(int number){
        if (number<0){
            return -1;
        }int lastDigit = number%10;
        while (number>=10){
            number /= 10;

        }return (number+lastDigit);

    }

    public static void main(String[] args) {
        System.out.println(firstAndLastDigit(252));
        System.out.println(firstAndLastDigit(257));
        System.out.println(firstAndLastDigit(0));
        System.out.println(firstAndLastDigit(5));
        System.out.println(firstAndLastDigit(10));
        System.out.println(firstAndLastDigit(-10));

    }
}
