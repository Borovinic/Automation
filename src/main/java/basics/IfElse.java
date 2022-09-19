package basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // odd or even
        // prompt user
        // scanner
        // store in number var
        // print "Even number" if number is even
        // print " Odd number" if number is odd

        // n %2 == 0-> even

/*
        System.out.println("Insert number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd number ");
        }

 */

        // prompt user ("How many sales did you have?")
        // scanner
        // store variable actualSales
        // expected sales = 10
        // > expected sales => "Bravo"
        // < " You can do better"


        System.out.println("How many sales did you have? ");
        Scanner scanner1 = new Scanner(System.in);

        int actualSales = scanner1.nextInt();
        int expected = 10;

        scanner1.close();

        if (expected < actualSales) {
            System.out.println("Bravo");
        } else {
            System.out.println("You can do betetr"); // DODATI koliko treba da bi dostigao target?
        }
    }
}
