package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeads;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DeleteLead";
		testDescription="DeleteLead in LeafTaps Application";
		testNodes="DeleteLead";
		category="Smoke";
		authors="Soumendra";
		browserName="chrome";
		dataSheetName="TC007_DeleteLead";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String findName, String vDeLead) {
		
		String leadId = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickFindLeads()
		.EnterFindName(findName)
		.clickFindLeads()
		.CaptureLeadId();
		new FindLeads()
		.clickLeadId()
		.clickDelete()
		.clickFindLeads()
		.enterLeadId(leadId)
		.clickFindLeads()
		.verifyLeadId(vDeLead);
		
	}

}