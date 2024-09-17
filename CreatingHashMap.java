import java.util.HashMap;
import java.util.Map;

public class CreatingHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Abc");
        map.put(200, "xyv");
        map.put(300, "prpr");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
