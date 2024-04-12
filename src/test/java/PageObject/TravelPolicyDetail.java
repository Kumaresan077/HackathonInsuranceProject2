package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelPolicyDetail extends BaseClass{

	public TravelPolicyDetail(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css=".rightSection>section")
	WebElement SortBy;
	@FindBy(xpath="//section[@id='root']/div/div[2]/aside/section")
	WebElement SortBy2;
	public void ClickSortBy() {
		try {
		SortBy.click();
		}
		catch(Exception e) {
			SortBy2.click();
		}
	}
	
	//driver.findElement(By.id("17_sort")).click();
	@FindBy(id="17_sort")
	WebElement LowToHigh;
	public void LowToHigh() {
		LowToHigh.click();
	}
	

	
	@FindBy(css=".leftSection >article")
	List<WebElement> policyDeatil;
	public void PrintPolicyDetail() {
		int count=0;
		for(WebElement lst:policyDeatil) {
			try {
			String name=lst.findElement(By.cssSelector(".quotesCard--insurerName")).getText();
			System.out.println(name);
			String name2=lst.findElement(By.cssSelector(".premiumPlanPrice")).getText();
			count++;
			System.out.println(name2);
			}
			catch (Exception e) {
				// TODO: handle exception
				String name=lst.findElement(By.cssSelector(".quotesCard--insurerName")).getText();
				System.out.println(name);
				String name2=lst.findElement(By.cssSelector(".premiumPlanPrice")).getText();
				name2=name2.replace("?", "RS-");
				System.out.println(name2);
				count++;
			}
			if(count==3)
				break;
		}
		
	}

}
