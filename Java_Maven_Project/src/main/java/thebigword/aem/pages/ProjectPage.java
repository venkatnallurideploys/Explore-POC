package thebigword.aem.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import thebigword.base.Base;
import thebigword.util.Testutil;

public class ProjectPage extends Base {
	
	Alert alert;
	////coral-selectlist-item[contains(text(),'test_1430_Manual_arctic_spanish [ES]')]
	
	sites site;
	@FindBy(xpath="//div[contains(text(),'Projects')]")
	WebElement clickOnProjects;
	
	@FindBy(xpath="//coral-card-title[contains(text(),'test_Automation_1248_Nov6')]")
	WebElement selectCreatedProject;
	
	@FindBy(xpath="//img[@class='cq-projects-CardDashboard-image']")
	WebElement selectProject;
	
	@FindBy(css="body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo header.cq-projects-CardDashboard-header:nth-child(1) button.cq-projects-tile-actions.coral3-Button.coral3-Button--secondary > coral-icon.coral3-Icon.coral3-Icon--sizeS.coral3-Icon--accordionDown:nth-child(1)")
	WebElement clickOnTranslationJob;
	
	@FindBy(css="body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo footer.cq-projects-CardDashboard-footer:nth-child(4) a.coral-Button.coral-Button--square.coral-Button--quiet > i.coral-Icon.coral-Icon--more")
	WebElement clickTranslationJobElipses4; 
	
	@FindBy(css="body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(2) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo footer.cq-projects-CardDashboard-footer:nth-child(4) > a.coral3-Button.coral3-Button--quiet")
	WebElement clickTranslationJobElipses5;
	
	@FindBy(linkText="Request Scope")
	WebElement clickRequestScope;
	
	@FindBy(xpath="//table[@class='cq-projects-translation-job-table']/tbody/tr[1]/td[2]")
	WebElement status;
	
	@FindBy(linkText="Start")
	WebElement clickStart;
	
	@FindBy(linkText="Complete")
	WebElement selectComplete;
	
	
	@FindBy(css="body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(1) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo footer.cq-projects-CardDashboard-footer > a.coral3-Button.coral3-Button--quiet")
	WebElement clickonSummary;
	
	@FindBy(xpath="//coral-tab-label[contains(text(),'Advanced')]")
	WebElement clickOnAdvanced;
		
	@FindBy(xpath="//coral-button-label[contains(text(),'Save & Close')]")
	WebElement clickOnsaveandclose;
	
	@FindBy(xpath="//coral-icon[@class='foundation-collection-item-thumbnail coral3-Icon coral3-Icon--folder coral3-Icon--sizeS']")
	WebElement CheckthePage;
	
	@FindBy(id="cq-project-translation-job-preview-sites-translation-button")
	WebElement clickOnPreview;
	
	@FindBy(xpath="//coral-button-label[contains(text(),'Preview')]")
	WebElement previewPage;
	
	@FindBy(xpath="//input[@id='coral-id-17']")
	WebElement checkAllPages_v4;
	
	@FindBy(xpath="//th[1]//coral-table-headercell-content[1]") //
	WebElement checkAllPages_v5;
	
	@FindBy(xpath="//coral-actionbar-item[5]//button[1]")  ////coral-actionbar-item[5]//button[1]
	WebElement clickAcceptTranslation;
	
	@FindBy(xpath="//coral-dialog[11]//button[2]") ////coral-dialog[11]//button[2]//coral-button-label[1]
	WebElement clickAcceptbutton;
	
	@FindBy(xpath="//span[@class='betty-breadcrumbs-button-innerwrapper']")
	WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//coral-selectlist-item[contains(text(),'Projects')]")
	WebElement clickProjects;
	
	@FindBy(xpath="//coral-checkbox[@name='translationAutomaticApproveEnable']/input")
	WebElement uncheckAutomaticApprove;
	
	@FindBy(xpath="//input[@id='coral-id-138']")
	WebElement UncheckPromotion;
	
