package Day18;

import Day17.Propertiefiles;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

public class Fluentwaits {

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

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
             wait.withTimeout(Duration.ofSeconds(60));
             wait.pollingEvery(Duration.ofSeconds(1));
             wait.ignoring(NoSuchElementException.class);
        WebElement emi = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("EMI"));
            }
        });


        //WebElement emi = driver.findElement(By.id("EMI"));
        String output = emi.getAttribute("value");

        //String output = driver.findElement(By.name("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);
    }
}
