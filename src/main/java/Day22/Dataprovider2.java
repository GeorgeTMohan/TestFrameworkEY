package Day22;

import Day14.Excel_RW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;

public class Dataprovider2 {
    // dataprovider can provide data in 2 different formats.

    // 1. Object[][]
    // 2. iterator<Object[]>

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

                {"Max","sjdh","hi","33","RB"},
                {"Hamilton","hffj","hello","44","MERC"},
                {"Checo","vcnv","bye","11","RB2"}
        };
    }


    @DataProvider(name = "LogInDataExcel")
    public static Iterator<Object[]> dataprovider_Excel() throws IOException {

        //read values from each row of excel
        String sheetName = "sheet1";
        Excel_RW excelRW = new Excel_RW(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData.xlsx");
        int rowCount = excelRW.getRowCount(sheetName);
        int columnCount = excelRW.getColumnCount(sheetName);
        ArrayList<Object[]> objects = new ArrayList<Object[]>();
        for (int iRow = 1; iRow <= rowCount; iRow++) {
            Object[] obj = new Object[1];
            Map<Object, Object> map = new HashMap<>();
            for (int iCol = 0; iCol < columnCount; iCol++) {


                String key = excelRW.readCellValue(sheetName, 0, iCol);
                String value = excelRW.readCellValue(sheetName, iRow, iCol);
                map.put(key, value);

            }
                obj[0] = map;
                objects.add(obj);

            }
            return objects.iterator();
        }


    @DataProvider(name = "LogInDataHardcoded")
    public static Iterator<Object[]> dataprovider_hardcoded() throws IOException {

        //below lines are shortcuts. it will be useful for fast and easy execution with low number of code lines
        return Arrays.asList(new Object[]{
           new HashMap<String,String>(){{
               put("Name","Norris");
               put("Company","Mclaren");
               put("Greeting","bye bye");

           }}
        }
        ,new Object[]{
                new HashMap<String,String>(){{
                put("Name","Charles");
                put("Company","Ferrari");
                put("Greeting","hey");
                }}}).iterator();

        }

    }








        //create an index in list
        //in that location, i should add a new object array
        //in that object array, create a map
        //in that map,add all the values from row as key value pairs
        //repeat this for all rows







