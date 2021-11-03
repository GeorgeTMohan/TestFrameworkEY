package Day10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();

        tm.put("Max","Red Bull");
        tm.put("Hamilton","Mercedes");
        tm.put("Checo","Red Bull 2");
        tm.put("Bottas","Mercedes 2");
        tm.put("Max","Red Bull"); // Map removes duplicates

        System.out.println(tm.get("Hamilton"));


        //System.out.println(al.get(0)); - this wont work in set


        //Iteration process is different in maps

        Iterator<String> iter = tm.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String value = tm.get(key);
            System.out.println("the Key is :" + key + "and the value is :" + value);
        }
    }
}
