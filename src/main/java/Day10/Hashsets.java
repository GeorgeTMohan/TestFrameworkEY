package Day10;

import java.util.*;

public class Hashsets {
    public static void main(String[] args) {

        Set<String> al = new HashSet<String>( );

        al.add("Max");
        al.add("Hamilton");
        al.add("Checo");
        al.add("Bottas");
        al.add("Max");

        //System.out.println(al.get(0)); - this wont work in set


        //for reading all the values in a collection (iterator), iterator is used. its only defined for collections.

        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is: " + country);
        }
    }
    }


