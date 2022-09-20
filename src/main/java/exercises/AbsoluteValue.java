package exercises;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        System.out.println("Insert number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Absolut value of number " + number + " is: " + Math.abs(number) );

    }
}
