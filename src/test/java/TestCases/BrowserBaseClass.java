package TestCases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BrowserBaseClass {
    static WebDriver driver;
    
    
    @Parameters({"browser"})
    void openApp(String value) {
        Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Add key and value to map as follows to switch off browser notification
        // Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);
            
        // Create an instance of ChromeOptions 
        ChromeOptions options = new ChromeOptions();
            
        // Set ExperimentalOption - prefs 
        options.setExperimentalOption("prefs", prefs);
        
        if (value.equals("chrome")) {
            driver = new ChromeDriver(options);
        } else if (value.equals("edge")) {
            driver = new EdgeDriver();
        }
        
        driver.get("https://www.policybazaar.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    
    
    void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
