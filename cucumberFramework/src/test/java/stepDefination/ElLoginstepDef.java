package stepDefination;

import java.io.File;


import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageObject.ElLoginPage;


public class ElLoginstepDef {
	
	
	public WebDriver driver;
	public ElLoginPage login;
	
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	
	@After(order=2)
	public void screeshot(Scenario sc) throws Exception
	{
		if(sc.isFailed()==true)
		{			
			//Specifying the screenshot loaction to store along with file name
			
			//String filepath="C:\\Users\\TOSHIBA\\eclipse-workspace\\cucumberFramework\\FailedScreenshots\\test1.png";
			String filepath="C:\\Users\\TOSHIBA\\eclipse-workspace\\cucumberFramework\\FailedScreenshots\\"+sc.getName()+".png";
			//Creating the Object for screenshot class
			TakesScreenshot scrshot=((TakesScreenshot)driver);
			//Taking the screenshot and storing in the ""scrshot"" location
			File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
			///Specifing the loaction of the screenshot folder to the ""dest""
			File dest=new File(filepath);
			//Copying the scrfile to the dest location
			FileUtils.copyFile(scrfile, dest);			
			
		}
	}
	
	
	@After(order=1)	
public void quit()
{
	driver.close();
}
	
	
	@Given("User launched Chrome browser")
	public void user_launched_chrome_browser() {
		
		login=new ElLoginPage(driver);
	   
	}
	@When("User opens the SignIn URL {string}")
	public void user_opens_the_sign_in_url(String url) {
	  driver.get(url);
	}
	@When("User Enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		login.enteremail(email);
		login.enterpassword(password);
	}
	@When("Click on Login button")
	public void click_on_login_button() {
		login.clickonLogin();
	}
	@Then("Should display an error message")
	public void should_display_an_error_message() throws Exception {
		login.errormessage();
	}
	@Then("Close the chrome Browser")
	public void close_the_chrome_browser() {
	  driver.close();
	}
	
	@Then("Should open dashboard page")
	public void should_open_dashboard_page() throws Exception {
		login.homepage();
	}
	@Then("Should display an error message as invalid email and password")
	public void should_display_an_error_message_as_invalid_email_and_password() throws Exception {
		login.Noemailpassword();
	}
	
	@Then("Should display an error message as invalid password")
	public void should_display_an_error_message_as_invalid_password() throws Exception {
		login.passwordlesstha8();
	}
	@Then("Should display an error message as invalid email")
	public void should_display_an_error_message_as_invalid_email() throws Exception {
		login.Noemail();
	}

	
	
	
}
