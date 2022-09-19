package basics;

public class DataType {
    /*
    Primitivni:
    int - 0 (default)
    short
    byte
    double - decimal number -> 0.0d (default) - do 16decimala
    float - unlimited range -> 0.0f (default)
    char - 1 character -> 2byte -> 'u0000'-'uffff'
    long - 0l (default)
    boolean - true/false(default)

    Neprimitivni:
    string - čuva smisao - > array of characters () ->  String stringName= "actualString";
    array -varijable  istog tipa, poređeane u nizu ,a svaki karakter ima određeno mjesto tj. index koji pošinje od 0.
    class
    object
     */


    public static void main(String[] args) {
        boolean trueValue = true;
        double payment = 834.50;
        int years = 28;
        char firstLetter = 'A';
        int debt = -27640;

        System.out.println("This is " + trueValue + ".");
        System.out.println("Your payment is " + payment);
        System.out.println("You are " + years + " years old.");
        System.out.println("Your name starts with letter " + firstLetter);
        System.out.println("You are left with " + debt + " $");

        double a = 1;
        double b = 7;
        double c = 3;
        double average = (a+b+c) / 3;

        System.out.println("Zbir je " + (a+b) + ".");
        System.out.println("Srednja vrijednist je " + average + ".");






    }


}
