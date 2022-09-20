package exercises;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {

        System.out.println("Insert number 1: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        System.out.println("Insert number 2: ");
        int number2 = scanner1.nextInt();
        scanner1.close();
        System.out.println("Bigger number is: " + Math.max(number1,number2));
    }
}
