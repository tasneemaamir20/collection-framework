import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();

        arr.add(30);
        arr.add(20);
        arr.add(11);
        arr.add(13);
        arr.add(54);


        ListIterator <Integer> lt=arr.listIterator();
        while(lt.hasNext())
        {
            System.out.println(lt.next());
            
        }
        System.out.println("===============================");
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}
