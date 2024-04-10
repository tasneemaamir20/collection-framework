import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
 
        // // Converting given string to char array
 
        String inputString="HelloHello";
        char[] strArray = inputString.toCharArray();
 
        // checking each char of strArray
        for (char c : strArray) {
            if (count.containsKey(c)) {
 
                // If char is present in charCountMap,
                // incrementing it's count by 1
                count.put(c, count.get(c) + 1);
            }
            else {
 
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                count.put(c, 1);
            }
        }
 
        // // Printing the charCountMap
        for (Map.Entry entry : count.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        // ===============================================================
        System.out.println("================================");

        Set<Map.Entry<Character,Integer>> set=count.entrySet();

        for(Map.Entry<Character,Integer> x: set)
        {
            System.out.print(x.getKey());
            System.out.println(x.getValue());
        }





    }
    }

