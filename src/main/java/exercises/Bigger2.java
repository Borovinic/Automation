package exercises;

import java.util.Scanner;

public class Bigger2 {
    public static void main(String[] args) {

        System.out.println("Insert number 1:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Insert number 2:");
        int number2 = scanner.nextInt();
        scanner.close();
        if (number1 != number2){
            System.out.println("Number " + Math.max(number1,number2) + " is bigger than number " + Math.min(number1,number2) + ".");
        } else {
            System.out.println("Number " + number1 + " is the same like number " + number2 + ".");
        }

    }
}
