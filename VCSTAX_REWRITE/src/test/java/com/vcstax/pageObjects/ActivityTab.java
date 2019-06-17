package com.vcstax.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vcstax.utilities.GuiUtility;

public class ActivityTab {

	private WebDriver driver;
	private GuiUtility guiUtility;

	public ActivityTab(WebDriver rdriver)

	{
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);
	}

	private static Logger log = LogManager.getLogger(ActivityTab.class);

	@FindBy(how = How.XPATH, using = "//span[text()='Activities']")
	WebElement activitylink;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1\']/li[1]/a[1]")
	WebElement collectionslink;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1\']/li[1]/a[2]")
	WebElement assessorChangeOrderslink;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1\']/li[1]/a[3]")
	WebElement calculateRevenueDisbursementlink;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1\']/li[1]/a[4]")
	WebElement mailProcessinglink;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1\']/li[1]/a[5]")
	WebElement registerReconciliationlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[3]/a[1]")
	WebElement applyLateFeelink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[3]/a[2]")
	WebElement bankruptcyCaseslink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[3]/a[3]")
	WebElement delinquentProcessinglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[3]/a[4]")
	WebElement quarterlyBillinglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[1]")
	WebElement mobileHomeDigestlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[2]")
	WebElement mortgageManualProcessinglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[3]")
	WebElement mortgagePaymentProcessinglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[4]")
	WebElement mortgageRequestProcessinglink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[5]")
	WebElement mortgageTaxBillExportlink;

	@FindBy(how = How.XPATH, using = "//*[@id=\"megamenu1\"]/li[4]/a[6]")
	WebElement realDigestlink;

	public void clickActivityTab() {

		activitylink.click();
		log.debug("Clicked on Activity Tab");
		guiUtility.expliciteWait(500);
	}

	public void clickCollectionLink() {
		collectionslink.click();
		log.debug("Clicked on collections Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Collections", "Collections - menu name is not matched.");

	}

	public void clickAssessorChangeOrders() {
		assessorChangeOrderslink.click();
		log.debug("Clicked on Accessor Change Order Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Assessor Change Orders", "Assessor Change Orders - menu name is not matched.");
	}

	public void clickcalculateRevenueDisbursementlink() {
		calculateRevenueDisbursementlink.click();
		log.debug("Clicked on Calculate Revenue Disbursement Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Calculate Revenue Disbursement", "Calculate Revenue Disbursement - menu name is not matched.");
	}

	public void clickMailProcessinglink() {
		mailProcessinglink.click();
		log.debug("Clicked on Mail Processing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mail Process", "Mail Processing - menu name is not matched.");
	}

	public void clickregisterReconciliationlink() {
		registerReconciliationlink.click();
		log.debug("Clicked on Register Reconciliation Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Register Reconciliation", "Register Reconciliation - menu name is not matched.");
	}

	public void applyLateFeelink() {
		applyLateFeelink.click();
		log.debug("Clicked on Apply LateFee Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Apply Late Fee", "Apply Late Fee - menu name is not matched.");
	}

	public void bankruptcyCaseslink() {
		bankruptcyCaseslink.click();
		log.debug("Clicked on Bankruptcy Cases Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Bankruptcy Cases", "Bankruptcy Cases - menu name is not matched.");
	}

	public void delinquentProcessinglink() {
		delinquentProcessinglink.click();
		log.debug("Clicked on Delinquent Processing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Delinquent Processing", "Delinquent Processing - menu name is not matched.");
	}

	public void quarterlyBillinglink() {
		quarterlyBillinglink.click();
		log.debug("Clicked on Quarterly Billing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Quarterly Billing", "Quarterly Billing - menu name is not matched.");
	}

	public void mobileHomeDigestlink() {
		mobileHomeDigestlink.click();
		log.debug("Clicked on Mobile Home Digest Link");
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu')]/descendant::div[@class='selected-menu-item']")).getText();
		guiUtility.expliciteWait(500);
		Assert.assertEquals(pageName, "Mobile Home Digest", "Mobile Home Digest - menu name is not matched.");
	}

	public void mortgageManualProcessinglink() {
		mortgageManualProcessinglink.click();
		log.debug("Clicked on Mortgage Manual Processing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu')]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mortgage Manual Processing", "Mortgage Manual Processing - menu name is not matched.");
	}

	public void mortgagePaymentProcessinglink() {
		mortgagePaymentProcessinglink.click();
		log.debug("Clicked on Mortgage Payment Processing Link");
		guiUtility.expliciteWait(500);
		Select s = new Select(driver.findElement(By.xpath("//*[@id='registerNoField']")));
		s.selectByIndex(4);
		driver.findElement(By.xpath("//*[@id='openRegisterbtn']")).click(); 
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu')]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mortgage Payment Processing", "Mortgage Payment Processing - menu name is not matched.");
		guiUtility.expliciteWait(1000);
	}

	public void mortgageRequestProcessinglink() {
		mortgageRequestProcessinglink.click();
		log.debug("Clicked on Mortgage Request Processing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mortgage Request Processing", "Mortgage Request Processing - menu name is not matched.");
	}

	public void mortgageTaxBillExportlink() {
		mortgageTaxBillExportlink.click();
		log.debug("Clicked on Mortgage TaxBill Export Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mortgage Tax Bill Export", "Mortgage Tax Bill Export - menu name is not matched.");
	}

	public void realDigestlink() {
		realDigestlink.click();
		log.debug("Clicked on Real Digest Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Real Digest", "Real Digest - menu name is not matched.");
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