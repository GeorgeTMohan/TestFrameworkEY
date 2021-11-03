package Day8;

public class Encapsulation {

    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private String validateAge(){
        if(age > 18) {
            return "Major";
        }else{
            return "Minor";
        }

    }

    public String getStatus() {

        String status = validateAge();
        return status;
    }



}
