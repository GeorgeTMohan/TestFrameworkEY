package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class First_Automationscript1 {

    public static void main(String[] args) throws Exception {


        Properties prop = new Properties();
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
        prop.load(fis);

        //String url = prop.getProperty("QA"); //for getting particular url

        String url = prop.getProperty(prop.getProperty("env")); //getting url when used in multiple environments.easy to use this as variable will be setted and we need to change the environment in property file which is more easier
        System.out.println(url);


        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

         driver.get(url);

//        Where to find them (Element locating - first step of selenium)

//          a. ID - attribute of tag
//          b. Name - attribute of tag
//          c. Class Name - attribute of tag
//          d. Tag Name - name of tag
//          e. Link Text - text of link
//          f. Partial Link Text - text of link
//          g. X path - path of element in DOM
//          h. CSS - path of element in DOM

//        Enter loan amount
driver.findElement(By.id("loanamount")).sendKeys("200000");


//        Enter the loan interest
driver.findElement(By.name("rate")).sendKeys("10");

//        Enter the tenure
driver.findElement(By.name("pmonths")).sendKeys("120");


//        Click on calculate
driver.findElement(By.id("Button1")).click();

//        Extract the value
        String output = driver.findElement(By.name("EMI")).getAttribute("value");
        System.out.println(output);

System.exit(0);



    }

}
