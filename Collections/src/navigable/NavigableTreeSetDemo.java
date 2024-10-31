package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();

        for (int i = 10; i <= 50; i+=10){
            s.add(i);
        }

        System.out.println(s);

        System.out.println(s.ceiling(20));
        System.out.println(s.higher(40));
        System.out.println(s.floor(10));
        System.out.println(s.lower(31));
        System.out.println(s.pollFirst());
        System.out.println(s.pollLast());
        System.out.println(s);
        System.out.println(s.descendingSet());

    }




}
