package pagespaypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePaypal extends ProjectMethods{
		
		public HomePaypal() 
		{		
			PageFactory.initElements(driver,this);
		}	
		
		@FindBy(how=How.ID,using="signup-button")
		private WebElement signUp;
		
		public SignUp clickSignUp() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(signUp);
			return new SignUp();		
		}
}

