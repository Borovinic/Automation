package oop;


    public class TestArea extends Square {


        static Rectangle a = new Rectangle();
        static Rectangle b = new Rectangle();

        public static void main(String[] args) {

            a.setLength(2.0);
            a.setWidth(2.0);
            System.out.println(a.getArea() + " Rectangle Area");

            //Circle
            b.setWidth(3.0);
            double circleArea = b.getWidth() * 3.144;
            System.out.println("Circle area:" + circleArea);

        }


    }
