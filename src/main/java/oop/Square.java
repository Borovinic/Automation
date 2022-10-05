package oop;

public class Square extends Rectangle {


    public Square() {
    }

    static Rectangle a = new Rectangle();

    public static void main(String[] args) {

        a.setWidth(2);
        a.setLength(2);

        a.getArea();
        System.out.println(a.getArea() + " area");

    }
}