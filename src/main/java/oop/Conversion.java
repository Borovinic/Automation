package oop;

public class Conversion {
    public static void main(String[] args) {

        stringToInt();
        intToString();
    }

    public static void stringToInt() {
        String s = "100";
        System.out.println(s + 100);
        int i = Integer.parseInt(s); //jedan nacin
        System.out.println(i + 100);

        String st = "200";
        Integer in = Integer.valueOf(st);// drugi nacin, zavisi sta mi treba
        System.out.println(in + 200);


        //String name  = "Sonja";
        //Integer intt = Integer.valueOf(name);
        //System.out.println(intt+200);
    }

    public static void intToString() {

        int ii = 300;
        String s = String.format("%d", ii);
        System.out.println(s + 100);
        String ss = String.valueOf(ii);
        System.out.println(ss + 100);

        String sss = Integer.toString(ii); //od cega pravimo
        System.out.println(sss + 100);
    }
}
