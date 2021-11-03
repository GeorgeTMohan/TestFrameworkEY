package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_CSSpathvariation {

    public static void main(String[] args) {


        //        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String amount = "200000";
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
        driver.findElement(By.cssSelector(" table[id='tblinput'] tr:nth-of-type(2) td:nth-of-type(3)>input")).sendKeys(amount);


//        Enter the loan interest
        driver.findElement(By.cssSelector(" table[id='tblinput'] tr:nth-of-type(3) td:nth-of-type(3)>input")).sendKeys("10");

//        Enter the tenure
        driver.findElement(By.cssSelector(" table[id='tblinput'] tr:nth-of-type(4) td:nth-of-type(3)>input")).sendKeys("120");


//        Click on calculate
        driver.findElement(By.cssSelector(" input[value='Calculate']")).click();

        //        Extract the value
        String output = driver.findElement(By.cssSelector(" table[id='tbldata'] td:nth-of-type(2)>input")).getAttribute("value");
        System.out.println(output);

        System.exit(0);
    }
}
