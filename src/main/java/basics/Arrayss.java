package basics;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {

        //istog tipa moraju biti u jednom nizu
        //objekat je u javi
        //ArrayList
        /*BOLJI     int[] name = {1,2,3};
        int name [] = {1,2,3};
        int name [] = [6];
        BOLJI    int [] name = [6];
        int[] = {1,2,3};
        name[2] =3   -- uzika 3 član-a

         */

        int [] lottoTicket = new int[6];
        // prvi clan =6, drugi 7, treci 8, cetvrti 15, peti 28 i sesti 43

        lottoTicket [0] = 6;
        lottoTicket [1] = 7;
        lottoTicket [2] = 88;
        lottoTicket [3] = 10;
        lottoTicket [4] = 11;
        lottoTicket [5] = 88;
        System.out.println(lottoTicket[3]);

        // za stampanje 3 metode - for petlja for (int i=0; i<lottoTicket.lenght ; i++){sout (lottoTicket[i]);

        for (int i=0; i<lottoTicket.length; i++) {
            System.out.println(lottoTicket[i]);
        }


        // druga metoda :  enhanced for
        /*  for (element: array)
        statement


         */

        for (int j : lottoTicket) {
            System.out.println(j);
        }
// treca metoda
        System.out.println(Arrays.toString(lottoTicket));



        //Arrays.sort (arrayToSort);

        Arrays.sort(lottoTicket);
        for (int j : lottoTicket) {
            System.out.println(j);
        }

        // {100, 500, 11, 17, 1, 10}
        //ako ima u nizu br veci od 100, sout ("ima br veci..."
        //inace sout ("svi br su manji od 100"

        int [] numbers = {100, 500, 11, 17, 1};
        for (int i =0; i< numbers.length; i++){
            if (numbers [i] >100 ){
                System.out.println("ima");
            }
        }




    }
}
