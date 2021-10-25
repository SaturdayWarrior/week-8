public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int input_number = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }
        if (input_number == reverse) {
            System.out.println("The number " + input_number + " is a palindrome number");
            return true;
        } else {
            System.out.println("The number " + input_number + "is not a palindrome number");
            return false;
        }

    }

    public static void main(String[] args) {
        isPalindrome(-12221);
        isPalindrome(707);
        isPalindrome(11212);
    }
}
