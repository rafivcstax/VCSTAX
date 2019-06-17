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

public class AnnualConfiguration {

	private WebDriver driver;
	private GuiUtility guiUtility;

	public AnnualConfiguration(WebDriver rdriver) {
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);

	}

	private static Logger log = LogManager.getLogger(AnnualConfiguration.class.getName());

	@FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[2]/div/ol/li[1]/a")
	WebElement annualConfigurationlink;

	@FindBy(how = How.XPATH, using = "//div[@url ='#/annualdefault']")
	WebElement annualDefaultlink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/billnumber']")
	WebElement billnumberlink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/commissionrates']")
	WebElement commissionrateslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/distributionmethod']")
	private WebElement distributionmethodlink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/consolidationsheetprtvalues']")
	private WebElement consolidationsheetprtvalueslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/decalnumbers']")
	private WebElement decalnumberslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/districttaxacctxref']")
	private WebElement districttaxacctxreflink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/exemptionamounts']")
	private WebElement exemptionamountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/exemptionexceptions']")
	private WebElement exemptionexceptionslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/mortgageaccounts']")
	private WebElement mortgageaccountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/latefeeamounts']")
	private WebElement latefeeamountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/latefeeinterest']")
	private WebElement latefeeinterestlink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/latefeepenalty']")
	private WebElement latefeepenaltylink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/taxbillspecialexemptionamounts']")
	private WebElement taxbillspecialexemptionamountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/taxbillspecialtaxamounts']")
	private WebElement taxbillspecialtaxamountslink;

	@FindBy(how = How.XPATH, using = ".//div[@url='#/taxaccountrates']")
	private WebElement taxaccountrateslink;

	public void clickannualConfigurationlink() {
		annualConfigurationlink.click();
		log.debug("Clikced on Annual Configuration Link");
		guiUtility.expliciteWait(1000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Annual Configuration", "Annual Configuration - menu name is not matched.");
	}

	public void clickannualDefaultlink() {
		annualDefaultlink.click();
		log.debug("Clikced on Annual Default Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Annual Default", "Annual Default - menu name is not matched.");
	}

	public void clickbillnumblink() {
		billnumberlink.click();
		log.debug("Clikced on Bill Number Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Bill Numbers", "Bill Numbers - menu name is not matched.");
	}

	public void clickcommissionrateslink() {
		commissionrateslink.click();
		log.debug("Clikced on Commission Rates Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Commission Rates", "Commission Rates - menu name is not matched.");
	}

	public void clickdistributionmethodlink() {
		distributionmethodlink.click();
		log.debug("Clikced on Distribution Method Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Distribution Method", "Distribution Method - menu name is not matched.");
	}
	
	public void clickconsolidationsheetprtvalueslink() {
		consolidationsheetprtvalueslink.click();
		log.debug("Clikced on Distribution Method Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Consolidation Sheet PRT Values", "Consolidation Sheet PRT Values - menu name is not matched.");
	}

	public void clickdecalnumberslink() {
		decalnumberslink.click();
		log.debug("Clikced on Decal Numbers Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Decal Numbers", "Decal Numbers - menu name is not matched.");
	}

	public void clickdistricttaxacctxreflink() {
		districttaxacctxreflink.click();
		log.debug("Clikced on District Tax ACCT Xref Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "District Tax ACCT Xref", "District Tax ACCT Xref - menu name is not matched.");
	}

	public void clickexemptionamountslink() {
		exemptionamountslink.click();
		log.debug("Clikced on Exemption Amounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Exemption Amounts", "Exemption Amounts - menu name is not matched.");
	}

	public void clickexemptionexceptionslink() {
		exemptionexceptionslink.click();
		log.debug("Clikced on Exemption Exceptions Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Exemption Exceptions", "Exemption Exceptions- menu name is not matched.");
	}

	public void clickmortgageaccountslink() {
		mortgageaccountslink.click();
		log.debug("Clikced on Mortgage Accounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Mortgage Accounts", "Mortgage Accounts- menu name is not matched.");
	}

	public void clicklatefeeamountslink() {
		latefeeamountslink.click();
		log.debug("Clikced on Late Fee Amounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Late Fee Amounts", "Late Fee Amounts- menu name is not matched.");
	}

	public void clicklatefeeinterestlink() {
		latefeeinterestlink.click();
		log.debug("Clikced on Late Fee Interest Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Late Fee Interest", "Late Fee Interest- menu name is not matched.");
	}

	public void clicklatefeepenaltylink() {
		latefeepenaltylink.click();
		log.debug("Clikced on Late Fee Penalty Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Late Fee Penalty", "Late Fee Penalty- menu name is not matched.");
	}

	public void clicktaxbillspecialexemptionamountslink() {
		taxbillspecialexemptionamountslink.click();
		log.debug("Clikced on Special Exemption Amounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Special Exemption Amounts","Special Exemption Amounts- menu name is not matched.");
	}

	public void clicktaxbillspecialtaxamountslink() {
		taxbillspecialtaxamountslink.click();
		log.debug("Clikced on Special Tax Amounts Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Special Tax Amounts", "Special Tax Amounts- menu name is not matched.");
	}

	public void clicktaxaccountrateslink() {
		taxaccountrateslink.click();
		log.debug("Clikced on Tax Account Rates Link");
		guiUtility.expliciteWait(2000);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'col-sm-offset-1') ]/descendant::li[2]")).getText();
		System.out.println(pageName);
		Assert.assertEquals(pageName, "Tax Account Rates", "Tax Account Rates- menu name is not matched.");
	}

}
