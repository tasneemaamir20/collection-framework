
import java.util.HashMap;
public class MapTask {
    public static void main(String[] args) {
        HashMap <String,Integer> a=new HashMap<>();
        a.put("tas", 123);
        a.put("bas", 1234);
        a.put("cas", 1235);
        a.put("das", 1236);
        System.out.println(a);

        // for(int i=0;i<)
        if(a.containsKey("tas"))
        {
            System.out.println(a);
        }
    }
}
