package Framework.Commons;

import java.io.FileInputStream;
import java.util.Properties;


//this class is based on singleton approach. Single approach means, only one object can be made with the class which is made with singleton approach


/*
* This class is responsible for providing properties from property file
 */

public class GlobalConfig {

private static GlobalConfig config = null; //here this variable is null means that never an object was created for this class.
private Properties prop;
private FileInputStream fis;

/**
Add a private constructor
avoid outside world to create object
 */

private GlobalConfig(){
    try{
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
        prop.load(fis);
        fis.close();
    }catch (Exception e){
        e.printStackTrace();
    }
}

    /**
     * Return a singleton object
     * @return
     */

public static GlobalConfig getProperties(){
    if(config==null){
       config = new GlobalConfig();
    }
    return config;

}

    /**
     * Get the property value
     * @param key
     * @return
     */

public String get(String key){

    return prop.getProperty(key);
}

    /**
     * set a property value
     * @param key
     * @param value
     */

public void set(String key,String value){
    prop.setProperty(key,value);
}

}
