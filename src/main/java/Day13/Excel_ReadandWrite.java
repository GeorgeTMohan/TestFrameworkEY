package Day13;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.naming.directory.SearchResult;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel_ReadandWrite {

    public static void main(String[] args) throws IOException, InterruptedException {


        // Open Excel
        FileInputStream fis = new FileInputStream("C:\\Users\\QF338GE\\OneDrive - EY\\Documents\\search.xlsx");
        //file input stream converts into one format and uses apache file libraries.

        // Connect the sheet

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheet("SearchResult");
        XSSFSheet sheet2 = wb.getSheet("Sheet2");

        // Collect the Row count
        int rowsum = sheet1.getLastRowNum();

        // Logic - Reading from Excel, Applying it to the application, Extracting value and writing it back to excel

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.bing.com");



        for(int iRow=1;iRow<=rowsum;iRow++){
            XSSFCell cell = sheet1.getRow(iRow).getCell(0);
            String CellValue = "";
            if(cell.getCellType()== CellType.STRING) {
                CellValue = cell.getStringCellValue();
            }else if(cell.getCellType()== CellType.BLANK) {
                CellValue = "";
            }else if(cell.getCellType()== CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue());
            }

             System.out.println(CellValue);

            driver.findElement(By.tagName("input")).sendKeys(CellValue);
            driver.findElement(By.id("sb_form_go")).submit();
            Thread.sleep(4000);

            String result = driver.findElement(By.className("sb_count")).getText();

            //write to cell

            sheet1.getRow(iRow).getCell(1).setCellValue(result);

            //back button
             driver.navigate().to("https://www.bing.com");

        }




         // Save Excel
        FileOutputStream fos = new FileOutputStream("C:\\Users\\QF338GE\\OneDrive - EY\\Documents\\search.xlsx");
        wb.write(fos);

        fis.close();fos.close();
        // Close
    }
}