package thebigword.aem.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import thebigword.aem.pages.Homepage;
import thebigword.aem.pages.LoginPage;
import thebigword.aem.pages.ProjectPage;
import thebigword.base.Base;

public class ProjectpageTest extends Base {
	
	LoginPage loginpage;
	Homepage homepage;
	ProjectPage project;
	public ProjectpageTest()
	{
		super();		
	}	
	
	@BeforeMethod()
	public void setUp()
	{
	
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
	@Test
	public void startProjectWorkflow() throws InterruptedException
	{		
		project = new ProjectPage();
		project.clickOnProject();	
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
