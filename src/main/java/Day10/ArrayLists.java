package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        // List is interface, ArrayList is class which stores data in vertical. '<>' is generics used to define the type of data(any of the 8 primitive data types)
        List<String> al = new ArrayList<String>();

        al.add("Max");
       al.add("Hamilton");
       al.add("Checo");
       al.add("Bottas");

       //checking for presence of an element(attendance)
       System.out.println(al.contains("Gasly"));


       //adding new element into the list
       al.add(2,"Ricardo");
       System.out.println(al.get(0));


       //for reading all the values in a collection (iterator), iterator is used. its only defined for collections.

        Iterator<String> iter = al.iterator();
        while(iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is: " + country);
        }
        }


    }

