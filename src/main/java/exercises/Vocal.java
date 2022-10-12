package exercises;

import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {

        System.out.println("Insert character:");
        Scanner scanner = new Scanner(System.in);
        char chh = scanner.next().charAt(0);
        vowelsConsonants(chh);
    }

    public static void vowelsConsonants(char character){
        char ch = character;
        if (ch == 'a' || ch == 'A' || ch == 'e'|| ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
            System.out.println("It is vowel.");
        } else {
            System.out.println("It is consonant.");
        }
    }
}
