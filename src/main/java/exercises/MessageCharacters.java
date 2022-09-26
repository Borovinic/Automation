package exercises;

import java.util.Scanner;

public class MessageCharacters {
    public static void main(String[] args) {

        System.out.println("Write a message: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int number =  message.length();
        if (number>6 && number<10){
            System.out.println("Your message is: " + message);
        } else {
            System.out.println("Your message must be between 6 and 10 characters..");
        }
    }
}
