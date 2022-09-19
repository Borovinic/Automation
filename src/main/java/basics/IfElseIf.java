package basics;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        // prompt ("What was zour test score?")
        // store in score
        // conditions
        // <60 -> F


        System.out.println("What was zour test score?");
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        char grade ;

        scanner.close();

        if (score<60) {
            grade= 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score< 80) {
            grade = 'C';
        } else if (score< 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}

// DOMAĆI - napraviti support da prima decimalne brojeve