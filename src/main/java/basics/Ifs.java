package basics;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {

        System.out.println(" Insert number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.println(" Your number is: " + number);

        if (number % 2== 0) {
            System.out.println("Paran broj");
        }
        scanner.close();

        /* 2. task-  osnovica Zarade je 1000. Ukoliko je zapoeleni ostvario kvotu od min.10 prodaja palat mu se uvećava
        250e.Ištampati platu zaposlenog.
        */


        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        // How many sales did you have?
        // Store this value in actual sales
        // actualSales >= quota


        System.out.println("How many sales did you have? ");
        Scanner scanner1 = new Scanner(System.in);

        int actualSales = scanner1.nextInt();


        if (actualSales >= quota) {
             salary += bonus;
        }
        System.out.println("Your salary is: " + salary);
        scanner1.close();





    }



}
