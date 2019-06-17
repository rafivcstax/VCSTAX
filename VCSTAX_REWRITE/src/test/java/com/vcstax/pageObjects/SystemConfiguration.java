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

public class SystemConfiguration {

	private WebDriver driver;
	private GuiUtility guiUtility;

	public SystemConfiguration(WebDriver rdriver) {
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);

	}

	private static Logger log = LogManager.getLogger(SystemConfiguration.class.getName());

	@FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[2]/div/ol/li[1]/a")
	WebElement systemconfigurationlink;

	@FindBy(how = How.XPATH, using = ".//div[@url ='#/batchtypes']")
	WebElement batchtypeslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/batchofficers']")
	WebElement batchofficerslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/countymaster']")
	WebElement countymasterlink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/disbursementaccounts']")
	private WebElement disbursementaccountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/districtpropertytypexref']")
	private WebElement districtpropertytypexreflink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/districts']")
	private WebElement districtslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/exemptions']")
	private WebElement exemptionslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/propertystrata']")
	private WebElement propertystratalink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/propertytypes']")
	private WebElement propertytypeslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/registers']")
	private WebElement registerslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/tablessetup']")
	private WebElement tablessetuplink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/taxaccounts']")
	private WebElement taxaccountslink;

	
	public void clicksystemconfigurationlink() {
		systemconfigurationlink.click();
		log.debug("Clikced on System Configuration Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "System Configuration", "System Configuration - menu name is not matched.");
	}

	public void clickbatchtypeslink() {
		batchtypeslink.click();
		log.debug("Clikced on Batch Types Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Batch Types", "Batch Types - menu name is not matched.");
	}

	public void clickbatchofficerslink() {
		batchofficerslink.click();
		log.debug("Clikced on Batch Officers Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Batch Officers", "Batch Officers - menu name is not matched.");
	}

	public void clickcountymasterlink() {
		countymasterlink.click();
		log.debug("Clikced on County Master Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "County Master", "County Master - menu name is not matched.");
	}

	public void clickdisbursementaccountslink() {
		disbursementaccountslink.click();
		log.debug("Clikced on Disburse Accounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Disburse Accounts", "Disburse Accounts - menu name is not matched.");
	}
	
	public void clickdistrictpropertytypexreflink() {
		districtpropertytypexreflink.click();
		log.debug("Clikced on District / Property Type Cross-reference Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "District To Property Type XREF", "District / Property Type Cross-reference - menu name is not matched.");
	}
	
	public void clickexemptionslink() {
		exemptionslink.click();
		log.debug("Clikced on Exemptions Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Exemptions", "Exemptions - menu name is not matched.");
	}
	
	public void clickdistrictslink() {
		districtslink.click();
		log.debug("Clikced on Disburse Accounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Districts", "Disburse Accounts - menu name is not matched.");
	}

	public void clickpropertystratalink() {
		propertystratalink.click();
		log.debug("Clikced on Property Strata");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Property Strata", "Property Strata - menu name is not matched.");
	}

	public void clickpropertytypeslink() {
		propertytypeslink.click();
		log.debug("Clikced on Property Types Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Property Types", "Property Types - menu name is not matched.");
	}

	public void clickregisterslink() {
		registerslink.click();
		log.debug("Clikced on Registers Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Registers", "Registers - menu name is not matched.");
	}

	public void clicktablessetuplink() {
		tablessetuplink.click();
		log.debug("Clikced on Tables Setup Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Tables Setup", "Tables Setup- menu name is not matched.");
	}

	public void clicktaxaccountslink() {
		taxaccountslink.click();
		log.debug("Clikced on Tax Accounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Tax Accounts", "Tax Accounts- menu name is not matched.");
	}

}
