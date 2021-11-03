package Day10;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {

        Map<String, String> hm = new HashMap<>();

        hm.put("Max","Red Bull");
        hm.put("Hamilton","Mercedes");
        hm.put("Checo","Red Bull 2");
        hm.put("Bottas","Mercedes 2");
        hm.put("Max","Red Bull"); // Map removes duplicates

        System.out.println(hm.get("Hamilton"));


        //System.out.println(al.get(0)); - this wont work in set


        //Iteration process is different in maps

        Iterator<String> iter = hm.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String value = hm.get(key);
            System.out.println("the Key is :" + key + "and the value is :" + value);
    }
    }

}
