package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObject.BaseClass;

public class ScreenshotUtilities extends BaseClass{

	public ScreenshotUtilities(WebDriver driver) {
		super(driver);
	}

	public void TakeScreenShotMethod(String path) throws IOException {
		String location=System.getProperty("user.dir")+"//ScreenShots//";
		location+=path+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(location);
		//copying the src file to trg file
		FileUtils.copyFile(src, trg);
	}																																																																						
}
