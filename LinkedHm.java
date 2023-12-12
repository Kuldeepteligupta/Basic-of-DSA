import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHm{
     public static void main(String[] args) {

          LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
           lhm.put("china", 100);
            lhm.put("india", 75);
             lhm.put("nepal", 25);
              lhm.put("bhutan", 15);
          
              System.out.println(lhm);
          TreeMap<String , Integer> tm = new TreeMap<>();
           tm.put("china", 100);
            tm.put("india", 75);
             tm.put("nepal", 25);
              tm.put("bhutan", 15);
              System.out.println(tm);
     }
}