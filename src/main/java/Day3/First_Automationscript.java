package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Automationscript {

    public static void main(String[] args) {

//        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

         driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

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
