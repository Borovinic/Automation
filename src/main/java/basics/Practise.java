package basics;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {

       //1. user enter age
        // check if user is adult (18)
        //2.user eneter years
        // check if year is leap , if true is leap, if false is regular
        //godina djeljiva sa 4, nije djeljiva sa 100 ili je djeljiva sa 400


        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number >= 18) {
            System.out.println("Is adult");

        } else {
            System.out.println("Is minor");
        }

        System.out.println("Insert year");
        int year = scanner.nextInt();
        if (year%4 ==0 && year%100 != 0 || year%400 ==0){
            System.out.println("Is leap");
        } else {
            System.out.println("Is regular");
        }

        // promt koliko ima korisnika
        // ya svakog korisnika koliko si imao bodova
        // ako je imao >10 bravo, ako ne Uci jos


        System.out.println("Number of students");
        int numberS = scanner.nextInt();
        for (int i = 0; i < numberS; i++) {
            System.out.println("Poeni");
             int points = scanner.nextInt();
             if (points > 10){
                 System.out.println("Bravo");
             } else {
                 System.out.println("Uci jos");
             }

        }
    }
}
