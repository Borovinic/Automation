package oop;

public class Methods {
    public static void main(String[] args) {
       // printName("Sonja");
        String name = printName2("Sonja");
        System.out.println(name + " tekst");

        calculate(2,3);
        int sum = calculate(4,6);
        System.out.println("Sum is " + sum);

        calculate(1,5,8);

       //kada nije static
        Methods methods = new Methods();
        methods.greetMe(); //kao kod scannera je pozivanje metode koju zelim da radim
        //ovo je instanciranje
    }

    public static void printName(String n) {
        System.out.println(n);
    }
    public static String printName2(String n){
        return n;
    }

    //metod calculate a,b broja  koji oduzima i sabira
    public static int calculate(int a, int b){
        int sum = a+b;
        System.out.println(a+b);
        System.out.println(a-b);
        return sum;
    }
    public static void calculate(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void greetMe(){
        System.out.println("Hello");
    }
}
