package Day22;

import org.testng.annotations.Test;

import java.util.Map;

public class Testscript {

    @Test(dataProvider = "LogIn Data", dataProviderClass = Dataprovider2.class,enabled = false)
    public void getdata(String a, String b, String c, String d, String e) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }


    @Test(dataProvider = "LogInDataExcel", dataProviderClass = Dataprovider2.class,enabled = false)
    public void getdata_Excel(Map<String, String> hm) {

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("Company"));
        System.out.println(hm.get("Greeting"));
    }


    @Test(dataProvider = "LogInDataHardcoded", dataProviderClass = Dataprovider2.class)
    public void getdata_Hardcoded(Map<String, String> hm){

        System.out.println(hm.get("Name"));
        System.out.println(hm.get("Company"));
        System.out.println(hm.get("Greeting"));



    }
}
