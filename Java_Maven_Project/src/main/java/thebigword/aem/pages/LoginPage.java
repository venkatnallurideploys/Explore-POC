package thebigword.aem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import thebigword.base.Base;

public class LoginPage extends Base {
	
	
	//Page Factory - OR
	
	@FindBy(name="j_username")
	WebElement  username;
	@FindBy(name="j_password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit-button']")
	WebElement loginbutton;
	
	@FindBy(className="coral-Heading_coral-Heading--1")
	WebElement logo;
	
	
	//initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	//Actions
	public boolean imgverification()
	{
		return logo.isDisplayed();
	}
	
	//Actions
	
	public Homepage login(String un , String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new Homepage();
	}
	
	public String validateHomepageTitle()
	{
		return driver.getTitle();
	}
	
	

}
