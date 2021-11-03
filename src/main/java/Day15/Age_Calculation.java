package Day15;

public class Age_Calculation {

    public void AgeCalculation(int age) throws Exception {
        if (age < 4) {

            throw new Exception("He/She is so young bro ");

        } else if(age > 4 && age < 18){

            System.out.println("Minor");


        }else{

            System.out.println("Major");
        }
    }
}
