package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='SiteHeader_Sitenav_mainTmiNavbarLink']")
	WebElement TrademeInsurance;
	
	
	@FindBy(css="a[href*='Register']")
	WebElement registerLink;
	


	public WebElement getInsuranceLink(){
		
		return TrademeInsurance;
	}
	
	public WebElement ClickRegisterLink(){
	
	return registerLink;
}

	
}
