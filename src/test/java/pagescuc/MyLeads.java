package pagescuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

	public class MyLeads extends SeMethods{
		
		public MyLeads() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleClickCreateLead;
		@And("click create lead")
		public CreateLead clickCreateLead() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleClickCreateLead);
			return new CreateLead();		
		}
		@FindBy(how=How.LINK_TEXT,using="Merge Leads")
		private WebElement eleClickMergeLead;
		
		public MergeLeads clickMergeLead() {
			click(eleClickMergeLead);
			return new MergeLeads();		
		}
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleClickFindLeads;
		@And("clickFindLeads")
		public FindLeads clickFindLeads() {
			click(eleClickFindLeads);
			return new FindLeads();
		}

}