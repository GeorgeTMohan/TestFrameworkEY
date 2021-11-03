package Day18;

import Day17.Propertiefiles;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenshots {

    public static void main(String[] args) throws IOException, InterruptedException {


        //creation of date and time stamp. There is a class for date.Date will give the date and stamp.
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simple = new SimpleDateFormat("dd-mmm-yyyy hh-mm-ss");
        String cleaneddate = simple.format(date);
        System.out.println(cleaneddate);




        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Propertiefiles.getconfigvalue(Propertiefiles.getconfigvalue("env")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));





        String amount = "20000";

        //      Enter the loan amount
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);

        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir") + "\\Screenshots\\Screenshots_" + cleaneddate +".png"));

//        Enter the loan interest
        driver.findElement(By.name("rate")).sendKeys("10");

//        Enter the tenure
        driver.findElement(By.name("pmonths")).sendKeys("120");


//        Click on calculate
        driver.findElement(By.id("Button1")).click();




        WebElement output = driver.findElement(By.name("EMI"));
        String out = output.getAttribute("value");




        date = new Date();
        System.out.println(date);
        simple = new SimpleDateFormat("dd-mmm-yyyy hh-mm-ss");
        cleaneddate = simple.format(date);
        System.out.println(cleaneddate);

        screen = (TakesScreenshot) driver;
        img = screen.getScreenshotAs(OutputType.FILE);
        //still the img is in memory but not in device.So for storing into device the next line is the code.
        FileUtils.copyFile(img,new File(System.getProperty("user.dir") + "\\Screenshots\\Screenshots_" + cleaneddate +".png"));

        System.out.println(out);

    }
}


