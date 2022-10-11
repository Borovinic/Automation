package oop;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListg {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(7);
        al.add(2);
        al.add(6);
        al.add(9);
        System.out.println(al);

        for (Integer i : al) {
            System.out.println(i);
        }
        al.add(16);
        System.out.println("Size of list is " + al.size());
        System.out.println("Third element is " + al.get(2));
        al.remove(1);
        System.out.println("Print new list " + al);

        Collections.sort(al);
        System.out.println(al);
    }
}
