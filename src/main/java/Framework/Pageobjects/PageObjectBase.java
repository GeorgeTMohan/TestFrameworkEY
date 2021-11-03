package Framework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectBase {
                               //final comes always with static declaration
    public static final int DEFAULT_TIMEOUT = 5; //final means we cannot change that value in below lines as this is the initialized value
    WebDriver driver;

    public PageObjectBase(WebDriver driver){  //this constructor is made because we want to access the driver used by the classes extending this class(super)
        this.driver =driver;
    }

    public void click(WebElement element,int timeout){

       //element.click();
        getWait(timeout).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

//another way of customized timeout
    public void click(WebElement element){

        click(element,DEFAULT_TIMEOUT);
        //element.click();
        //getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }



    public void type(WebElement element,String text){

        //element.sendKeys(text);
        getWait().until(ExpectedConditions.elementToBeClickable(element)).clear(); //in these line, already wait is implemented and it will execute the action only if the condition is satisfied.
        element.sendKeys(text);               //this is more cleaner way of executing.
    }

    public boolean isElementDisplayed(WebElement element) {
        //return element.isDisplayed();        //here if element is not found,it will throw an exception and will halt the execution.so for boolean cases always write with try-catch method.
        try {                               //so that the program will execute fully.
            getWait().until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public WebDriverWait getWait() {
        //return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIME));
        return getWait(DEFAULT_TIMEOUT); //basically this line is same as below getwait method. both are based on user input
    }


    public WebDriverWait getWait(int timeout){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout)); //this is customized timeout. user can select the duration

    }
}


//docker - a full copy of a machine.each docker machine acts as separate laptop/desktop.