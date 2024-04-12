package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.TravelInsurance;
import PageObject.TravelPolicyDetail;
import utilities.ScreenshotUtilities;

public class TravelPolicies extends BrowserBaseClass{
	public static TravelPolicyDetail tp;
	//Travel Policy Detail
	@Test
	public void SortBy() throws InterruptedException, IOException {
		tp=new TravelPolicyDetail(driver);
		Thread.sleep(2000);
		tp.ClickSortBy();
		try {
		tp.LowToHigh();
		}
		catch (Exception e) {
			// TODO: handle exception
			tp.ClickSortBy();
			tp.LowToHigh();
		}
		tp.PrintPolicyDetail();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Policybazaar")).click();
	}
	

}
