package Day2;

public class Understand_variables {

    public static void main(String[] args) {



        Common_Arithematics ca = new Common_Arithematics();
          ca.increement();
          System.out.println("value of j is" + ca.j );
        System.out.println("value of k is" + Common_Arithematics.k );

        Common_Arithematics ca1 = new Common_Arithematics();
        ca1.increement();
        System.out.println(" value of j is" +ca1.j);
        System.out.println(" value of k is" +Common_Arithematics.k);

        Common_Arithematics.addk();

    }


}
