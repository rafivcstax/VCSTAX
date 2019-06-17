package com.vcstax.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vcstax.utilities.GuiUtility;

public class SettingsTab {

	private WebDriver driver;
	private GuiUtility guiUtility;

	// Creating constructor	
	public SettingsTab(WebDriver rdriver)

	{
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);
	}

	private static Logger log = LogManager.getLogger(SettingsTab.class);
	
	

	@FindBy(how = How.XPATH, using = "//span[text()='Settings']")
	WebElement settingsTab;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1']")
	WebElement activityTable;

	@FindBy(how = How.XPATH, using = ".//a[@href='#/annualconfiguration']")
	WebElement annualConfigurationlink;

	@FindBy(how = How.XPATH, using = ".//a[@href='#/systemconfiguration']")
	WebElement systemConfigurationlink;

	@FindBy(how = How.XPATH, using = ".//a[@href='#/texteditor']")
	WebElement textEditorlink;

	@FindBy(how = How.XPATH, using = ".//a[@href='#/userroles']")
	WebElement rolesManagerlink;

	@FindBy(how = How.XPATH, using = ".//a[@href='#/useraccounts']")
	WebElement userAccountsManagerlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'ProductInformation')]")
	WebElement productInformationlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'ReleaseNotes')]")
	WebElement releaseNoteslink;

	public void clicksettingsTab() {
		settingsTab.click();
		log.debug("Clicked on Settings Tab");
		guiUtility.expliciteWait(500);
		
	}

	public void clickannualConfigurationlink() {
		annualConfigurationlink.click();
		log.debug("Clicked on Annual Configuration Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Annual Configuration", "Annual Configuration - menu name is not matched.");
		
	}

	public void clicksystemConfigurationlink() {
		systemConfigurationlink.click();
		log.debug("Clicked on System Configuration Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "System Configuration", "System Configuration - menu name is not matched.");
	}

	public void clicktextEditorlink() {
		textEditorlink.click();
		log.debug("Clicked on Text Editor Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Text Editor", "Text Editor - menu name is not matched.");
	}

	public void clickrolesManagerlink() {
		rolesManagerlink.click();
		log.debug("Clicked on Roles Manager Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Roles Manager", "Roles Manager - menu name is not matched.");
	}

	public void clickuserAccountsManagerlink() {
		userAccountsManagerlink.click();
		log.debug("Clicked on User Accounts Manager Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "User Accounts Manager", "User Accounts Manager - menu name is not matched.");
	}

	public void clickproductInformationlink() {
		productInformationlink.click();
		log.debug("Clicked on Product Information Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Product Information", "Product Information - menu name is not matched.");
	}

	public void clickreleaseNoteslink() {
		releaseNoteslink.click();
		log.debug("Clicked on Release Notes Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Release Notes", "Release Notes - menu name is not matched.");
	}
	
	
	/*
	 * public void activityTable(){
	 * 
	 * int Noofrows = activityTable.findElements(By.tagName("a")).size();
	 * 
	 * System.out.println(Noofrows); for (int i = 0; i <= Noofrows - 1; i++) {
	 * activityTable.findElements(By.tagName("a")).get(i).click();
	 * System.out.println("Link : " + ldriver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div/div/div/nav/div/div[2]/span")).getText() +
	 * " - has Open");
	 * ldriver.findElement(By.xpath("//span[text()='Activities']")).click();
	 * //at.clickActivityTab();
	 * 
	 * //String fileName = ldriver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div/div/div/nav/div/div[2]/span")).getText();
	 * //guiUtility.takeScreenShot(fileName);
	 * 
	 * }
	 * 
	 * }
	 */

}