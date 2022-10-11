package oop;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nina");
        map.put(2, "Sonja");
        map.put(3, "Ana");
        for (Map.Entry student : map.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
