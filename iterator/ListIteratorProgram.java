import java.util.LinkedList;
import java.util.*;
public class ListIteratorProgram {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<>();
        l.add("Aamir");
        l.add("Tasneem");
        l.add("Tamseel");
        l.add("osama");
        System.out.println(l);
        

        ListIterator itr=l.listIterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            if(itr.nextIndex()%2==0){

                itr.set("mohd");
                
            }
           
        }
        System.out.println(l);
    }
}
