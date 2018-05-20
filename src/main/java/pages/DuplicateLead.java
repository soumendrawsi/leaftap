package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pagescuc.ViewLead;
import wdMethods.ProjectMethods;

	public class DuplicateLead extends ProjectMethods{
		
		public DuplicateLead() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
		private WebElement eleVerifyDuplicateLead;
		
		public DuplicateLead verifyDuplicateLead(String data) {
			verifyExactText(eleVerifyDuplicateLead, data);
			return this;
		}
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleClickCreateLead;
		
		public ViewLead clickCreateLead() {
			click(eleClickCreateLead);
			return new ViewLead();
		}

}