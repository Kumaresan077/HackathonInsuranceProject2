package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelInsurance extends BaseClass {
    static JavascriptExecutor js;

    public TravelInsurance(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='container prd-container homeIcons home_version11']//div[7]")
    WebElement TravelInsurance;

    public void Navigation() {
        TravelInsurance.click();
    }

    @FindBy(css = "ul[id=favourite-country] li:nth-child(4)")
    WebElement selectCountry;

    public void CountryClick() {
        selectCountry.click();
    }

    @FindBy(css = ".travel_main_cta")
    WebElement clickNext;

    public void clickNext() {
        try {
            js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", clickNext);
        } catch (StaleElementReferenceException e) {
            driver.navigate().refresh();
            js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", clickNext);
        }
    }

    @FindBy(css = "input.MuiInputBase-input")
    WebElement calender;

    public void clickCalender() {
        calender.click();
    }

    @FindBy(css = "[aria-label='Mar 9, 2024']")
    WebElement StartDate;

    public void clickStartDate() {
        StartDate.click();
    }

    @FindBy(css = "[aria-label='Mar 12, 2024']")
    WebElement EndDate;

    public void clickEndDate() {
        EndDate.click();
    }

    @FindBy(css = "label[for='traveller_2']")
    WebElement NoOfTraveller;

    public void ClickNoOfTraveller() {
        NoOfTraveller.click();
    }

    @FindBy(xpath = "//div[@id='0']")
    WebElement AgeDropdown1;

    public void clickAgeDropdown1() {
        AgeDropdown1.click();
    }

    @FindBy(xpath = "//label[text()='21 years']")
    WebElement Age1;

    public void ClickAge1() {
        Age1.click();
    }

    @FindBy(xpath = "//div[@id='1']")
    WebElement AgeDropdown2;

    public void clickAgeDropdown2() {
        AgeDropdown2.click();
    }

    @FindBy(xpath = "//label[text()='22 years']")
    WebElement Age2;

    public void ClickAge2() {
        Age2.click();
    }

    @FindBy(id = "ped_no")
    WebElement MedicalHistory;

    public void ClickOnMedicalHistory() {
        MedicalHistory.click();
    }

    @FindBy(css = "[inputmode='numeric']")
    WebElement PhoneNumber;

    public void EnterPhoneNumber(String number) {
        PhoneNumber.sendKeys(number);
    }

    @FindBy(css = ".text-btn")
    WebElement Contiue;

    public void ClickContinue() {
        Contiue.click();
    }
}