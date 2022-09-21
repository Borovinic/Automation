package exercises;

import java.util.Scanner;

public class FunctionSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = scanner.nextInt();
        if (0<=x && x<=100) {
            System.out.println("f(x)= " + (2*x));
            System.out.println("g(x)= " + Math.pow(x,2));
        } else
        {
            System.out.println("f(x)= " + 0);
            System.out.println("g(x)= " + 0);
        }
    }
}
