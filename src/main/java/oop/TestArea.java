package oop;

public class TestArea {
    static Rectangle a = new Rectangle(10.7, 15.0);
    static Square b = new Square(5);

    public static void main(String[] args) {

        double rectArea = a.calculateArea(a.getLength(), a.getWidth());
        System.out.println(rectArea);
        double squareArea = b.calculateArea(b.getSide());
        System.out.println(squareArea);
    }
}
