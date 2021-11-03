package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_tagname {

    public static void main(String[] args) {

        //        launch the application on firefox browser

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.bing.com");

        driver.findElement(By.className("sb_form_q")).sendKeys("Selenium");
        driver.findElement(By.id("sb_form_go")).submit();
        System.exit(0);

    }
}
