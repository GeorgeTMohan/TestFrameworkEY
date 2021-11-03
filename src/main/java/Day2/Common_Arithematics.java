package Day2;

public class Common_Arithematics {


    int j = 0;
    static int k = 0;

static void addk()
{

    ++k;
    System.out.println("value of k is " + k);
}

    void increement()
    {
        j++;
        k++;
    }
    int add(int num1,int num2){
        final int s = num1 + num2;
        return s;
    }

    int mult(int num1,int num2) {
        return num1 * num2;
    }

    int subt(int num1,int num2) {
        return num1 - num2;
    }


}
