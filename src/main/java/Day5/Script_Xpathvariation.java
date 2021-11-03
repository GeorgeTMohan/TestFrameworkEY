package Day5;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_Xpathvariation {



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
        driver.findElement(By.xpath("//table[@id='tblinput']//tr[2]//td[3]/input")).sendKeys(amount);


//        Enter the loan interest
        driver.findElement(By.xpath("//table[@id='tblinput']//tr[3]//td[3]/input")).sendKeys("10");

//        Enter the tenure
        driver.findElement(By.xpath("//table[@id='tblinput']//tr[4]//td[3]/input")).sendKeys("120");


//        Click on calculate
        driver.findElement(By.xpath("//table[@id='Table1']//td/input")).click();

        //        Extract the value
        String output = driver.findElement(By.xpath("//table[@id='tbldata']//td[2]/input[@name='EMI']")).getAttribute("value");
        System.out.println(output);

        System.exit(0);
    }
}
