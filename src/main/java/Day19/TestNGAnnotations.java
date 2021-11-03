package Day19;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite(groups = {"Smoke","E2E"})
    public void m1(){
        System.out.println("Before Suite");
    }

    @AfterSuite(groups = {"Smoke","E2E"})
    public void m8(){
        System.out.println("After Suite");
    }

    @BeforeTest(groups = {"Smoke","E2E"})
    public void m9(){
        System.out.println("Before Test");}

    @AfterTest(groups = {"Smoke","E2E"})
    public void m10(){
        System.out.println("After Test");}

    @BeforeClass(groups = {"Smoke","E2E"})
    public void m4(){
        System.out.println("Before Class");}

    @AfterClass(groups = {"Smoke","E2E"})
    public void m7(){
        System.out.println("After Class");}


    @BeforeMethod(groups = {"Smoke","E2E"})
    public void m5(){
        System.out.println("Before Method");}

    @AfterMethod(groups = {"Smoke","E2E"})
    public void m6(){
        System.out.println("After Method");}


    @Test(groups = {"Smoke","E2E"})
    public void m2(){
        System.out.println("Script1");
    }

    @Test(priority = 1,groups = {"E2E"})
    public void m3(){
        System.out.println("Script2");
    }

}
