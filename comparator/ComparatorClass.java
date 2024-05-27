package Set;

import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;

public class ComparatorClass {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(5);
        t.add(1);
        t.add(9);
        t.add(4);
        t.add(3);
        System.out.println(t);
        // Collections.sort(t,new ComparatorClass());
    }
}
