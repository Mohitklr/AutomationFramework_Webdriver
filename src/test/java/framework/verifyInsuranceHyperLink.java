package framework;

import org.testng.annotations.Test;

import PageObject.LandingPage;
import resources.CommonUtilities;

public class verifyInsuranceHyperLink extends CommonUtilities{
	
	@Test
	public void TradeMeInsurance() {
		LandingPage Tlp=new LandingPage(driver);
		Tlp.getInsuranceLink();
	}
	
	
	
	

}
