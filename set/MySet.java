package Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(1);
        t.add(9);
        t.add(5);
        t.add(8);
        // t.add(null);      // NullPointerException when the Treeset is empty then we can insert null 
        // t.add("tas");    // it throws ClassCastException if we want to insert heterogenous data in the TreeSet 
        System.out.println(t);
        // System.out.println("A".compareTo("B"));
        // System.out.println("B".compareTo("A"));
        // System.out.println("A".compareTo("A"));



        

    }
}
