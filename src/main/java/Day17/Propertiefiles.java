package Day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiefiles {

    //public static Properties prop; - //instead of creating multiple objects of a class whenever we are calling, it is better approach to use the same object repeatedly.

//making propertiefiles a method for reusable manners

    public static String getconfigvalue(String key) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
        prop.load(fis);
        return prop.getProperty(key);
    }

//instead of creating multiple objects of a class whenever we are calling, it is better approach to use the same object repeatedly.

    //if (prop == null) {
        //Properties prop = new Properties();
        //FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
        //prop.load(fis);
        //fis.close();
    //}
           // return prop.getProperty(key);
}


