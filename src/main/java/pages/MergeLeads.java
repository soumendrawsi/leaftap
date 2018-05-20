package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pagescuc.FindLeads;
import pagescuc.ViewLead;
import wdMethods.ProjectMethods;

	public class MergeLeads extends ProjectMethods{
		
		public MergeLeads() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
		private WebElement eleMergeFromLead;
		
		public FindLeads clickFromLead() {
			click(eleMergeFromLead);
			return new FindLeads();		
		}
		
		@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
		private WebElement eleMergeToLead;
		
		public FindLeads clickToLead() {
			switchToWindow(0);
			click(eleMergeToLead);
			return new FindLeads();		
		}
		@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
		private WebElement eleMergeButton;
		
		public ViewLead clickMergeButton() {
			switchToWindow(0);
			click(eleMergeButton);
			acceptAlert();
			return new ViewLead();	
		}

}