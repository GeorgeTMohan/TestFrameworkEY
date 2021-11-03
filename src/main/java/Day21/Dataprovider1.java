package Day21;

import org.testng.annotations.DataProvider;

public class Dataprovider1 {

    @DataProvider(name = "LogIn Data")
    public static Object[][]dataprovider(){

//        Object[][] objects = new Object[3][2];
//        objects[0][0] = "Max";
//        objects[0][1] = "sjdh";
//        objects[1][0] = "Hamilton";          // these lines are same as that below method. below method is a shortcut of these way. This is a straight way
//        objects[1][1] = "hffj";
//        objects[2][0] = "Checo";
//        objects[2][1] = "vcnv";



        return new Object[][] {

              {"Max","sjdh"},
              {"Hamilton","hffj"},
              {"Checo","vcnv"}
      };
    }
}
