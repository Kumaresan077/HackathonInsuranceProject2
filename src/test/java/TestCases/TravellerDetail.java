package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.TravelInsurance;


public class TravellerDetail extends BrowserBaseClass {
	public static TravelInsurance ts;
	

	@Test(priority = 1)
	void Destination()  {
		
		ts=new TravelInsurance(driver);
		ts.CountryClick();
		ts.clickNext();
	}
	
	@Test(priority=2,dependsOnMethods = {"Destination"})
	void TripDate() throws InterruptedException{
		//TravelInsurance ts=new TravelInsurance(driver);
		ts.clickCalender();
		ts.clickStartDate();
		ts.clickEndDate();
		Thread.sleep(4000);
		ts.clickNext();
	}
	@Test(priority=3,dependsOnMethods = {"TripDate"})
	void NoOfTraveller() throws InterruptedException, IOException {
		
		ts.ClickNoOfTraveller();
		Thread.sleep(2000);
		ts.clickAgeDropdown1();
		ts.ClickAge1();
		ts.clickAgeDropdown2();
		ts.ClickAge2();
		Thread.sleep(2000);
		
		ts.clickNext();
	}
	@Test(priority=4,dependsOnMethods = {"NoOfTraveller"})
	void MedicalHistory() throws IOException, InterruptedException {
		ts.ClickOnMedicalHistory();
		
	}
	
	@Test(priority=5,dependsOnMethods = {"MedicalHistory"})
	void ContactDetail() throws IOException {
		ts.EnterPhoneNumber("9876543211");
		ts.clickNext();
		ts.ClickContinue();
	}
	
}
