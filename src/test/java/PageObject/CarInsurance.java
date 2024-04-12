package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CarInsurance extends BaseClass {

	public CarInsurance(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='container prd-container homeIcons home_version11']//div[4]")
	WebElement CarInsurance;
	public void ClickCarInsurance() {
		CarInsurance.click();
	}
	
	@FindBy(xpath="//button[@type='submit' or @class='primaryBtnV2 width-100 CarRegDetails_viewPrice__ZCN8r']")
	WebElement Submit;
	public void ClickSubmit() {
		Submit.click();
	}
	@FindBy(xpath="//*[text()='Please enter a valid car number']")
	WebElement ErrorMessage;
	public String ErrorMessage() {
		return ErrorMessage.getText();
	}
	
	@FindBy(linkText  = "Insurance Products")
	WebElement HealthInsurance;
	@FindBy(xpath  = "//div[@class='ruby-row']/div[3]//li")
	List<WebElement> InsuranceList;
	public List<String> HealthInsuranceList() {
		Actions act=new Actions(driver);
		act.moveToElement(HealthInsurance).click().perform();
		List<String> lst=new ArrayList<String>();
		for(WebElement hl:InsuranceList) {
			String insurancweName=hl.findElement(By.cssSelector("[itemprop='name']")).getText();
			System.out.println(insurancweName);
			lst.add(insurancweName);
		}
		System.out.println("success");
		return lst;
	}
}
