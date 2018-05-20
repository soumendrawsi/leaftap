package pagescuc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

	public class OpenTabsCRM extends SeMethods{
		
		public OpenTabsCRM() {		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.ID,using="updateLeadForm_firstName")
		private WebElement eleFirstName;
		
		public OpenTabsCRM enterFirstName(String data) {
			type(eleFirstName, data);
			return this;
		}
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleUpdate;
		
		public ViewLead clickUpdate() {
			click(eleUpdate);
			return new ViewLead();		
		}

}