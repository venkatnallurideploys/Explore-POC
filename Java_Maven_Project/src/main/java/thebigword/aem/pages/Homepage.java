package thebigword.aem.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import thebigword.base.Base;

public class Homepage extends Base {
	@FindBy(xpath = "//div[contains(text(),'Sites')]")
	WebElement sites;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}	
	public String validateHomepageTitle()
	{
		return driver.getTitle();
	}	
	public sites clickSites()
	{
		sites.click();		
		return new sites();
	}		
	//Actions
	public String validateSitesPageTitle()
	{
		return driver.getTitle();		
	}	
}
