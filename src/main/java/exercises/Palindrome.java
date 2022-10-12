package exercises;

public class Palindrome {
    public static void main(String[] args) {
        palindromeChecker("anaVolimiLovana");
    }

    public static void palindromeChecker(String str) {

        String sb = new StringBuilder(str).reverse().toString().toLowerCase();
        if (sb.equals(str.toLowerCase())) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
