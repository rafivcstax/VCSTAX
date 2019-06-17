package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.ActivityTab;
import com.vcstax.pageObjects.LoginPage;


public class TC_Smoke_ActivityTab_02 extends BaseClass {

	private LoginPage loginPage = null;
	private ActivityTab activityTab = null;
	
	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		activityTab = new ActivityTab(driver);
		driver.get(vcstaxURL);
	}
	
	@Test(priority = 0)
	public void clickCollectionlink() {
		loginPage.login();
		activityTab.clickActivityTab();
		activityTab.clickCollectionLink();
	}

	@Test(priority = 1)
	public void clickAssessorChangeOrderslink() {
		activityTab.clickActivityTab();
		activityTab.clickAssessorChangeOrders();
	}

	@Test(priority = 2)
	public void clickcalculateRevenueDisbursementlink() {
		activityTab.clickActivityTab();
		activityTab.clickcalculateRevenueDisbursementlink();
	}
	
	@Test(priority = 3)
	public void clickMailProcessinglink() {
		activityTab.clickActivityTab();
		activityTab.clickMailProcessinglink();
	}
	
	@Test(priority = 4)
	public void clickRegisterReconciliationlink() {
		activityTab.clickActivityTab();
		activityTab.clickregisterReconciliationlink();
	}
	
	@Test(priority = 5)
	public void clickApplyLateFeelink() {
		activityTab.clickActivityTab();
		activityTab.applyLateFeelink();
	}
	
	@Test(priority = 6)
	public void clickbankruptcyCaseslink() {
		activityTab.clickActivityTab();
		activityTab.bankruptcyCaseslink();
	}
	
	@Test(priority = 7)
	public void clickdelinquentProcessinglink() {
		activityTab.clickActivityTab();
		activityTab.delinquentProcessinglink();
	}
	
	@Test(priority = 8)
	public void clickquarterlyBillinglink() {
		activityTab.clickActivityTab();
		activityTab.quarterlyBillinglink();
	}
	
	@Test(priority = 9)
	public void clickmobileHomeDigestlink() {
		activityTab.clickActivityTab();
		activityTab.mobileHomeDigestlink();
	}
	
	@Test(priority = 14)
	public void clickmortgageManualProcessinglink() {
		activityTab.clickActivityTab();
		activityTab.mortgageManualProcessinglink();
	}
	
	@Test(priority = 13)
	public void clickmortgagePaymentProcessinglink() {
		activityTab.clickActivityTab();
		activityTab.mortgagePaymentProcessinglink();
	}
	
	@Test(priority = 11)
	public void clickmortgageRequestProcessinglink() {
		activityTab.clickActivityTab();
		activityTab.mortgageRequestProcessinglink();
	}
	
	@Test(priority = 10)
	public void clickmortgageTaxBillExportlink() {
		activityTab.clickActivityTab();
		activityTab.mortgageTaxBillExportlink();
	}
	
	@Test(priority = 12)
	public void clickrealDigestlink() {
		activityTab.clickActivityTab();
		activityTab.realDigestlink();
	}
	
}
