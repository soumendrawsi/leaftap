package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepCreateLead {
	public static RemoteWebDriver driver;
	@Given("open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("maximize the browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	@And("set time out")
	public void timeOut()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("enter the URL")
	public void enterURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("please enter the userName as (.*)")
	public void enterUsername(String data)
	{
		driver.findElementById("username").sendKeys(data);
	}
	@And("please enter the password as (.*)")
	public void enterPassword(String data)
	{
		driver.findElementById("password").sendKeys(data);
	}
	@And("please click on the login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("please verify login is success")
	public void verifyLogin()
	{
		System.out.println("Login successful");
	}
	@And("please click crm/sfa")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("please click the lead")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And("please click create lead")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("please enter the company name as (.*)")
	public void enterCompanyName(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("please enter the first name as (.*)")
	public void enterFirstName(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("please enter the last name as (.*)")
	public void enterLastName(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@And("please click submit")
	public void clickSubmit()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	@And("please verify create lead is successful")
	public void verifyCreateLead()
	{
		System.out.println("Create Lead successful");
	}

}