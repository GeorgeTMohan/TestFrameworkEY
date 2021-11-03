package Day2;

public class Jerry_Math {

    public static void main(String[] args) {

        Common_Arithematics Jerry_arith = new Common_Arithematics();

        int adds = Jerry_arith.add(20, 30);
        System.out.println("sum is :" + adds);

//      multiplying 2 numbers
        int mults = Jerry_arith.mult(20,10);
        System.out.println("product is :" +mults);
    }

}
