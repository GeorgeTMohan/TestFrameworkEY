package Day12_Excercise;

import java.util.List;

public class Hyundai_CustomerInfo {

    private String name;
    private String state;
    private String city;
    private String carModel;
    private List<String> phoneNumbers;

    public Hyundai_CustomerInfo(String name, String state, String city, String carModel, List<String> phoneNumbers) {
        this.name = name;
        this.state = state;
        this.city = city;
        this.carModel = carModel;
        this.phoneNumbers = phoneNumbers;
    }




        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getState () {
            return state;
        }

        public void setState (String state){
            this.state = state;
        }

        public String getCity () {
            return city;
        }

        public void setCity (String city){
            this.city = city;
        }

        public String getCarModel () {
            return carModel;
        }

        public void setCarModel (String carModel){
            this.carModel = carModel;
        }

        public List<String> getPhoneNumbers () {
            return phoneNumbers;
        }

        public void setPhoneNumbers (List < String > phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }
    }

