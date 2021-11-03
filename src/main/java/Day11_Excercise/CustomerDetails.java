package Day11_Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomerDetails {

    public static void main(String[] args) {

        Hyundai_CustomerInfo Custominfo1 = new Hyundai_CustomerInfo();
        Custominfo1.setName("Max");
        Custominfo1.setState("Netherlands");
        Custominfo1.setCity("Zandovort");
        Custominfo1.setCarModel("Aston Martin");
        ArrayList<String> phoneNum = new ArrayList<>();
        phoneNum.add("9191991919");
        phoneNum.add("8787878787");
        Custominfo1.setPhoneNumbers(phoneNum);


        Hyundai_CustomerInfo Custominfo2 = new Hyundai_CustomerInfo();
        Custominfo2.setName("Checo");
        Custominfo2.setState("Mexico");
        Custominfo2.setCity("Mexico City");
        Custominfo2.setCarModel("Honda City");

        //Below line is one line statement which has same meaning to code lines 17,18,19,20
        Custominfo2.setPhoneNumbers(new ArrayList<String>(Arrays.asList("5656656666","3453535363")));



        Hyundai_CustomerInfo Custominfo3 = new Hyundai_CustomerInfo();
        Custominfo3.setName("Norris");
        Custominfo3.setState("UK");
        Custominfo3.setCity("Silverstone");
        Custominfo3.setCarModel("Mclaren Senna");
        Custominfo3.setPhoneNumbers(new ArrayList<String>(Arrays.asList("56566562323","3412567893")));


        Map<String, Hyundai_CustomerInfo> CustomerMap = new HashMap<String,Hyundai_CustomerInfo>(); //here the key is name and value is the class which contains customer details(objects)
        CustomerMap.put("Max",Custominfo1);
        CustomerMap.put("Checo",Custominfo2);
        CustomerMap.put("Norris",Custominfo3);

        //Retrieve Information
         System.out.println(CustomerMap.get("Max").getCarModel());
         System.out.println(CustomerMap.get("Norris").getState());
         System.out.println(CustomerMap.get("Checo").getCity());

         System.out.println(CustomerMap.get("Max").getPhoneNumbers());
    }
}
