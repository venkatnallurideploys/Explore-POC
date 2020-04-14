package thebigword.aem.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import thebigword.aem.pages.Homepage;
import thebigword.aem.pages.LoginPage;
import thebigword.aem.pages.sites;
import thebigword.base.Base;import thebigword.base.CustomListener;


public class SitesTest extends Base {
	
	LoginPage loginpage;
	Homepage homepage;
	sites site;
	
	public SitesTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickSites();
	}
	
	@Test	
	public void selectTemplate_CreateProject() throws InterruptedException
	{
		site = new sites();
		site.CreateProject();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
