package Day9;

public class ImplementArithmatic implements ArithmaticInterface {



    public int add(int a, int b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b ;
    }

    public int multiply(int a,int b){
        return a * b;
    }

    public int divide(int a,int b){
        return a/b;
    }
}
