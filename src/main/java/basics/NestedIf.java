package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        // Da bi se kvalifikovao za pozajmcu osoba mora zarađivati min. 30000$ i raditi u firmi min. 2 god.

        int minYears = 2;
        int minSalary = 30000;

        System.out.println("How much was your salary?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long have you worked here?");

        int currentSalary = scanner.nextInt();
        int currentYears = scanner.nextInt();

        scanner.close();

        if (minSalary <= currentSalary) {
            if (currentYears >= minYears) {
                System.out.println("You are qualified.");
            } else {
                System.out.println("You are not qualified, you need to have at least " + minYears + "years.");
            }

        } else {
            System.out.println("You are not qualified, you need to have at least " + minSalary + "$.");
        }



    }
}

// kada nemamo dovoljno god. koliko nam jos treba
// kada nemam dovoljno $ , koliko sam procentualno dostigla targeta