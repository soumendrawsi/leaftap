package pagescuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

	public class CreateLead extends SeMethods{
		
		public CreateLead() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.ID,using="createLeadForm_companyName")
		private WebElement eleCompanyName;
		@And("enter the company name as (.*)")
		public CreateLead enterCompanyName(String data) {
			type(eleCompanyName, data);
			return this;
		}
		@FindBy(how=How.ID,using="createLeadForm_firstName")
		private WebElement eleFirstName;
		@And("enter the first name as (.*)")
		public CreateLead enterFirstName(String data) {
			type(eleFirstName, data);
			return this;
		}
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement eleLastName;
		@And("enter the last name as (.*)")
		public CreateLead enterLastName(String data) {
			type(eleLastName, data);
			return this;
		}
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleSubmit;
		@And("click submit")
		public ViewLead clickSubmit() {
			click(eleSubmit);
			return new ViewLead();		
		}
		

}