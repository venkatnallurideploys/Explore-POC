package thebigword.aem.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import thebigword.aem.pages.Homepage;
import thebigword.aem.pages.LoginPage;
import thebigword.base.Base;

public class Loginpagetest extends Base{
	
	LoginPage loginpage;
	Homepage homepage;
	ExtentTest logger;
	public Loginpagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
	
		initialization();
		startReport();
		 loginpage = new LoginPage();
		 
	}

	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String pagetitle = loginpage.validateLoginPageTitle();
		System.out.println(pagetitle);
		Assert.assertEquals(pagetitle, "AEM Sign In");
	}
	
	@Test(priority=2)
	
	public void loginPageLogoverificationTest()
	{
		boolean flag = loginpage.imgverification();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void validateLogin()
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String homepagetitle = loginpage.validateHomepageTitle();
		Assert.assertEquals(homepagetitle, "AEM Start");
	}
	
	@AfterMethod	
	public void getResult(ITestResult result){
		 if(result.getStatus() == ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 }else if(result.getStatus() == ITestResult.SKIP){
		 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		 }
		 // ending test
		 //endTest(logger) : It ends the current test and prepares to create HTML report
		 extent.endTest(logger);
		 driver.quit();
		 }
		 @AfterTest
		 public void endReport(){
		 // writing everything to document
		 //flush() - to write or update test information to your report. 
		                extent.flush();
		                //Call close() at the very end of your session to clear all resources. 
		                //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
		                //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
		                //Once this method is called, calling any Extent method will throw an error.
		                //close() - To close all the operation
		                extent.close();
		    }
		 @Test
		 public void passTest(){
		 //extent.startTest("TestCaseName", "Description")
		 //TestCaseName – Name of the test
		 //Description – Description of the test
		 //Starting test
		 logger = extent.startTest("passTest");
		 Assert.assertTrue(true);
		 //To generate the log when the test case is passed
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		 }
		 
		 @Test
		 public void failTest(){
		 logger = extent.startTest("failTest");
		 Assert.assertTrue(false);
		 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		 }
		 
		 @Test
		 public void skipTest(){
		 logger = extent.startTest("skipTest");
		 throw new SkipException("Skipping - This is not ready for testing ");
		 }
		 
		}