package oop;

public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public Square( double side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea(double side) {
        double area = 0;
        area = 4*side;
        return area;
    }
}