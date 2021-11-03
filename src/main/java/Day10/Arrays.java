package Day10;

public class Arrays {

    public static void main(String[] args) {

        String[] sArray = new String[4];
        sArray[0] = "Max";
        sArray[1] = "Checo";
        sArray[2] = "Hamilton";
        sArray[3] = "Bottas";


        System.out.println(sArray[0]);

        //checking for presence of an element

        for (int i=0;i < sArray.length; i++) {
            if(sArray[i].equals("Max"))
            System.out.println("Max");
        }



        for (int i=0;i < sArray.length; i++) {
            System.out.println(sArray[i]);
        }

        // multi dimensional array

        String[][][] mArray = new String[2][2][1];
        mArray[0][0][0] = "leclerc";
        mArray[0][1][0] = "norris";
                mArray[1][0][0] = "gasly";
                        mArray[1][1][0] = "alonso";

                        //for loop for multi dimensional arrays to be studied

                        for (int j =0;j < mArray.length;j++ ){
                            System.out.println((mArray[j]));
                        }




    }
}
