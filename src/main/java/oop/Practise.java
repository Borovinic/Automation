package oop;

import java.util.Scanner;

public class Practise {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        messageCharacters();
        absoluteValue();
        bigger();
        bigger2();
        biggerSmaller();
        escaping();
        functionSolver();
        mathCalculations();
        printCalculation();
        printStars();


        scanner.close();
    }

    public static void absoluteValue() {
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        System.out.println("Absolut value of number " + number + " is: " + Math.abs(number));


    }

    public static void bigger() {
        System.out.println("Insert first number to calculate bigger one: ");
        int number1 = scanner.nextInt();
        System.out.println("Insert second number to calculate bigger one: ");
        int number2 = scanner.nextInt();
        System.out.println("Bigger number is: " + Math.max(number1, number2));
    }

    public static void bigger2() {
        System.out.println("Insert first number to calculate bigger one:");
        int number3 = scanner.nextInt();
        System.out.println("Insert second number to calculate bigger one:");
        int number4 = scanner.nextInt();
        if (number3 != number4) {
            System.out.println("Number " + Math.max(number3, number4) + " is bigger than number " + Math.min(number3, number4) + ".");
        } else {
            System.out.println("Number " + number3 + " is the same like number " + number4 + ".");
        }
    }

    public static void biggerSmaller() {
        System.out.println("Insert first number to calculate bigger/smaller number: ");
        int number1 = scanner.nextInt();
        System.out.println("Insert second number to calculate bigger/smaller number: : ");
        int number2 = scanner.nextInt();
        System.out.println("Bigger number is: " + Math.max(number1, number2));
        System.out.println("Smaller number is: " + Math.min(number1, number2));
    }

    public static void escaping() {
        System.out.println("Name" + "   Height" + "   Gender");
        System.out.println("----------------------");
        System.out.println("Anna\t5\'4    \tF");
        System.out.println("Test\t6\'2    \tM");
        System.out.println("Ben \t5\'7    \tM");
    }


    public static void functionSolver() {
        System.out.println("Enter the number:");
        int x = scanner.nextInt();
        if (0 <= x && x <= 100) {
            System.out.println("f(x)= " + (2 * x));
            System.out.println("g(x)= " + Math.pow(x, 2));
        } else {
            System.out.println("f(x)= " + 0);
            System.out.println("g(x)= " + 0);
        }
    }


    public static void mathCalculations() {

        double a = 2.8;
        double b = 3.1;
        double c = 6.0;
        int d = 2;
        System.out.println(a + b);
        System.out.println(Math.abs(a));
        System.out.println(Math.round(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.exp(a));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(d, c));
    }

    public static void messageCharacters() {
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        int number = message.length();
        if (number > 6 && number < 10) {
            System.out.println("Your message is: " + message);
        } else {
            System.out.println("Your message must be between 6 and 10 characters");
        }
    }

    public static void printCalculation() {
        int a = 299;
        int b = 800;
        int sum = a + b;
        System.out.println("     " + a);
        System.out.println("+    " + b);
        System.out.println("--------");
        System.out.println("    " + sum);
    }

    public static void printStars() {
        System.out.println("Insert number 1-6:");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("*");
        } else if (number == 2) {
            System.out.println("**");
        } else if (number == 3) {
            System.out.println("***");
        } else if (number == 4) {
            System.out.println("****");
        } else if (number == 5) {
            System.out.println("*****");
        } else {
            System.out.println("******");
        }

    }


}
