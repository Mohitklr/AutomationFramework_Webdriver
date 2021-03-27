package framework;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.RegisterPage;
import resources.CommonUtilities;

public class RegisterUser extends CommonUtilities {

	@BeforeTest
	public void beforetestIntialize() throws IOException {
		driver = invokebrowser();

	}

	@SuppressWarnings("deprecation")
	@Test(dataProvider = "getRegisterUserData",groups= {"FunctionalTest"})
	public void RegisterNewUser(String EmailID, String password, String ConfirmPassword, String Username,
			String FirstName, String LastName, String DOBMOnth, String PhoneNumber)
			throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(WebURL);
		LandingPage Tlp = new LandingPage(driver);
		Tlp.ClickRegisterLink().click();
		RegisterPage Rp = new RegisterPage(driver);
		Rp.getEmailID().sendKeys(EmailID);
		Rp.getPassword().sendKeys(password);
		Rp.getConfirmPassword().sendKeys(ConfirmPassword);
		Rp.getUsername().sendKeys(Username);
		Rp.getContactDetailsFirstName().sendKeys(FirstName);
		Rp.getContactDetailsLastName().sendKeys(LastName);
		Rp.getGender().click();

		Select s = new Select(Rp.getDOBDay());
		s.selectByIndex(10);

		Select s1 = new Select(Rp.getDOBMonth());
		s1.selectByVisibleText(DOBMOnth);
		Rp.getDOBYear().sendKeys("1992");
		Rp.getPhoneNumber().sendKeys(PhoneNumber);

		/*
		 * Rp.getAddress().sendKeys("4 Queen"); Thread.sleep(3000); List<WebElement>
		 * ListOfAddresses=driver.findElements(By.xpath(
		 * "//div[@class='address-suggestions-115']/ul']")); int
		 * Size=driver.findElements(By.xpath(
		 * "//div[@class='address-suggestions-115']/ul']")).size(); for(int
		 * i=0;i<Size;i++) { if(ListOfAddresses.get(i).getText().contains(" Epsom")) {
		 * ListOfAddresses.get(i).click(); Thread.sleep(1000);
		 * }//System.out.println(driver.findElement(By.cssSelector(
		 * "//div[@class='address-suggestions-115']/ul")).getText()); }
		 */

		Select s3 = new Select(Rp.getClosestDistrict());
		s3.selectByVisibleText("Auckland - Auckland City");
		Rp.getTnCCheckbox().click();

	}
	
	@Test(groups= {"Sanity"})
	public void validateRegisterUserPage() {
		driver.get(WebURL);
		LandingPage Tlp = new LandingPage(driver);
		Tlp.ClickRegisterLink().click();
		RegisterPage Rp = new RegisterPage(driver);
		String RegisterPageTitle=driver.getTitle();
		//Register Page Title is correct
		Assert.assertEquals(RegisterPageTitle, "TRADEME SANDBOX - Buy online and sell with NZ's #1 auction & classifieds site | Trade Me SANDBOX");
		//Create Account Button is present on Register Page
		Assert.assertTrue(Rp.getRegisterPageSubmitButton().isDisplayed());
		
	}
	

	@DataProvider
	public Object[][] getRegisterUserData() {

		// Row - How many diff dataset the test needs to run for
		// column - number of arguments/values for each test
		Object[][] data = new Object[2][8];
		// 1st row
		data[0][0] = "Test1@gmail.com";
		data[0][1] = "pwd1111";
		data[0][2] = "pwd1111";
		data[0][3] = "Username1111";
		data[0][4] = "FirstName1111";
		data[0][5] = "LastName1111";
		data[0][6] = "July";
		data[0][7] = "98977382";
		//2nd row
		data[1][0] = "Test2@gmail.com";
		data[1][1] = "pwd2222";
		data[1][2] = "pwd2222";
		data[1][3] = "Username2222";
		data[1][4] = "FirstName2222";
		data[1][5] = "LastName2222";
		data[1][6] = "March";
		data[1][7] = "98977382";

		return data;

	}

}
