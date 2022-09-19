package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int number = 3;
        while (number <= 10) {
            System.out.println(number + " is smaller or equal to 10");
            number ++;
        }

       // prompt "how many hours did you work lasr week?"
        // int maxHours = 40;
        // int hourRate = 45;
        // int gross=?
        // acutalHours > maxHours
        // Invalid number. Insert number between 1 and 40


        System.out.println("how many hours did you work lasr week?");
        Scanner scanner1 = new Scanner(System.in);

       int maxHours = 40;
        int hourRate = 45;
        int actualHours = scanner1.nextInt();

        while (actualHours > maxHours){
            System.out.println("Invalid number. Insert number between 1 and 40");
            actualHours = scanner1.nextInt();
        }

        int gross = actualHours*hourRate;
        System.out.println("Your gross is " + gross);

    }
}
