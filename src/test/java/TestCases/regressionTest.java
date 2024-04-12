package TestCases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObject.CarInsurance;

public class regressionTest extends BrowserBaseClass{

@Test(priority = 3,groups = {"regression"})
void HealthInsurance() throws IOException {
	CarInsurance ci=new CarInsurance(driver);
	List<String> element=ci.HealthInsuranceList();
	FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"//dataManage//HealthInsuranceSearchResult.xlsx");
	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet sheet=book.createSheet();
	int increment=0;
	//writing  data into excel 
	for(String data:element) {
	sheet.createRow(increment).createCell(0).setCellValue(data);
	increment++;
	}
	book.write(fos);
	book.close();
	fos.close();
	System.out.println("written completed");
 }
}
