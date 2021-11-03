package Framework.DataProviders;

import org.testng.annotations.DataProvider;

public class Dp_Login {

    @DataProvider(name = "InvalidLogInData")
    public static Object[][]dataprovider(){

        return new Object[][] {

                {"Max","sjdh"},
            //    {"Hamilton","hffj"},
            //    {"Checo","vcnv"}
        };
    }
}
