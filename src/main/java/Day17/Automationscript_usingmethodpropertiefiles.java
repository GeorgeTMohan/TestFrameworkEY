package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Automationscript_usingmethodpropertiefiles {

    //using the method instead of hardcoding the value - easy and flexible approach

    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Propertiefiles.getconfigvalue(Propertiefiles.getconfigvalue("env")));



    }

}
