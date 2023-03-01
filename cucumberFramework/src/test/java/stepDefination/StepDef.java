package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.LoginPage;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage logpg;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logpg=new LoginPage(driver);
	  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
    driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		logpg.enterEmail(email);
		logpg.enterPassword(password);
	}

	@When("click on Login")
	public void click_on_login() {
		logpg.clickLogin();

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
		logpg.clickLogout();
	    
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}

}
