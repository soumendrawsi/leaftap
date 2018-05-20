package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagescuc.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="MergeLead in LeafTaps Application";
		testNodes="MergeLeads";
		category="Smoke";
		authors="Sheik";
		browserName="chrome";
		dataSheetName="TC005_MergeLead";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String vLeadId) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickMergeLead()
		.clickFromLead()
		.clickSelectFromLead()
		.clickToLead()
		.clickSelectToLead()
		.clickMergeButton()
		.clickFindLeads()
		.enterLeadId("10074")
		.clickFindLeads()
		.verifyLeadId(vLeadId);
		
	}

}