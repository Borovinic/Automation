package exercises;

public class Prices {
    public static void main(String[] args) {

        discount(325.0, 15);
    }

    public static void discount(double price, double dics) {
        double pr = price;
        double ds = dics;
        double result = pr * (ds / 100);
        System.out.println(result);
    }
}
