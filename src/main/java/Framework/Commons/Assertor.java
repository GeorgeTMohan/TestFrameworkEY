package Framework.Commons;

import com.aventstack.extentreports.ExtentTest;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class Assertor extends SoftAssert {


    private ExtentTest test;


    public Assertor(ExtentTest test){
        this.test = test;

    }

    @Override
    public void onAssertSuccess(IAssert<?> var1) {
        if(var1.getMessage().contains("#")){
            Logutil.info(var1.getMessage().split("#")[0]);
            ReportUtil.pass(test, var1.getMessage().split("#")[0], var1.getMessage().split("#")[0].split("Expected")[1].trim());
        }else{
            Logutil.info(var1.getMessage());
            ReportUtil.pass(test,var1.getMessage());
        }
    }


    @Override
    public void onAssertFailure(IAssert<?> var1, AssertionError ex) {

        if(ex.getMessage().contains("#")) {

            Logutil.error(ex.getMessage().split("#")[0]);
            ReportUtil.fail(test, ex.getMessage().split("#")[0], ex.getMessage().split("#")[1].split("Expected")[0].trim());
        }else{
            Logutil.error(ex.getMessage());
            ReportUtil.fail(test,ex.getMessage());
        }
    }

}
