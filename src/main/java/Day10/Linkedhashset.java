package Day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {


    public static void main(String[] args) {

        Set<String> al = new LinkedHashSet<String>();

        al.add("Max");
        al.add("Hamilton");
        al.add("Max");
        al.add("Checo");
        al.add("Bottas");

        //System.out.println(al.get(0)); - this wont work in set


        //for reading all the values in a collection (iterator), iterator is used. its only defined for collections.

        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is: " + country);
        }
    }
}
