package Collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 28, 2016
 */
public class OccurenceWord {

     public static void main(String[] args) {
          String text = "Good Morning! Have a good class." + "Have a good visit. Have fun";
          Map<String, Integer> map = new TreeMap<>();
          String words[] = text.split("\\P{L}+");
          for (int i = 0; i < words.length; i++) {
               String key = words[i].toLowerCase();
               //System.out.println(key);
               if (key.length() > 0) {
                    if (!map.containsKey(key)) {
                         map.put(key, 1);
                    }
               else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
               }
               }
          }

          //get all entries to a set
          Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
          for(Map.Entry<String, Integer> entry: entrySet){
               System.out.println(entry.getValue()+ "\t" + entry.getKey());
          }
     }

}
