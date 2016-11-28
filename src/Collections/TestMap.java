package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 28, 2016
 */
public class TestMap {

     public static void main(String[] args) {
          Map<String, Integer> hashMap = new HashMap<>();
          
          hashMap.put("Sam", 30);
          hashMap.put("Andrew", 31);
          hashMap.put("Lewis", 29);
          hashMap.put("McTavish", 30);
          
          System.out.println("Display HashMap");
          System.out.println(hashMap);
          
          Map<String, Integer> treeMap = new TreeMap<>(hashMap);
          
          System.out.println("Display treeMap");
          System.out.println(treeMap);
          
          Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
          
          linkedHashMap.put("Sam", 30);
          linkedHashMap.put("Andrew", 31);
          linkedHashMap.put("Lewis", 32);
          linkedHashMap.put("McTavish", 30);
          
          System.out.println("Display linkedHashMap");
          System.out.println(linkedHashMap);
          
          System.out.println("Display Age of Lewis : " + linkedHashMap.get("Lewis"));
          
     }
}
