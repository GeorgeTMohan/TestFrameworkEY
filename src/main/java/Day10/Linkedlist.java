package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args) {
        List<String> al = new LinkedList<String>( );

        al.add("Max");
        al.add("Hamilton");
        al.add("Checo");
        al.add("Bottas");


        System.out.println(al.get(0));


        //for reading all the values in a collection (iterator), iterator is used. its only defined for collections.

        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is: " + country);
        }
    }
}
