package exercises;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        System.out.println("Insert number 1-6:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("*");
        } else if (number == 2) {
            System.out.println("**");
        } else if (number == 3) {
            System.out.println("***");
        } else if (number== 4) {
            System.out.println("****");
        } else if (number == 5) {
            System.out.println("*****");
        } else {
            System.out.println("******");
        }

    }
}
