import Set.MyComparator;
import java.util.TreeSet;
public class DifferentLengthString {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("A");
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("xx");
        t.add("ABC");
        t.add("AB");
        t.add("A");
        System.out.println(t);
    }
}
