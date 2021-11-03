package Day14;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel_RW {

    XSSFWorkbook wb;
    FileInputStream fis;
    //initialize an excel
 public Excel_RW(String xlPath) throws IOException {

//Open the excel

     fis = new FileInputStream(xlPath);
//Connect the sheet
     wb = new XSSFWorkbook(fis);
 }

//create a sheet object

    public XSSFSheet getSheet(String sheetName){
        XSSFSheet sheet1 = wb.getSheet(sheetName);
        return sheet1;
    }

//Rowcount

public int getRowCount(String sheetName){
    //XSSFSheet sheet1 = wb.getSheet(sheetName);
    //return sheet1.getLastRowNum();
    return getSheet(sheetName).getLastRowNum();
}

//Columncount

    public int getColumnCount(String sheetName){
     return getSheet(sheetName).getRow(1).getLastCellNum();

    }

//Read Operation

    public String readCellValue(String sheetName, int row, int column) {

            //XSSFSheet sheet1 = wb.getSheet(sheetName);
            //reading from a cell
            XSSFCell cell = getSheet(sheetName).getRow(row).getCell(column);
            String CellValue = "";
            if (cell.getCellType() == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.BLANK) {
                CellValue = "";
            } else if (cell.getCellType() == CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue());
            }

           return CellValue;
        }

//write operation

   public void writeCellValue(String sheetName, int row, int column,String value){
       //XSSFSheet sheet1 = wb.getSheet(sheetName);
       getSheet(sheetName).getRow(row).getCell(column).setCellValue(value);
   }

//save and close

   public void saveAndClose(String xlPath) throws IOException {

       FileOutputStream fos = new FileOutputStream("C:\\Users\\QF338GE\\OneDrive - EY\\Documents\\search.xlsx");
       wb.write(fos);

       fis.close();
       fos.close();
   }

}
