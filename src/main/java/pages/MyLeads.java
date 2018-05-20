package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLead;
import pages.FindLeads;
import pages.MergeLeads;
import wdMethods.ProjectMethods;

	public class MyLeads extends ProjectMethods{
		
		public MyLeads() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleClickCreateLead;
		
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
		
		public FindLeads clickFindLeads() {
			click(eleClickFindLeads);
			return new FindLeads();
		}

}