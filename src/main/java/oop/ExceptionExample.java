package oop;

public class ExceptionExample {
    public static void main(String[] args) {
        arithmeticException();
        nullException();
        test();
        try {
            String n = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void arithmeticException() {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void nullException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }
    }

    public static void test() {
        try {
            int[] a = new int[5];
            a[10] = 15;
        } catch (IndexOutOfBoundsException t) {
            System.out.println(t);
        }
    }
}

