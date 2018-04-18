package Automation.Selenium;

import java.io.File;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


public class ExcelReader {

	public static void main(String[] args) throws JXLException, Exception {
		
		File f = new File("D:\\Selenium\\datareader1.xlsx");
	Workbook wb = Workbook.getWorkbook(f);
	Sheet sh = wb.getSheet(0);
	System.out.println(sh.getRows());
	System.out.println(sh.getColumns());
//	

}
}