package Base_classes;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {
	
	


	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub		
		AndroidDriver<AndroidElement> driver = capabilities();	
		System.out.println("click on elements");
		
		try {
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el = (MobileElement) driver.findElementByAccessibilityId("Preference");
		el.click();
		System.out.println("Successfully clicked on Preference");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='4. Default values']");
		el2.click();
		
		System.out.println("Clicked on Default values");		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el3 = driver.findElementByClassName("android.widget.CheckBox");
		el3.click();
		System.out.println("Checked the checkbox");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		System.out.println("Popup should be opened");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/edit").clear();		
		driver.findElementById("android:id/edit").sendKeys("Dog");
		System.out.println("Data Entered");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();
		System.out.println("Clicked on OK");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath(("//android.widget.TextView[@text='List preference']")).click();
		System.out.println("Clicked on 3rd option");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		if(driver.findElementByXPath("//android.widget.CheckedTextView[@text='Charlie Option 03']").isSelected())
		{
			System.out.println("Already selected");
		}else
		{
			driver.findElementByXPath("//android.widget.CheckedTextView[@text='Charlie Option 03']").click();
			System.out.println("Charlie Option 03 is selected");
		}
			
		
		driver.navigate().back();		
		System.out.println("came back to preferences menu");
		driver.navigate().back();
		System.out.println("came back to home page");
		
		
		
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
