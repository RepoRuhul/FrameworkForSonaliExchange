package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signUp; //

	@FindBy(xpath = "//input[@id='EMAIL']")
	WebElement EnterYourEmail;

	@FindBy(xpath = "//input[@id='FNAME']")
	WebElement YourFName;

	@FindBy(xpath = "//input[@name='MNAME']")
	WebElement YourMName;
	@FindBy(name = "LNAME")
	WebElement YourLName;

	@FindBy(xpath = "//input[@name='ADDRESS1']")
	WebElement EnterAddress;

	@FindBy(xpath = "//input[@id='CITY']")
	WebElement city;

	@FindBy(xpath = "//select[@id='STATE']")
	WebElement state01;

	@FindBy(xpath = "//input[@name='POSTAL_CODE']")
	WebElement EnterZip;

	@FindBy(xpath = "//select[@Id='CURRENT_LOCATION']")
	WebElement countryOfResidence;

	@FindBy(xpath = "//select[@id='NATIONALITY']")
	WebElement citizenship;

	@FindBy(xpath = "//input[@id='ssn1']")
	WebElement SocialOne;
	@FindBy(xpath = "//input[@id='ssn2']")
	WebElement SocialTwo;
	@FindBy(xpath = "//input[@id='ssn3']")
	WebElement SocialThree;

	@FindBy(xpath = "//input[@name='state_drivingid']")
	WebElement EnterDrivingID;

	@FindBy(xpath = "//select[@id='D1']")
	WebElement state02;

//	@FindBy(xpath = "//div[@class='form-group']//child::input[@id='PHONE']")
//	WebElement PhoneNumber;

	@FindBy(xpath = "//input[@id='C_PHONE']")
	WebElement PhoneNumberOne;
	@FindBy(xpath = "//input[@id='CI_PHONE']")
	WebElement PhoneNumberTwo;
	@FindBy(xpath = "//input[@id='PHONE']")
	WebElement PhoneNumberThree;

	@FindBy(xpath = "//select[@class='form-control' and @name='PROMOTIONAL_QCODE-2']")
//	@FindBy(name = "PROMOTIONAL_QCODE-2")//this  name locator also working as well
	WebElement lessThenUsd25000;

	@FindBy(xpath = "//select[@name='OCCUPATION']")
	WebElement Ocupation;

	@FindBy(xpath = "//select[@id='MONTH']")
	WebElement month;
	@FindBy(xpath = "//select[@id='DAY']")
	WebElement date;
	@FindBy(xpath = "//select[@id='YEAR']")
	WebElement year;

	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() {
		pause(1);
		clickElement(signUp);
		pause(1);
		inputText(EnterYourEmail, "ruhulrana82@yahoo.com");
		pause(1);
		inputText(YourFName, "Md");
		pause(1);
		inputText(YourMName, "B");
		pause(1);
		inputText(YourLName, "Chowdhury");
		pause(1);
		inputText(EnterAddress, "3340 bailey ave");
		pause(1);
		inputText(city, "Buffalo ");
		pause(1);
		clickElement(state01);
		selectDropdown(state01, "New York");
		inputText(EnterZip, "14215");
		pause(1);
		clickElement(countryOfResidence);
		selectDropdown(countryOfResidence, "United States");
		pause(1);
		clickElement(countryOfResidence);
		selectDropdown(citizenship, "United States");
		pause(1);
		inputText(SocialOne, "078");
		inputText(SocialTwo, "09");
		inputText(SocialThree, "9874");
		pause(1);
		inputText(EnterDrivingID, "811789881");
		pause(1);
		clickElement(state02);
		selectDropdown(state02, "New York");
		pause(1);

		inputText(PhoneNumberOne, "929");
		inputText(PhoneNumberTwo, "315");
		inputText(PhoneNumberThree, "4398");
		pause(1);

		clickElement(lessThenUsd25000);
		pause(2);
		selectDropdown(lessThenUsd25000, "Greater than USD 100,000");
		pause(2);

		clickElement(Ocupation);
		selectDropdown(Ocupation, "Customer service/support");
		pause(1);

		clickElement(month);
		selectDropdown(month, "June");
		pause(1);
		clickElement(date);
		selectDropdown(date, "3");
		pause(1);
		clickElement(date);
		selectDropdown(year, "1947");
		pause(1);

	}

}
