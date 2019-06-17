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

public class ToolsTab {

	public WebDriver driver;
	private GuiUtility guiUtility;

	// Creating constructor
	public ToolsTab(WebDriver rdriver)

	{
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);
	}

	private static Logger log = LogManager.getLogger(ToolsTab.class);

	@FindBy(how = How.XPATH, using = "//span[text()='Tools']")
	WebElement toolsTab;

	@FindBy(how = How.XPATH, using = "//*[@id='megamenu1']")
	WebElement activityTable;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[1]/a[1]")
	WebElement billslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[1]/a[2]")
	WebElement reinstateBillslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[2]/a[1]")
	WebElement datalink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[2]/a[2]")
	WebElement decalNumberslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[2]/a[3]")
	WebElement overpayRefundlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[3]/ul/li[2]/a[4]")
	WebElement taxBillFileslink;

	public void clicktoolsTab() {
		toolsTab.click();
		log.debug("Clicked on Tools Tab");
		guiUtility.expliciteWait(500);
	}

	public void clickbillslink() {
		billslink.click();
		log.debug("Clicked on Bills Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Bills", "Bills - menu name is not matched.");
	}

	public void clickreinstateBillslink() {
		reinstateBillslink.click();
		log.debug("Clicked on Reinstate Bills Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Reinstate Bill(s)", "Reinstate Bill(s) - menu name is not matched.");
	}

	public void clickdatalink() {
		datalink.click();
		log.debug("Clicked on Data Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Data", "Data - menu name is not matched.");
	}

	public void clickdecalNumberslink() {
		decalNumberslink.click();
		log.debug("Clicked on Decal Numbers Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Decal Numbers", "Decal Numbers - menu name is not matched.");
	}

	public void clickoverpayRefundlink() {
		overpayRefundlink.click();
		log.debug("Clicked on Overpay Refund Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Overpay Refund", "Overpay Refund - menu name is not matched.");
	}

	public void clicktaxBillFileslink() {
		taxBillFileslink.click();
		log.debug("Clicked on TaxBill Files Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Files", "Tax Bill Files - menu name is not matched.");
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