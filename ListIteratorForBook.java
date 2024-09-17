import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorForBook {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();

        Book b1 = new Book(101, "Let us c", "Yashwant", "BPB", 9);
        Book b2 = new Book(102, "aTOMIC HABit", "Johns", "mcks", 10);
        Book b3 = new Book(103, "5 am club", "Murli", "BABC", 19);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Original content of list is: ");

        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        ListIterator itr = list.listIterator();
        System.out.println("Modified content of lsit in backward is : ");
        while (itr.hasNext()) {
            Book st = (Book) itr.next();
            System.out.println(st.quantity + " " + st.publisher + " " + st.author + " " + st.name + " " + st.id);
        }
    }
}
