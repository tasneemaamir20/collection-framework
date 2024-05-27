import Set.MyComparator;
import java.util.TreeSet;

public class StringBufferPro {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("F"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }
}
