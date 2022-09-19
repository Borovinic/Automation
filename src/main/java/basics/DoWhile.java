package basics;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        /* do {
          //statemenent
          } while (condition)

        */
        // promt koji trazi od usera da unese 2 br. i onda ih sabere. Korisnik bi trebalo da moze da unois 2 broj
        // asve dok ne kaze eksplicitno true

        //promt user ("Insert 2 numbers")
        //sum num1 & num2
        //

        System.out.println("Insert 2 numbers");
        Scanner scanner = new Scanner(System.in);
        boolean answer;
        do {


            System.out.println("Insert number1");
            System.out.println("Insert number2");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Your sum is " + sum);

            System.out.println("Are you done?");
            answer = scanner.nextBoolean();

        } while (!answer);

//

    }
}


