

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCreationPractice {
    public static void main(String[] args) {
        
        ArrayList <String> lt = new ArrayList<>();
        lt.add("Aamir");
        lt.add("Aslam");
        lt.add("Aijaz");
        lt.add("Ayyub");
        Iterator itr =lt.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
