package thebigword.aem.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import thebigword.aem.pages.Homepage;
import thebigword.aem.pages.LoginPage;
import thebigword.aem.pages.sites;
import thebigword.base.Base;

public class Homepagetest extends Base {
	
	LoginPage loginpage;
	Homepage homepage;
	sites site;
	
	public Homepagetest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
	
		initialization();
		 loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateTitleHomepage()
	{
		String hptitle = homepage.validateHomepageTitle();
		System.out.println(hptitle);
		Assert.assertEquals(hptitle,"AEM Start");
	}
	
	@Test(priority=2)
	public sites clickSites() throws InterruptedException
	{
		homepage.clickSites();
	String siteTitle =	homepage.validateSitesPageTitle();
	Thread.sleep(5000);
		
		Assert.assertEquals(siteTitle, "AEM Sites");
		
		
		return new sites();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
