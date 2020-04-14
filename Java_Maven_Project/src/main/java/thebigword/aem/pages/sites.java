package thebigword.aem.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import thebigword.base.Base;
import thebigword.util.Testutil;

public class sites extends Base {	 
		JavascriptExecutor executor = (JavascriptExecutor)driver;		 
		Select select;
		Actions action;		
		String ProjectName = "test_Automation_1248_Nov6";	//Project Name
	@FindBy(xpath="//div[contains(text(),'we-retail')]")
	WebElement selectedWeRetail;	
	@FindBy(xpath="//coral-columnview-column[2]//coral-columnview-column-content[1]//coral-columnview-item[1]")
	WebElement selectedLanguageMasters;	
	@FindBy(xpath="//coral-columnview-column[3]//coral-columnview-column-content[1]//coral-columnview-item[1]")
	WebElement selectedEnglish;	
	@FindBy(xpath="//coral-columnview-column[4]//coral-columnview-column-content[1]//coral-columnview-item[1]")
	WebElement selectedExperience;	
	@FindBy(xpath="//coral-columnview-column[4]//coral-columnview-column-content[1]//coral-columnview-item[2]")
	WebElement selectMen;	
	@FindBy(xpath="//coral-columnview-column[4]//coral-columnview-column-content[1]//coral-columnview-item[2]//coral-columnview-item-thumbnail[1]")
	WebElement selectMenThumbnail;	
	
	//Templates
	@FindBy(xpath="//coral-columnview-column[5]//coral-columnview-column-content[1]//coral-columnview-item[2]//coral-columnview-item-thumbnail[1]")
	WebElement selectAnyTemplate;	
	//Templates
	@FindBy(xpath="//button[@id='coral-id-1']//coral-icon[@class='coral3-Icon coral3-CycleButton-openIcon coral3-Icon--chevronDown coral3-Icon--sizeXS']")
	WebElement selectDropdown;	
	@FindBy(xpath="//coral-selectlist-item[contains(text(),'References')]")
	WebElement clickReferences;	
	@FindBy(partialLinkText="Language Copies")
	WebElement clickLanguagecopiesAndSelectLanguage;
	@FindBy(xpath="//coral-accordion-item-label[contains(text(),'Create & Translate')]")
	WebElement clickOnCreateAndTranslate;	
	@FindBy(xpath="//span[contains(text(),'Select languages')]")
	WebElement selectRequiredLanguages;	
	@FindBy(xpath="//section[@class='languageCopy granite-references-item']//div[@class='info']")	
	WebElement selectLanguageCopy;
	@FindBy(id="coral-id-25")
	WebElement clickOnLanguage;		
	//Language Selection
	@FindBy(xpath="//coral-selectlist-item[contains(text(),'German')]")
	WebElement selectLanguage;
	//Language Selection
	@FindBy(name="projectTitle")
	WebElement provideProjectName;
	@FindBy(xpath="//button[@data-role='submit']")
	WebElement clickCreateProjectButton;
	@FindBy(id="coral-id-140")
	WebElement UncheckAutomaticallyApproveTranslations;	
	@FindBy(id="coral-id-138")
	WebElement UncheckPromotion;	
	@FindBy(xpath="//div[contains(text(),'Projects')]")
	WebElement clickOnProjects;	
	@FindBy(xpath="//coral-card-title[contains(text(),'test_Automation_1248_Nov6')]")
	WebElement selectCreatedProject;	
	@FindBy(xpath="//img[@class='cq-projects-CardDashboard-image']")
	WebElement selectProject;	
	@FindBy(xpath="//span[contains(text(),'(escape)')]")
	WebElement closeMenu;	
	@FindBy(xpath="//coral-shell-homeanchor-label[contains(text(),'Adobe Experience Manager')]")
	WebElement homebutton;
	@FindBy(xpath="//*[@id='coral-id-25']/span")
	WebElement test;
	@FindBy(css="body.coral--light.shell-collectionpage-view:nth-child(2) coral-shell.coral3-Shell:nth-child(1) div.foundation-layout-panel div.foundation-layout-panel-bodywrapper div.foundation-layout-panel-body div.foundation-layout-panel-content.foundation-collection-content coral-masonry.cq-projects-admin-details.foundation-collection.foundation-layout-masonry.coral3-Masonry.is-loaded coral-masonry-item.coral3-Masonry-item.is-managed:nth-child(1) div.cq-projects-CardDashboard.cq-projects-Pod.cq-projects-CardDashboard-AppDetails.cq-projects-Pod-projectInfo footer.cq-projects-CardDashboard-footer > a.coral3-Button.coral3-Button--quiet")
	WebElement clickonSummary;
	
	public sites()
	{
		PageFactory.initElements(driver,this);		
	}
	
	//Actions
	public void CreateProject() throws InterruptedException
	{
		executor.executeScript("arguments[0].click();",selectedWeRetail);
		selectedLanguageMasters.click();
		selectedEnglish.click();
		
		selectedExperience.click();
		selectAnyTemplate.click();
		//selectMen.click();
		//selectMenThumbnail.click();
		Thread.sleep(3000);
		selectDropdown.click();
		clickReferences.click();
		clickLanguagecopiesAndSelectLanguage.click();
		clickOnCreateAndTranslate.click();
		Thread.sleep(5000);
		clickOnLanguage.click();		
		action = new Actions(driver);	
		//action.click(clickOnLanguage).build().perform();*/		
		action.click(selectLanguage).build().perform();
		//driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);		
		Thread.sleep(5000);
		provideProjectName.sendKeys(ProjectName);
		clickCreateProjectButton.click();
			Thread.sleep(5000);
		closeMenu.click();
		Thread.sleep(2000);
		homebutton.click();
		Thread.sleep(4000);		
		clickOnProjects.click();
		Thread.sleep(15000);
		selectCreatedProject.click();
		Thread.sleep(2000);
		selectProject.click();
		Thread.sleep(2000);
				
	}
}
