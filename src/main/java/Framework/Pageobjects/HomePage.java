package Framework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase {

    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn; //this two lines are equivalent to line 12.This is by Annotations,so that we can make it easy in scripts

//private WebElement lk_SignIn = driver.findElement(By.linkText("Sign In")).click();

    public HomePage(WebDriver driver) {
        super(driver); //this driver is passed to the class which this class is extending(superclass). its ivoking the constructor of superclass if constructor is present.
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickSignInLink(){

       // lk_SignIn.click();
        click(lk_SignIn);
    }

}
