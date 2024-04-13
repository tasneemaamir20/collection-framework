import java.util.HashSet;
import java.util.Iterator;


// import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorPractice{
    public static void main(String[] args) {

        HashSet <Integer> h=new HashSet<Integer>();
        // h.add(80);
        // h.add(91);
        // h.add(44);
        // h.add(63);
        // h.add(97);
        // h.add(62);
        // h.add(85);
        // h.add(31);

        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(7);


        Iterator <Integer> i=h.iterator();

        while (i.hasNext()) 
        {
            
            if(i.next()%2==1)
            {
                i.remove();
            }
            else{
                            System.out.println(i.next());

            }

        }

    }
}