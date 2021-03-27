package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@class='rego-input-email']")
	WebElement EmailID;
	
	@FindBy(id="LoginDetails_PasswordTextBox")
	WebElement Password;
	
	@FindBy(id="LoginDetails_ConfirmPasswordTextBox")
	WebElement ConfirmPassword;
	
	@FindBy(id="LoginDetails_UserNameTextBox")
	WebElement username;
	
	@FindBy(id="ContactDetails_FirstNameTextBox")
	WebElement FirstName;
	
	@FindBy(id="ContactDetails_LastNameTextBox")
	WebElement LastName;
	
	@FindBy(xpath="//span[@class='tm-switch tm-switch-radio'] //label[@for='ContactDetails_GenderMale']")
	WebElement Gender;
	
	@FindBy(id="ContactDetails_DobYear")
	WebElement DOBYear;
	
	@FindBy(id="ContactDetails_DobDay")
	WebElement DOBDay;
	
	@FindBy(id="ContactDetails_DobMonth")
	WebElement DOBMonth;
	
	@FindBy(id="ContactDetails_ContactPhoneTextBox")
	WebElement PhoneNumber;
	
	@FindBy(css=".js-txt-search-address")
	WebElement Address;
	
	@FindBy(id="ContactDetails_ClosestSuburbDropDown")
	WebElement ClosestDistrict;
	
	@FindBy(id="TnCCheckbox")
	WebElement TnCCheckbox;
	
	@FindBy(id="SubmitButton")
	WebElement RegisterPageSubmitButton;
	
	
	
	
	public WebElement getEmailID() {
		return EmailID;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getContactDetailsFirstName() {
		return FirstName;
	}
	
	public WebElement getContactDetailsLastName() {
		return LastName;
	}
	
	public WebElement getGender() {
		return Gender;
	}
	
	public WebElement getDOBDay() {
		return DOBDay;
	}
	
	public WebElement getDOBMonth() {
		return DOBMonth;
	}
	
	public WebElement getDOBYear() {
		return DOBYear;
	}
	
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	
	public WebElement getAddress(){
		return Address;
	}
	public WebElement getClosestDistrict() {
		return ClosestDistrict;
	}
	
	public WebElement getTnCCheckbox() {
		return TnCCheckbox;
	}
	public WebElement getRegisterPageSubmitButton() {
		return RegisterPageSubmitButton;
	}
	
	
}
