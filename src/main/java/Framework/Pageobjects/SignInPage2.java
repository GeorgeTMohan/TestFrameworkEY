package Framework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SignInPage2 {


    WebDriver driver;

    //for login
    @FindBy(name = "logid")
    private WebElement txt_emailId;

    @FindBy(name = "pswd")
    private WebElement txt_password;

    @FindBy(xpath = "//input[@value = 'Login']")
    private WebElement btn_login;


    @FindBy(xpath = "//b[contains(text(),'The username and/or password you entered is incorrect.')]")
    private WebElement txt_errorMessage;



    public SignInPage2(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }




    public SignInPage2 enterUserCredentials(String username, String password) {

        txt_emailId.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
        return new SignInPage2(driver);
    }


    public boolean isInvalidErrorMessageDisplayed() {

        return txt_errorMessage.isDisplayed();
    }
}
