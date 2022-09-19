package basics;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        //prompt user "Enter your grade"
        // A -| "Bravo"
        // B "Not bad"
        // C "Not great not terrible"
        // D "You can do better"
        // F "Fail"
        // default "Invalid garde"


        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String message;
        String grade = scanner.next().toUpperCase();

        scanner.close();

        switch (grade) {
            case "A":
                message = "Bravo";
                break;

            case "B":
                message = "Not bad";
                break;

            case "C":
                message = "Not great not terrible";
                break;


            case "D":
                message = "You can do better";
                break;

            case "F":
                message = "Fail";
                break;

            default:
                message = "Invalid grade";


        }

        System.out.println("Your message is " + message);

    }
}
