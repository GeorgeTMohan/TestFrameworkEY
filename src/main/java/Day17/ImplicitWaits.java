package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaits {

    public static void main(String[] args) throws Exception {


        //3 ways selenium provides for adapting the code with application speed
        // 1. Implicit
        // 2. Explicit
        // 3. Fluent wait
        // 4. Thread.sleep (provided by Java) (use as last option)

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Propertiefiles.getconfigvalue(Propertiefiles.getconfigvalue("env")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        String amount = "20000";

//      Enter the loan amount
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);


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
