package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagescuc.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="DuplicateLead in LeafTaps Application";
		testNodes="DuplicateLeads";
		category="Smoke";
		authors="Soumendra";
		browserName="chrome";
		dataSheetName="TC006_DuplicateLead";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String eMail, String vDupLead, String vDupText) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickFindLeads()
		.clickEmail()
		.enterEmail(eMail)
		.clickFindLeads()
		.clickSearchName()
		.clickDuplicateLead()
		.verifyDuplicateLead(vDupLead)
		.clickCreateLead()
		.verifyDupNameText(vDupText);
		
	}

}