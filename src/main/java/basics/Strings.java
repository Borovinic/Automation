package basics;

import java.security.spec.RSAOtherPrimeInfo;

public class Strings {
    public static void main(String[] args) {

        /*
        String e="";
        String n = null;
        String space = " ";

        .substring (x,y);
        x- prvi karakter koji uyimam u obyir
        y - prvi karakter koji ne uyimam u obyir
         */

        String country = "Montenegro";
        String monte = country.substring(0,5);
        String negro = country.substring(5,10);
        System.out.println(monte);
        System.out.println(negro);

        String monteput = monte + "put";
        String bomboneNegro = "bombone" + negro;
        System.out.println(monteput);
        System.out.println(bomboneNegro);


        String name = "Sonja";
        String surname = "Borovinic";
        int age = 33;
        System.out.println(name + " " + surname + " " + age);

        String surname1 = "Test";
         if (surname.equals(surname1)){
             System.out.println("Ista prezimena");
         } else {
             System.out.println("Nisu ista");
         }

// da li je string e prazan
        //ako jeste "jeste"
        //ako nije "nije"


        String e = "";
         if (e.length() == 0 || e.equals("")) {
             System.out.println("Jeste");
         } else {
             System.out.println("Nije");
         }


         //charAt(index)

        String amp = "Amplitudo";
         char firstLetter = amp.charAt(0);
        System.out.println(firstLetter);


        // contains () - vraca true/false
        // amp.contains("mpl");

        System.out.println(amp.contains("mpl"));


        String amp1 = amp.toUpperCase();
        System.out.println(amp1);

        System.out.println(amp.toLowerCase());


        System.out.println(amp1.equalsIgnoreCase(amp));

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(amp).reverse());

        //ctrl+j -sve metode da mi izbaci


        //Koliko ima riječi u rečenici

        String sentence = "Koliko ima riječi u rečenici?";
        int number = sentence.split(" ").length;
        System.out.println(number);











    }

}
