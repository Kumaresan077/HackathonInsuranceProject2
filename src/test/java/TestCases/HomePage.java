package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObject.TravelInsurance;
import utilities.ScreenshotUtilities;

public class HomePage extends BrowserBaseClass{

	@Test(priority = 1)
	void VerifiyTitle() {
		
	 
	}
	//Navigate to car insurance page
	@Test(priority = 2,dependsOnMethods = {"VerifiyTitle"})
	void NavigateTravelInsurance() throws InterruptedException
	{	
		Thread.sleep(1000);
		TravelInsurance ts=new TravelInsurance(driver);
		ts.Navigation();
	}
	
}
