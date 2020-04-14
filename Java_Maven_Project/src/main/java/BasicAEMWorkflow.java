import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAEMWorkflow {
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://localhost:4502/libs/granite/core/content/login.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='submit-button']")).click();
		driver.findElement(By.xpath("//*[@id='globalnav-start-home-collection']/coral-masonry-item[1]/div")).click();

		WebElement element = driver.findElement(By.xpath("//*[@id='granite-shell-actionbar']/betty-titlebar-secondary/button[3]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	
		WebElement element1 = driver.findElement(By.xpath("/html/body/coral-shell/coral-shell-content/div/div[1]/betty-titlebar/betty-titlebar-secondary/coral-popover/div[3]/coral-popover-content/coral-anchorlist/a[1]"));
		executor.executeScript("arguments[0].click();", element1);
		
		driver.findElement(By.xpath("//*[@id='coral-id-12']/coral-panel[1]/coral-panel-content/div/div/coral-masonry/coral-masonry-item[2]/coral-card/coral-card-asset/img")).click();
		driver.findElement(By.xpath("//*[@id='coral-id-11']/coral-panel[1]/coral-panel-content/div/button")).click();
		driver.findElement(By.xpath("//*[@id='coral-id-18']")).sendKeys("Test_Proj_2210");
		driver.findElement(By.xpath("//*[@id='coral-id-17']/coral-tab-label")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id='coral-id-46']/coral-icon"));
		executor.executeScript("arguments[0].click();", element2);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//coral-selectlist[@id='coral-id-47']/child::coral-selectlist-item[23]")).click();
		driver.findElement(By.xpath("//*[@id='coral-id-220']/coral-panel-content/div/div[2]/div[3]/section/div/foundation-autocomplete/div/div/span/button")).click();
		driver.findElement(By.xpath("//*[@id='wcm-ui-cloudconfig-picker-collection']/coral-columnview-column/coral-columnview-column-content/coral-columnview-item[1]/coral-columnview-item-thumbnail")).click();
		driver.findElement(By.xpath("/html/body/coral-dialog/div[2]/coral-dialog-content/form/div[1]/div/div[2]/button[2]")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id='coral-id-50']/coral-icon"));
		executor.executeScript("arguments[0].click();", element3);
		
		driver.findElement(By.xpath("//*[@id='coral-id-51']/coral-selectlist-item[2]")).click();
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id='coral-id-65']"));
		executor.executeScript("arguments[0].click();", element4);
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id='coral-id-67']"));
		executor.executeScript("arguments[0].click();", element5);
		
		WebElement element6 = driver.findElement(By.xpath("//*[@id='coral-id-11']/coral-panel[2]/coral-panel-content/div/button[2]"));
		executor.executeScript("arguments[0].click();", element6);
		
		WebElement element7 = driver.findElement(By.xpath("/html/body/coral-dialog/div[2]/coral-dialog-footer/button[2]"));
		executor.executeScript("arguments[0].click();", element7);
		
		WebElement element8 = driver.findElement(By.cssSelector("body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo footer.cq-projects-CardDashboard-footer:nth-child(4) a.coral3-Button.coral3-Button--quiet > coral-icon.coral3-Icon.coral3-Icon--more.coral3-Icon--sizeS:nth-child(1)"));
		executor.executeScript("arguments[0].click();", element8);
		
		WebElement element9 = driver.findElement((By.xpath("//coral-button-label[contains(text(),'Add')]")));
		executor.executeScript("arguments[0].click();", element9);
		
		WebElement element10 = driver.findElement((By.xpath("//coral-shell-content//a[1]")));
		executor.executeScript("arguments[0].click();", element10);
		
		WebElement element11= driver.findElement((By.xpath("//coral-columnview-item[7]")));
		executor.executeScript("arguments[0].click();", element11);
		
		WebElement element12 = driver.findElement((By.xpath("//coral-columnview-column[2]//coral-columnview-column-content[1]//coral-columnview-item[1]")));
		executor.executeScript("arguments[0].click();", element12);
		
		WebElement element13 =driver.findElement((By.xpath("//coral-columnview-column[3]//coral-columnview-column-content[1]//coral-columnview-item[1]")));
		executor.executeScript("arguments[0].click();", element13);
		
		WebElement element14 = driver.findElement((By.xpath("//coral-columnview-column[4]//coral-columnview-column-content[1]//coral-columnview-item[1]")));
		executor.executeScript("arguments[0].click();", element14);
		
		WebElement element15 = driver.findElement((By.xpath("//coral-columnview-column[5]//coral-columnview-column-content[1]//coral-columnview-item[3]//coral-columnview-item-thumbnail[1]")));
		executor.executeScript("arguments[0].click();", element15);
		
		WebElement element16 = driver.findElement((By.xpath("//button[@class='granite-pickerdialog-submit coral3-Button coral3-Button--primary']")));
		executor.executeScript("arguments[0].click();", element16);
		
		WebElement element17 = driver.findElement((By.xpath("//button[@id='cq-project-translation-target-warning-language-copy-button']")));
		executor.executeScript("arguments[0].click();", element17);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='coral-id-21']")).click();
		
		WebElement element18 = driver.findElement(By.xpath("/html[1]/body[1]/coral-shell[1]/coral-shell-content[1]/div[1]/div[2]/div[1]/div[2]/table[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/coral-icon[1]"));
		executor.executeScript("arguments[0].click();", element18);
		
		driver.findElement(By.xpath("//button[@id='delete-translation-object-action']")).click();
		driver.findElement(By.xpath("//button[@class='deleteTranslationObject coral3-Button coral3-Button--warning']")).click();
		driver.findElement(By.cssSelector("body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(14) div.foundation-layout-panel div.foundation-layout-panel-header betty-titlebar.foundation-collection-actionbar betty-titlebar-title:nth-child(1) betty-breadcrumbs.granite-collection-navigator button.coral3-Button.coral3-Button--quiet.betty-breadcrumbs-button:nth-child(1) coral-button-label:nth-child(1) > span.betty-breadcrumbs-button-innerwrapper")).click();
		driver.findElement(By.xpath("//coral-selectlist-item[contains(text(),'Projects')]")).click();
		driver.findElement(By.xpath("//coral-card-title[contains(text(),'Test_Proj_2210')]")).click();
		driver.findElement(By.cssSelector("body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo header.cq-projects-CardDashboard-header:nth-child(1) button.cq-projects-tile-actions.coral3-Button.coral3-Button--secondary > coral-icon.coral3-Icon.coral3-Icon--sizeS.coral3-Icon--accordionDown:nth-child(1)")).click();
		driver.findElement(By.xpath("//a[@class='translation-pod-action coral--light cq-translation-pod-action-scope-request']")).click();
		
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		
	

		
		/*Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();*/
		
		/*String var = driver.findElement(By.xpath("//table[@class='cq-projects-translation-job-table']/tbody/tr[1]/td[2]")).getText();
		System.out.println(var);*/
		
		/* FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		 wait.pollingEvery(10, TimeUnit.SECONDS);
		 wait.withTimeout(1000, TimeUnit.SECONDS);*/
		 
		WebDriverWait wait = new WebDriverWait(driver, 500);
		WebElement element19 = driver.findElement(By.xpath("//table[@class='cq-projects-translation-job-table']/tbody/tr[1]/td[2]"));
		System.out.println(element19.getTagName());
		
		String var = driver.findElement(By.xpath("//table[@class='cq-projects-translation-job-table']/tbody/tr[1]/td[2]")).getText();
		
		if(var.equalsIgnoreCase("draft")){
			driver.navigate().refresh();
			String var1 = driver.findElement(By.xpath("//table[@class='cq-projects-translation-job-table']/tbody/tr[1]/td[2]")).getText();
			
			if(!var1.equalsIgnoreCase("Scope Requested")){
				driver.navigate().refresh();
				
				}
			else{
				wait.until(ExpectedConditions.textToBePresentInElement(element19, "Scope Completed"));
				System.out.println("completed");
				
			}	
		}else{
		//wait.pollingEvery(10, TimeUnit.SECONDS);
		//wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element19, "Scope Completed"));
		System.out.println("completed1");
		}
		driver.findElement(By.cssSelector("body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo header.cq-projects-CardDashboard-header:nth-child(1) button.cq-projects-tile-actions.coral3-Button.coral3-Button--secondary > coral-icon.coral3-Icon.coral3-Icon--sizeS.coral3-Icon--accordionDown:nth-child(1)")).click();
		
	}
	
	}	

