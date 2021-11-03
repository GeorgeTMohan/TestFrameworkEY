package Framework.Commons;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

import static Framework.Constants.ApplicationConstants.*; //shortcut for shortening inputs. if we do this, instead of class.variable, we can just write the variable straightly

public class Basetest {

    public WebDriver driver;  // if frameworks are performed sequentially, only one driver is needed for classes using it. so in that case make the driver static.
                             //when parallel execution of execution happens, we have to pass the driver to each framework using it. In simple words, each framework will be having each driver as it will be passed.
  public static GlobalConfig config;
  public static ExtentReports extentReports;
  public ExtentTest test;
  public Assertor assertor;


  @BeforeSuite
  public void initSetup(){
      config = GlobalConfig.getProperties();
      extentReports = ReportUtil.geteReport();
  }
   @Parameters("browser")
   @BeforeMethod
    public void launchApp(String browser){


      switch (browser.toLowerCase()){

          case "firefox" :
              driver = getFirefoxDriver();
              break;

          case "chrome" :
              driver = getChromeDriver();
              break;
      }



        //System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        //driver = new FirefoxDriver();

        driver.get(config.get(config.get(CURRENT_ENVIRONMENT)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }


    public WebDriver getFirefoxDriver(){

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }

    public WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-Maximized");
        options.setExperimentalOption("useAutomationExtension",false);
        System.setProperty("webdriver.chrome.driver", "C:\\Training\\Drivers\\chromedriver.exe");
        return new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown(){
     // assertor.assertAll();
      extentReports.flush();
       driver.quit();
    }


    /**
     * to take screenshot
     * @return
     * @throws IOException
     */
    public String getScreenshot() throws IOException {


        String fileName = null;

        try{
        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        fileName =REPORT_PATH + "\\Screenshots\\Screenshot_" + getUniqueDateTimeStamp() +".png";
        FileUtils.copyFile(img,new File(fileName));
    }catch (Exception e){
            e.printStackTrace();
        }
        return fileName;
    }

    /**
     * to get unique date and timestamp
     * @return
     */
    public String getUniqueDateTimeStamp() {
            Date date = new Date();
            SimpleDateFormat simple = new SimpleDateFormat("dd-mmm-yyyy hh-mm-ss");
            String cleaneddate = simple.format(date);
            return cleaneddate;
    }

//auto id is a library used to handle the external popups.
    @AfterSuite
    public void cleanprocess() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");  //Runtime is a class in java. It kills off any process.It's used to execute any command on command  prompt.
    }
}
