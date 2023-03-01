package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ElLoginPage {
	WebDriver ldriver;
	public ElLoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
    //@FindBy (how=How.XPATH, using="") WebElement password;
	//@FindBy (how=How.XPATH, using="") WebElement email;
	
	@FindBy (how=How.XPATH, using="//p[contains(text(),'Sign into Elderly Life Account')]") WebElement loginpage;
	@FindBy (name="email") WebElement email;
	@FindBy (name="password") WebElement password;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Sign In')]") WebElement signInButton;
	@FindBy (how=How.XPATH, using="//body/div[@id='root']/div[1]/span[1]/a[1]/img[1]") WebElement Homepage;
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid password')]") WebElement passwordlessthan8Digit;
	
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Invalid email or password/Account is not Active')]") WebElement loginfail;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid email address')]") WebElement Invalidemail;
	
	@FindBy (how=How.XPATH, using="//div[contains(text(),'Please enter a valid email address and password')]") WebElement Invalidemailandpassword;
	
	
	
	
	
	public void enteremail(String EmialField)
	{
		email.sendKeys(EmialField);
	}
	
	public void enterpassword(String passwordField)
	{
		password.sendKeys(passwordField);
	}
	
	public void clickonLogin()
	{
		signInButton.click();
	}
	
	public void homepage() throws Exception
	{
		Thread.sleep(4000);
		Homepage.isDisplayed();
	}
	
	public void errormessage() throws Exception
	{
		Thread.sleep(3000);
	loginfail.isDisplayed();
	}
	public void loginpageI() throws Exception
	{
		
		loginpage.isDisplayed();
	}
	
	public void passwordlesstha8() throws Exception
	{
		Thread.sleep(3000);
		passwordlessthan8Digit.isDisplayed();
	}
	public void Noemail() throws Exception
	{
		Thread.sleep(3000);
		Invalidemail.isDisplayed();
	}
	
	public void Noemailpassword() throws Exception
	{
		Thread.sleep(3000);
		Invalidemailandpassword.isDisplayed();
	}
	
	
	
	
	
	
	
}
