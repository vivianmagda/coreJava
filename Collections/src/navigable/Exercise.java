package navigable;

import java.util.TreeMap;

public class Exercise {

    public static void main(String[] args) {

        TreeMap<String, String> s = new TreeMap<>();

        s.put("A", "Apple");
        s.put("B", "Boy");
        s.put("C", "Cat");
        s.put("D", "Dog");

        System.out.println(s.floorKey(String.valueOf("C")));
        System.out.println(s.lowerKey(String.valueOf("B")));
        System.out.println(s.ceilingKey(String.valueOf("D")));
        System.out.println(s.higherKey(String.valueOf("A")));
        System.out.println(s.pollFirstEntry());
        System.out.println(s.descendingMap());


    }
}
