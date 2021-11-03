package Framework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 this class handles the elements and business logics for SignIn page
 @author George Thomas
 */


public class SignInPage extends PageObjectBase {

    WebDriver driver;
//for login
    @FindBy(name = "logid")
    private WebElement txt_emailId;

    @FindBy(name = "pswd")
    private WebElement txt_password;

    @FindBy(xpath = "//input[@value = 'Login']")
    private WebElement btn_login;




    @FindBy(xpath = "//b[contains(text(),'The username and/or password you entere is incorrect.')]")
    private WebElement lbl_errorMessage;

    /**
     *
     * @param driver
     */

    public SignInPage(WebDriver driver){
        super(driver);
        this.driver = driver; //this driver is passed to the class which this class is extending(superclass)
        PageFactory.initElements(driver,this); //every pagefactory, default constructor should be there for linking the driver with the class.
    } // 'this' refers to this current class

//so the constructor will call a method which basically initializes all the elements we see in this page with driver

    /**
     *
     * @param username
     * @param password
     */

    public void enterUserCredentials(String username,String password){

        //txt_emailId.sendKeys(username);
        //txt_password.sendKeys(password);
        //btn_login.click();

        type(txt_emailId,username);
        type(txt_password,password);
        click(btn_login);
    }

    /**
     *
     * @return
     */

    public boolean isInvalidErrorMessageDisplayed(){
      //  return lbl_errorMessage.isDisplayed();
        return isElementDisplayed(lbl_errorMessage);
    }

}
