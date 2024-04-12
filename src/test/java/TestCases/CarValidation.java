package TestCases;
import java.io.IOException;
import org.testng.annotations.Test;
import PageObject.CarInsurance;
import utilities.ScreenshotUtilities;

public class CarValidation extends BrowserBaseClass{

	public static CarInsurance ci;
	public static ScreenshotUtilities ss;
	@Test
	void CarInsurance() throws InterruptedException, IOException {
		Thread.sleep(3000);
		ci=new CarInsurance(driver);
		ci.ClickCarInsurance();
		ci.ClickSubmit();
		Thread.sleep(5000);
		ss=new ScreenshotUtilities(driver);
		ss.TakeScreenShotMethod("CarInsurance error message ");
		String  Error_Message=ci.ErrorMessage();
		System.out.println(Error_Message);
		Thread.sleep(3000);
	}
	@Test(priority = 2,dependsOnMethods = {"CarInsurance"})
	void NavigateHome() {
		driver.navigate().back();
	}
}
