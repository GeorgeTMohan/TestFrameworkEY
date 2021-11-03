package Day9_AbstractClass;

import Day9.ImplementArithmatic;

public class Driver_AbstractClass {

    public static void main(String[] args) {

        ImplementAbstractClass ab = new ImplementAbstractClass();
        System.out.println(ab.add(10,20));
        System.out.println(ab.sub(50,30));
        System.out.println(ab.divide(10,2));

         AbstractClass ab1 = new ImplementAbstractClass();
        System.out.println(ab1.add(10,20));
        System.out.println(ab1.sub(50,30));
        System.out.println(ab1.divide(10,2));




    }
}
