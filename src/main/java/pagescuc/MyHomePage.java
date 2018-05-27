package pagescuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

	public class MyHomePage extends SeMethods{
		
		public MyHomePage() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleClickLead;
		@And("click the lead")
		public MyLeads clickLead() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleClickLead);
			return new MyLeads();
		}


}