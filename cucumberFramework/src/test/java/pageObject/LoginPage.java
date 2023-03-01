package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	
	
	@FindBy (how=How.XPATH, using="//input[@id='Email']") WebElement email ;
	@FindBy (how=How.XPATH, using="//input[@id='Password']") WebElement Password ;
	@FindBy (how=How.XPATH, using="//button[contains(text(),'Log in')]") WebElement login ;
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Logout')]") WebElement logout ;
	
	
	
	public void enterEmail(String emailadd)
	{
		email.clear();
		email.sendKeys(emailadd);
	}
	public void enterPassword(String passadd)
	{
		Password.clear();
		Password.sendKeys(passadd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}

}
