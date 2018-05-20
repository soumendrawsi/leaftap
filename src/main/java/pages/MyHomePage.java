package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.MyLeads;
import wdMethods.ProjectMethods;

	public class MyHomePage extends ProjectMethods{
		
		public MyHomePage() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleClickLead;
		
		public MyLeads clickLead() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleClickLead);
			return new MyLeads();
		}


}