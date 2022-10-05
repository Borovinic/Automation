package oop;

public class Programmer extends Amplitudo {
    public static void main(String[] args) {

        Programmer sonja = new Programmer();
        System.out.println(sonja.bonus);
        System.out.println(sonja.getSalary());
        System.out.println(sonja.bonus + sonja.getSalary());
    }

    private int bonus = 100;

    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
