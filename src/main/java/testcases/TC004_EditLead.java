package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagescuc.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="EditLead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Soumendra";
		browserName="chrome";
		dataSheetName="TC004_EditLead";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd, String cname, String fname, String lname, String uFname, String vNtext) {
		
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
		.clickEdit()
		.enterFirstName(uFname)
		.clickUpdate()
		.verifyNameText(vNtext);
					
	}

}