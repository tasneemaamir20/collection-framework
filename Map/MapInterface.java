
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapInterface{
    public static void main(String[] args) {
        HashMap <Integer,String> a=new HashMap<>();
        a.put(224145, "Iltifatganj");
        a.put(224190 , "Tanda");
        a.put(226026, "Hazratganj");
        a.put(110025, "Okhla");
        System.out.println(a);

        HashMap <Integer,String> b=new HashMap<>();
        b.put(220060, "Dsauli");
        b.put(220045, "lalbagh");
        b.put(224418, "Tedhipulia");
        System.out.println(b);

        // putAll()
        b.putAll(a);
        System.out.println(b);

        // containsKey()
        System.out.println(b.containsKey(224145));

        // containsValue()
        System.out.println(b.containsValue("Tanda"));

        // get()
        System.out.println(b.get(224145));

        Collection<String> c = b.values();

       
        Iterator <String> i= c.iterator();



        Set<Integer> s=b.keySet();
        for(int x:s)
        {
            System.out.println(s);
        }
        System.out.println(b.size());
    }
}