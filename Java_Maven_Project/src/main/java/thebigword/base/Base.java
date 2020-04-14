package thebigword.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;

import thebigword.util.Testutil;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Base {
	
	public static WebDriver driver;

	public static Properties prop;
	
	public ExtentReports extent;
	
	
	public Base()
	{
	
	try {
		
		prop = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/thebigword/config/config.properties");
	prop.load(ip);		
		
	} catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver_79\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("urlversion_6.5"));			
		}
}
	
	public void startReport(){
		 //ExtentReports(String filePath,Boolean replaceExisting) 
		 //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
		 //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
		 //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
		 //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
		 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
		 //extent.addSystemInfo("Environment","Environment Name")
		 extent
		                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
		                .addSystemInfo("Environment", "Automation Testing")
		                .addSystemInfo("User Name", "Rajkumar SM");
		                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
		                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
		                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		 }
	
	
	public void takeSnapshotifFailed() throws IOException
	{
		//Convert web driver object to TakeScreenshot
		
		//String snapshotfilepath = "E:\\snapshots\\failedtest.jpg";
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

               // File DestFile=new File(snapshotfilepath);

                //Copy file at destination
try {
     FileUtils.copyFile(SrcFile, new File("E:\\snapshots"+"Failedsnapshot_"+this.getClass().getName()+"_"+".jpg"));          

    }catch (Exception e) {    	
    e.printStackTrace();
    }
		// TODO: handle exception
	}	
}