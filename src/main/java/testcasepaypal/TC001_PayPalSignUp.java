package testcasepaypal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagespaypal.HomePaypal;
import wdMethods.ProjectMethods;

public class TC001_PayPalSignUp extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Paypal_SignUp";
		testDescription="PayPalSignUp";
		testNodes="Leads";
		category="Smoke";
		authors="Soumendra";
		browserName="chrome";
		dataSheetName="TC001_PaypalSignUp";
	}
	//@Test(dataProvider="fetchData")
	@Test
	public void PayPalSignUp() {
		
		new HomePaypal()
		.clickSignUp();
					
	}
}