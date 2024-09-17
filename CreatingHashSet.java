import java.util.HashSet;
import java.util.Iterator;

public class CreatingHashSet {
    public static void main(String[] args) {
        HashSet st = new HashSet<>();
        st.add("Srz");
        st.add("Abc");
        st.add("Xyz");
        st.add("Pqr");

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
