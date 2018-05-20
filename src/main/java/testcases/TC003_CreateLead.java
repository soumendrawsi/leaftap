package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagescuc.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="CreateLead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sheik";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd, String cname, String fname, String lname, String vCname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickSubmit()
		.verifyText(vCname);
					
	}

}