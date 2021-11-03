package Day18;

import Day17.Propertiefiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class Threadsleep {

    public static void main(String[] args) throws IOException, InterruptedException {


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


        Thread.sleep(40);
        WebElement output = driver.findElement(By.name("EMI"));
        String out = output.getAttribute("value");
        System.out.println(out);

    }
}
