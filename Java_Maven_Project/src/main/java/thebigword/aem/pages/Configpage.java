package thebigword.aem.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import thebigword.base.Base;
import thebigword.util.Testutil;

public class Configpage extends Base {
	Homepage pages11;
	sites site;	
	
	@FindBy(xpath="//coral-card-title[contains(text(),'Configuration Browser')]")
	WebElement clickOnConfigurationBrowser;
	  
	@FindBy(xpath="//coral-button-label[contains(text(),'Create')]")
	WebElement clickOnCreateConfig;
	
	
	@FindBy(xpath="//coral-tablist[@role='tablist']/child::coral-tab[2]")
	WebElement  clickedOnToolsIcon;
	
	@FindBy(xpath="//form[@id='create-config-form']/div/input")
	WebElement provideTitleforConfig;
	
	@FindBy(xpath="//form[@id='create-config-form']/ul/li[2]")
	WebElement CheckCloudConfigurations;
	
	@FindBy(xpath="//button[@id='create-configuration-button-confirm']")
	WebElement confirmConfiguration;
	
	//div[@class='foundation-collection-item-title'][contains(text(),'1211')]
	String configname = "Test_Config_1249_Nov11";
	
	@FindBy(xpath="//div[@class='foundation-collection-item-title'][contains(text(),'Test_Config_1249_Nov11')]")
	WebElement checkCreatedConfig;
	//String configname = "Test_Config_1849";
	
	
	
	@FindBy(xpath="//coral-columnview-item-content[contains(text(),'Cloud Services')]")
	WebElement clickOnCloudServices;
	
	@FindBy(xpath="//coral-card-title[contains(text(),'Translation Cloud Services')]")
	WebElement clickTranslationCloudServices;
	
	@FindBy(xpath="//coral-columnview-item[1]")
	WebElement selectConf;
	
	@FindBy(xpath="//div[contains(text(),'Test_Config_1916')]")
	WebElement selectCreatedConfig;
	
	
	
	public Configpage()
	{
		site = new sites();
		pages11 = new Homepage();
		PageFactory.initElements(driver,pages11);
		PageFactory.initElements(driver,this);	
		PageFactory.initElements(driver,site);
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);		
	}
	
	//String configname = "Test_Config_1842";
	
	public void  clickOnTools() throws InterruptedException
	{	
		//Thread.sleep(5000);
		pages11.clickSites();
		site.homebutton.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickedOnToolsIcon.click();	
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickOnConfigurationBrowser.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickOnCreateConfig.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		provideTitleforConfig.sendKeys(configname);
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		CheckCloudConfigurations.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		confirmConfiguration.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		String config = checkCreatedConfig.getText();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Assert.assertEquals(config, configname);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				
	}
	
	
	public void createTBWConfigurations()
	{
		//site.homebutton.click();
	//driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		//driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickedOnToolsIcon.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickOnCloudServices.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickTranslationCloudServices.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		selectConf.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		selectCreatedConfig.click();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		clickOnCreateConfig.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
