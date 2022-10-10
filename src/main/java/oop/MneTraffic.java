package oop;

public class MneTraffic implements CentralTraffic2, EuropeTraffic {
    public static void main(String[] args) {
        CentralTraffic2 ct = new MneTraffic(); //jedina caka koju imamo ovdje
        ct.redLight();
        ct.yellowLight();
        ct.greenLight();
        System.out.println("Max speed is: " + MAX_SPEED);
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train is coming");
    }

    @Override
    public void exclamationSymbol() {
        System.out.println("Warning");
    }

    @Override
    public void redLight() {
        System.out.println("Stop");
    }

    @Override
    public void yellowLight() {
        System.out.println("Wait");
    }

    @Override
    public void greenLight() {
        System.out.println("Go");
    }
}
