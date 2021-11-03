package Framework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {

    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn; //this two lines are equivalent to line 12.This is by Annotations,so that we can make it easy in scripts

//private WebElement lk_SignIn = driver.findElement(By.linkText("Sign In")).click();

    public HomePage2(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public SignInPage2 ClickSignInLink(){

        lk_SignIn.click();
        return new SignInPage2(driver);
    }

}
