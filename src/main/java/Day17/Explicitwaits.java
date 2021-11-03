package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class Explicitwaits {

    public static void main(String[] args) throws IOException {

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Syntax for explicit wait //webDriverWait is a class for explicit wait
        WebElement emi = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("EMI")));

        //WebElement emi = driver.findElement(By.id("EMI"));
        String output = emi.getAttribute("value");

        //String output = driver.findElement(By.name("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);
    }
}
