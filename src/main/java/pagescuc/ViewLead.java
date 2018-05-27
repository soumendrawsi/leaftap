package pagescuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.SeMethods;

	public class ViewLead extends SeMethods{
		
		public ViewLead() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.ID,using="viewLead_companyName_sp")
		private WebElement eleVerifyCompanyName;
		@And("verify the company name as (.*)")
		public ViewLead verifyText(String data) {
			verifyPartialText(eleVerifyCompanyName, data);
			return this;
		}
		
		@FindBy(how=How.LINK_TEXT,using="Edit")
		private WebElement eleClickEdit;
		@And("Click Edit")
		public OpenTabsCRM clickEdit() {
			click(eleClickEdit);
			return new OpenTabsCRM();		
		}
		@FindBy(how=How.ID,using="viewLead_firstName_sp")
		private WebElement eleVerifyFirstName;
		@Then("Confirm the changed name appears as (.*)")
		public ViewLead verifyNameText(String data) {
			verifyExactText(eleVerifyFirstName, data);
			return this;
		}
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleClickFindLeads;
		
		public FindLeads clickFindLeads() {
			click(eleClickFindLeads);
			return new FindLeads();		
		}
		@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
		private WebElement eleClickDuplicateLead;
		
		public DuplicateLead clickDuplicateLead() {
			click(eleClickDuplicateLead);
			return new DuplicateLead();		
		}
		@FindBy(how=How.ID,using="viewLead_firstName_sp")
		private WebElement eleVerifyDuptName;
		
		public ViewLead verifyDupNameText(String data) {
			verifyExactText(eleVerifyDuptName, data);
			return this;
		}
		@FindBy(how=How.LINK_TEXT,using="Delete")
		private WebElement eleClickDelete;
		@And("clickDelete")
		public MyLeads clickDelete() {
			click(eleClickDelete);
			return new MyLeads();		
		}

}