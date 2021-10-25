public class EvenDigitSum<i> {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("-1");
            return -1;
        }
        int total = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                total += number % 10;
            }
            number = number / 10;
        }
        System.out.println("The sum of even digit number is: " + total);
        return total;
    }

    public static void main(String[] args) {
        getEvenDigitSum(12345678);
        getEvenDigitSum(252);
        getEvenDigitSum(-1);

    }

}
