package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Emi_Inheritance extends Base_inheritance{




    // launch the app




    // enter and extract the value

       String ExtractEmi(String amount,String interest,String tenure){



       driver.findElement(By.id("loanamount")).sendKeys(amount);


//        Enter the loan interest
    driver.findElement(By.name("rate")).sendKeys(interest);

//        Enter the tenure
    driver.findElement(By.name("pmonths")).sendKeys(tenure);


//        Click on calculate
    driver.findElement(By.id("Button1")).click();

    //        Extract the value
    String output = driver.findElement(By.name("EMI")).getAttribute("value");

    return output;

}


    //tear down process




//




}
