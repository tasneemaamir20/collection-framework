import java.util.TreeSet;

import Set.MyComparator;

public class TreeSetForString {
    public static void main(String[] args) {
        TreeSet<String> t=new TreeSet<>(new MyComparator());
        t.add("Aamir");
        t.add("Rahman ");
        t.add("Bholu");
        t.add("Arman");
        System.out.println(t);
    }
}
