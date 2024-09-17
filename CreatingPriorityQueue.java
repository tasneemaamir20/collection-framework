import java.util.Iterator;
import java.util.PriorityQueue;

public class CreatingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue que = new PriorityQueue<>();
        que.add("Amir");
        que.add("Anc");
        que.add("xyz");
        que.add("pqr");
        que.add("uvw");
        System.out.println(que.element());
        System.out.println(que.peek());
        Iterator itr = que.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        que.remove();
        que.poll();
        Iterator itr2 = que.iterator();
        System.out.println("After deleting 2 element");
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
