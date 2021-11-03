package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class First_Automationscript {

    public static void main(String[] args) {

        SoftAssert Assert = new SoftAssert();

//        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

         driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

         if(driver.getTitle().equals("EMI Calculator")){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
         }



        Assert.assertEquals(driver.getTitle(),"EMI Calc","Title is not matching");

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


        if(output.equals("234")){
            System.out.println("EMI is passed");
        }else{
            System.out.println("EMI is failed");
        }

        Assert.assertEquals(output,"234","not matching");
        System.out.println(output);
        driver.quit();


Assert.assertAll();   //it will display the failures also even the program is executed
        System.exit(0);


    }

}
