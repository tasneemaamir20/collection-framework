import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDay2 {
    public static void main(String[] args) {
        HashMap <Integer,String> a=new HashMap<>();
        a.put(123, "Aamir");
        a.put(456, "Yash");
        a.put(789, "Rajuu");
        a.put(123, "Mohammad");

        System.out.println(a);

        LinkedHashMap <Integer,String> b=new LinkedHashMap<>();
        b.put(123, "Aamir");
        b.put(456, "Yash");
        b.put(789, "Rajuu");
        b.put(123, "Mohammad");

        System.out.println(a);


        TreeMap <Integer,String> c=new  TreeMap<>();


    }
}
