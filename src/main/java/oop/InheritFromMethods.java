package oop;

public class InheritFromMethods extends Methods {//extend da mogu iz druge klase pristupim tj.naslijedim. moguce je preko jedne u drugu pa preko te u trecu itd.
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.greetMe(); //nestaticko moram da instanciram i .pozivam njene metode


        calculate(4,6);
    }


}
