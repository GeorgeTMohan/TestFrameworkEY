package Day15;

public class Exceptionhandling {

    public static void main(String[] args) //throws exception
     {


        //Exception 2 types - Checked Exception & Unchecked Exception


        //Checked Exception
        //Thread.sleep(4000);

        //Unchecked Exception
        //String[] sar = new String[3];
        //sar[0] = "Max";
        //sar[1] = "Checo";
        //sar[2] = "Hamilton";
        //sar[3] = "Norris";

        //System.out.println(sar[3]);

        Age_Calculation agecal = new Age_Calculation();

try {

    int a;
    int b = 4;
    a = b/0;



    agecal.AgeCalculation(2);



}catch (ArithmeticException e) {

    System.out.println("The Exception is :" + e.toString());
}

catch (Exception e){
     System.out.println("The Exception is :" + e.toString());
}

System.out.println("I am so good");
    }
}

