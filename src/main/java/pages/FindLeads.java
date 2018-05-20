package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.FindLeads;

import wdMethods.ProjectMethods;


	public class FindLeads extends ProjectMethods{
		
		public FindLeads() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.CLASS_NAME,using="linktext")
		private WebElement eleSelectFrLead;
		public String verifyLead()
		{
			switchToWindow(1);
			String leadVerify = eleSelectFrLead.getText();
			return leadVerify;		
		}
		
		
		@FindBy(how=How.CLASS_NAME,using="linktext")
		private WebElement eleSelectFromLead;
		
		public MergeLeads clickSelectFromLead()
		{
			switchToWindow(1);
			click(eleSelectFromLead);
			return new MergeLeads();		
		}
		
		@FindBy(how=How.LINK_TEXT,using="10093")
		private WebElement eleSelectToLead;
		
		public MergeLeads clickSelectToLead()
		{
			switchToWindow(1);
			click(eleSelectToLead);
			return new MergeLeads();		
		}
		@FindBy(how=How.XPATH,using="(//input[contains(@class, 'x-form-text x-form-field')])[28]")
		private WebElement eleLeadId;
		
		public FindLeads enterLeadId(String leadVerify ) {
			type(eleLeadId, leadVerify);
			return this;
		}
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
		private WebElement eleClickFindLead;
		
		public FindLeads clickFindLeads()
		{
			click(eleClickFindLead);
			return this;		
		}
		@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
		private WebElement eleVerifyLeadID;
		
		public FindLeads verifyLeadId(String data) {
			verifyPartialText(eleVerifyLeadID, data);
			return this;
		}
		@FindBy(how=How.XPATH,using="(//span[@class='x-tab-strip-text '])[3]")
		private WebElement eleClickEmail;
		
		public FindLeads clickEmail() {
			click(eleClickEmail);
			return this;
		}
		@FindBy(how=How.NAME,using="emailAddress")
		private WebElement eleEnterEmail;
		
		public FindLeads enterEmail(String data) {
			type(eleEnterEmail,data);
			return this;
			
		}
		
		@FindBy(how=How.LINK_TEXT,using="Soumendra")
		private WebElement eleClickSearchName;
		
		public ViewLead clickSearchName()
		{
			click(eleClickSearchName);
			return new ViewLead();		
		}
		@FindBy(how=How.XPATH ,using="(//input[@name='firstName'])[3]")
		private WebElement eleEnterFindName;
		
		public FindLeads EnterFindName(String data) {
			type(eleEnterFindName, data);
			return this;
		}
		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
		private WebElement eleCaptureLeadId;
		
		public String CaptureLeadId()
		{
			leadIDs= getText(eleCaptureLeadId);
			//click(eleCaptureLeadId);
			return leadIDs;		
		}
		
		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
		private WebElement eleClickLeadId;
		
		public ViewLead clickLeadId()
		{
			click(eleClickLeadId);
			return new ViewLead();		
		}
}