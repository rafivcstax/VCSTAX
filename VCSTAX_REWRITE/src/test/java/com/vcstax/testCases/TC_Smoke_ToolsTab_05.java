package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.LoginPage;
import com.vcstax.pageObjects.ToolsTab;


public class TC_Smoke_ToolsTab_05 extends BaseClass {

	private LoginPage loginPage = null;
	private ToolsTab toolsTab = null;

	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		toolsTab = new ToolsTab(driver);
		driver.get(vcstaxURL);
	}

	@Test(priority = 0)
	public void clicktoolsTab() {
		loginPage.login();
		toolsTab.clicktoolsTab();
		toolsTab.clickbillslink();
	}

	@Test(priority = 1)
	public void clickreinstateBillslink() {
		toolsTab.clicktoolsTab();
		toolsTab.clickreinstateBillslink();
	}

	@Test(priority = 2)
	public void clickdatalink() {
		toolsTab.clicktoolsTab();
		toolsTab.clickdatalink();
	}

	@Test(priority = 3)
	public void clickdecalNumberslink() {
		toolsTab.clicktoolsTab();
		toolsTab.clickdecalNumberslink();
	}

	@Test(priority = 4)
	public void clickoverpayRefundlink() {
		toolsTab.clicktoolsTab();
		toolsTab.clickoverpayRefundlink();
	}

	@Test(priority = 5)
	public void clicktaxBillFileslink() {
		toolsTab.clicktoolsTab();
		toolsTab.clicktaxBillFileslink();
	}
}
