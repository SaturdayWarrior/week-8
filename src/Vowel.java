import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Alphabet : ");
        String alphabet = obj.next();
        if (!alphabet.matches("[a-zA-Z]")){
            System.out.println("Error");
        }else if (alphabet.matches("[aeiouAEIOU]")){
            System.out.println("is a Vowel");
        }else{
            System.out.println("It is a consonant.");
        }

    }
}
