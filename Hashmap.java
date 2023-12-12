import java.util.HashMap;
import java.util.Set;
public class Hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer > hm = new HashMap<>();
        hm.put("pakistan", 1000);
        hm.put("india", 1000);
        hm.put("russia", 200);
        hm.put("Nepal", 150);
        // System.out.println( hm.remove("pakistan"));
        // System.out.println(hm.containsKey("india"));
        // boolean is = hm.containsKey("ing");
        // System.out.println(is);
        // System.out.println(hm.size());
        // System.out.println(hm);
        // // hm.clear();
        // System.out.println(hm.isEmpty());
        // System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        // System.out.println(hm.entrySet());
        // System.out.println();
        // for (String k : keys) {
        //     System.out.println(k + "="+ hm.get(k));
            
        // }

    }
}