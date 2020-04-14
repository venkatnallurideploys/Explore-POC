package Base_classes;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.util.concurrent.Monitor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	public static  AndroidDriver<AndroidElement> capabilities()  throws MalformedURLException
	{
		
		File f = new File("src");
		File fs  = new File(f,"original.apk");
		AndroidDriver<AndroidElement> driver ;
		
		System.out.println("Started Appium");
		// Opening Emulator
		DesiredCapabilities capabilities = new DesiredCapabilities();		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());		
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);		
		return driver;		
		
		
	}
	
	
	
}
