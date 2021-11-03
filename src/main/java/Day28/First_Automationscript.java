package Day28;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class First_Automationscript {


    private static Logger log = Logger.getLogger("EMICALCULATOR"); //this line also prints the class name in the log file.So when debugging we will know flow has gone to which all classes
    public static void main(String[] args) {

        log.info("started the execution");

//        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        log.error("execution has started");

         driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         log.warn("taking too much time");

         //the more we write logs and asserts, more easy for debugging and fixing problems


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
