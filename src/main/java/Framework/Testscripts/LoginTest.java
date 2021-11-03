package Framework.Testscripts;

import Framework.Commons.Assertor;
import Framework.Commons.Basetest;

import Framework.Commons.Logutil;
import Framework.Commons.ReportUtil;
import Framework.DataProviders.Dp_Login;
import Framework.Pageobjects.HomePage;
import Framework.Pageobjects.SignInPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static Framework.Constants.ApplicationConstants.*;

public class LoginTest extends Basetest {


    @Test(enabled = false)
    public void validateInvalidLogin() {

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("logid")).sendKeys("ashj");
        driver.findElement(By.name("pswd")).sendKeys("fhyej");
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();
        if (driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()) {

            System.out.println("pass");
        } else {

            System.out.println("fail");
        }
    }


    /**
     * z
     * this is another approach for executing this framework
     */


    @Test(dataProvider = "InvalidLogInData", dataProviderClass = Dp_Login.class)
    public void validateInvalidLogin_Approach1(String username, String password) throws IOException {
        Logutil.info("Testing the Invalid Login scenario");
        test = extentReports.createTest("Testing the Invalid Login scenario");
        assertor = new Assertor(test);


        //SoftAssert Assert = new SoftAssert();
        Logutil.info("Started execution");
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);



        //validate home page title -----old Assert

        //Assert.assertEquals(driver.getTitle(),"Rediff,com","Home Page Title is not matching");

        //the problem with this assert is it's return type is void and if the condition is a failure we need to control it. assert will give the statement of false only after the execution.

        homePage.ClickSignInLink();
        Logutil.info("Currently in Homepage");
        //custom Assert
        assertor.assertEquals(driver.getTitle(), "rediff.com", "Home page Title is not matching");

        signInPage.enterUserCredentials(username, password);
        Logutil.info("Currently in signin page");
        //Validate signin page

        //validate signin page title -----old Assert

        //Assert.assertEquals(driver.getTitle(),"books.rediff.com","Sign In page Title is not matching");
        assertor.assertEquals(driver.getTitle(), "books.rediff.com", "Sign In page Title is not matching#" + getScreenshot());

        //when a string is splitted into 2 for example with #, we get 2 arrays

        //if (signInPage.isInvalidErrorMessageDisplayed()) {

        //ReportUtil.pass(test,"Successfully Executed",getScreenshot());
        //test.pass("Successfully Executed",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(REPORT_PATH + "\\","") ).build());
        // } else {
        //ReportUtil.pass(test,"Failed as error message not displayed",getScreenshot());
        //test.fail("Failed as error message not displayed",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(REPORT_PATH + "\\","") ).build());
        // }

        // Assert.assertTrue(signInPage.isInvalidErrorMessageDisplayed(),"Invalid Login error is not displayed");

        assertor.assertTrue(signInPage.isInvalidErrorMessageDisplayed(), "Invalid Login error is not displayed");
        assertor.assertAll();
    }

    /**
     * this is another approach.it reduces the page objects and makes the navigation faster
     */

    // @Test
    // public void validateInvalidLogin_Approach2() {


    // HomePage2 homePage2 = new HomePage2(driver);
    // SignInPage2 signInPage2 = homePage2.ClickSignInLink().enterUserCredentials("max", "dex");

    // if (signInPage2.isInvalidErrorMessageDisplayed()) {

    //   System.out.println("pass");
    //  } else {

    //    System.out.println("fail");
    //  }

    //}
}




