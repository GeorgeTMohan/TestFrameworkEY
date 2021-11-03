package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {

        Map<String, String> lhm = new LinkedHashMap<>();

        lhm.put("Max","Red Bull");
        lhm.put("Hamilton","Mercedes");
        lhm.put("Checo","Red Bull 2");
        lhm.put("Bottas","Mercedes 2");
        lhm.put("Max","Red Bull"); // Map removes duplicates

        System.out.println(lhm.get("Hamilton"));


        //System.out.println(al.get(0)); - this wont work in set


        //Iteration process is different in maps

        Iterator<String> iter = lhm.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String value = lhm.get(key);
            System.out.println("the Key is :" + key + "and the value is :" + value);
        }

    }

}
