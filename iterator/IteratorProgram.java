import java.util.*;
public class IteratorProgram {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        System.out.println(l);

        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            if(i%2==0)
            {
                System.out.println(i);
            }
            else{
                itr.remove();
            }
        }
        System.out.println(l);
    }
}
