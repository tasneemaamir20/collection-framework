import java.util.Iterator;
import java.util.LinkedList;

public class CreatingLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(90);
        list.add("Aamir");
        list.add(998);
        list.add("Ased");
        list.add('a');
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
