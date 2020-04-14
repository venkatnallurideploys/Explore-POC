package thebigword.aem.testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import thebigword.aem.pages.Configpage;
import thebigword.aem.pages.Homepage;
import thebigword.aem.pages.LoginPage;
import thebigword.aem.pages.ProjectPage;
import thebigword.base.Base;
import thebigword.base.CustomListener;
import thebigword.util.Testutil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;


@Listeners(CustomListener.class)
public class Configpagetest extends Base {
 
  
  LoginPage loginpage;
  Homepage homepage;
  ProjectPage project;
  
 
  
  //driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
 //driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
  ////div[@class='foundation-collection-item-title'][contains(text(),'1211')]
	
	
	public Configpagetest()
	{
		super();		
	}	
  
	@Test
	public void execute_Config() throws InterruptedException
	{
		
		Configpage config = new Configpage();
		//config.clickOnTools();
		config.createTBWConfigurations();
		Assert.assertEquals(true, false);
		//System.out.println("Clicked on Tools");			
	}
	
  @BeforeMethod	  
  public void setUp()
		{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
  
  
  
 // @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
