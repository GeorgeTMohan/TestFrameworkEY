package Day9;

public class Driver_Interface {

    public static void main(String[] args) {

        ImplementArithmatic arith = new ImplementArithmatic();
        System.out.println(arith.add(10,20));
        System.out.println(arith.sub(50,30));
        System.out.println(arith.multiply(10,5));

        //creating object with reference to interface
        ArithmaticInterface arith2 = new ImplementArithmatic();
        System.out.println(arith2.add(10,20));
        System.out.println(arith2.sub(50,30));
        //System.out.println(arith2.multiply(10,5));
        // here only methods in interface can be accessed by the object as the arithmatic class implemts interface and the type of object is Arithmaticinterface


        //creating object with reference to interface
        ArithmaticInterface arith3 = new John_implementInterface();
        System.out.println(arith3.add(10,20));
        System.out.println(arith3.sub(50,30));
        System.out.println(arith3.divide(10,5));

    }
}
