package Day13;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class trial {

    public static void main(String[] args) throws IOException, InterruptedException {

        FileInputStream fis = new FileInputStream("C:\\Users\\QF338GE\\OneDrive - EY\\Documents\\trial-training.xlsx");
        //file input stream converts into one format and uses apache file libraries.

        // Connect the sheet

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheet("Sheet1");
        XSSFSheet sheet2 = wb.getSheet("Sheet2");

        // Collect the Row count
        int rowsum = sheet1.getLastRowNum();

        // Logic - Reading from Excel, Applying it to the application, Extracting value and writing it back to excel


        for (int iRow = 1; iRow <= rowsum; iRow++) {
            XSSFCell cell = sheet1.getRow(iRow).getCell(0);
            String CellValue = "";
            if (cell.getCellType() == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.BLANK) {
                CellValue = "";
            } else if (cell.getCellType() == CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue());
            }

            System.out.println(CellValue);

            //write to cell
            sheet1.getRow(iRow).getCell(1).setCellValue("hello");
        }
    }
}