	void checkStatus() throws InterruptedException
	{
			String jobstatus = status.getText();		
			if(jobstatus.contains("Draft"))					
			{
				clickOnTranslationJob.click();
			clickRequestScope.click();
			Thread.sleep(10000);
			driver.navigate().refresh();
			
			}			
			String jobstatus1 = status.getText();			
			while(jobstatus1.contains("Draft"))
			{
				Thread.sleep(10000);
				driver.navigate().refresh();
				jobstatus1 = status.getText();				
				if(jobstatus1.contains("Scope Requested"))				
					break;
				
			}
			
			String jobstatus6=status.getText();
			while(jobstatus6.contains("submitted"))
			{
				Thread.sleep(10000);
				driver.navigate().refresh();
				if(jobstatus6.contains("Scope Requested"))
					break;
			}
			
			String jobstatus2 = status.getText();
			
			while(jobstatus2.contains("Scope Requested"))
			{	
				
				driver.navigate().refresh();
				Thread.sleep(10000);				
				jobstatus2 = status.getText();
				if (jobstatus2.contains("Scope Completed"))
				break;
			}
			String jobstatus5= status.getText();
			while(jobstatus5.contains("Scope Completed"))
			{
				clickOnTranslationJob.click();
					Thread.sleep(3000);
					clickStart.click();
					driver.navigate().refresh();
					startedWorkflow();
					break;
				}
			}
		
	public void startedWorkflow() throws InterruptedException
	{
		String jobstatus3 = status.getText();
		
		while(!jobstatus3.contains("Ready for review"))
		{
			Thread.sleep(5000);
			driver.navigate().refresh();
			jobstatus3 = status.getText();
			System.out.println("Current status is "+jobstatus3);
			if(jobstatus3.contains("Ready for review"))
				break;
		}		
		System.out.print("Workflow completed and available for Reviewer with status"+jobstatus3);
	
		
		
		
	}
	
	public void AcceptTranslation() throws InterruptedException
	{
		clickTranslationJobElipses5.click();
		String Mainwindow = driver.getWindowHandle();
		CheckthePage.click();
		Thread.sleep(1000);
		clickOnPreview.click();
		Thread.sleep(10000);
		
		/*if (previewPage.getText().contains("Preview"))
				{*/
			String newwindow = driver.getWindowHandle();
			System.out.println("User is in Preview Page "+newwindow.toString());			
				
		driver.switchTo().window(Mainwindow);
		Thread.sleep(3000);
		checkAllPages_v5.click();
		Thread.sleep(3000);
		clickAcceptTranslation.click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		clickAcceptbutton.click();
		Thread.sleep(15000);
		selectProjectsDropdown.click();
		Thread.sleep(2000);
		clickProjects.click();
		Thread.sleep(2000);
		selectCreatedProject.click();
		Thread.sleep(2000);
		selectProject.click();
		Thread.sleep(2000);
		
	}
	
	public void completeWorkflow() throws InterruptedException
	{
		/*selectProjectsDropdown.click();
		Thread.sleep(1000);
		clickProjects.click();
		Thread.sleep(2000);
		selectCreatedProject.click();
		Thread.sleep(2000);
		selectProject.click();
		Thread.sleep(2000);*/
		String jobstatus16 = status.getText(); 
		while(!jobstatus16.contains("Approve"))
		{
			
			driver.navigate().refresh();
			Thread.sleep(5000);
			jobstatus16 = status.getText(); 
			if(jobstatus16.contains("Approve"))
				break;
		}
		
		String jobstatus9 = status.getText();
		if(!jobstatus9.contains("Complete"))
		{
			
			clickOnTranslationJob.click();
			selectComplete.click();
			Thread.sleep(5000);
			driver.navigate().refresh();
			jobstatus9 = status.getText();
			while(!jobstatus9.contains("Complete"))
			{
				driver.navigate().refresh();
				Thread.sleep(5000);
				jobstatus9 = status.getText();
				if(jobstatus9.contains("Complete"))
					break;
			}			
		}
		System.out.println("Project is Completed and in "+jobstatus9+"state");
		
	}
	
	
	//Actions 
	public ProjectPage()
	{
		PageFactory.initElements(driver,this);	
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public void uncheckAutoReview() throws InterruptedException
	{
		clickonSummary.click();
		Thread.sleep(3000);
		clickOnAdvanced.click();
		Thread.sleep(3000);
		//UncheckAutomaticallyApproveTranslations.click();
		//Thread.sleep(3000);
		//UncheckPromotion.click();
		if(uncheckAutomaticApprove.isSelected())
		{
			uncheckAutomaticApprove.click();
		}else 
		{
			System.out.println("already de-selected");
		}	
		
		
		/*if(UncheckPromotion.isSelected())
		{
			UncheckPromotion.click();
		}else 
		{
			System.out.println("already de-selected");
		}*/
		clickOnsaveandclose.click();
		Thread.sleep(3000);
		
	}
	
	public void clickOnProject() throws InterruptedException
	{
		clickOnProjects.click();
		Thread.sleep(5000);
		selectCreatedProject.click();
		Thread.sleep(3000);
		selectProject.click();
		Thread.sleep(5000);
		uncheckAutoReview();	
		checkStatus();
		Thread.sleep(5000);
		AcceptTranslation();
		completeWorkflow();
		
	}
}
