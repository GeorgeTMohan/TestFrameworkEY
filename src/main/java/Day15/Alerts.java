package Day15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.bookshopofindia.com/booknotfound.asp");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.name("btnSubmit")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

    }
}
