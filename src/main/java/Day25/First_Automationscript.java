package Day25;

import static Framework.Constants.ApplicationConstants.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class First_Automationscript {

    //report making is introduced in this class. extentreports

    public static void main(String[] args) throws IOException {

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Report.html"); //spark reporter creates html file
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(System.getProperty("user.dir") + "\\Reports"); //logger reporter makes log files (time stamp,date and action) in more stylish format.
        ExtentReports extentReports = new ExtentReports(); //this is a parent for all above two lines.

        extentReports.attachReporter(extentLoggerReporter,extentSparkReporter); //here we are saying that what features my extent report should have.how many we passed as parameters,that many reports gets generated.

        ExtentTest test = extentReports.createTest("Testing the EMI Calculation");

        test.assignAuthor("George Thomas");
        test.assignDevice("Android");
        test.assignCategory("Regression");


        test.info("Execution started");
//        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

         driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

         test.pass("Successfully launched the application");//MediaEntityBuilder.createScreenCaptureFromPath("Screenshots\\Screenshot.png").build());



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

        test.pass("successfully validated the EMI");


        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir") + "\\Reports\\Screenshots\\Screenshot.png"));
        //these above 3 lines are code for creating screenshot.
        //under creating of report happens, if screenshots has to be captured, give the path from reports folder.



        test.fail("failed to validate the process", MediaEntityBuilder.createScreenCaptureFromPath("Screenshots\\Screenshot.png").build());

        extentReports.flush(); // saves whatever we have done so far from start of the program inside the report. if we dont use this line, after execution or any block in between, we wont get anything in the report

System.exit(0);



    }

}
