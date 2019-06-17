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

public class ReportTab {

	private WebDriver driver;
	private GuiUtility guiUtility;

	public ReportTab(WebDriver rdriver) {
		driver = rdriver;
		guiUtility = new GuiUtility(rdriver);
		PageFactory.initElements(rdriver, this);
	}

	private static Logger log = LogManager.getLogger(ReportTab.class);

	@FindBy(how = How.XPATH, using = "//span[text()='Reports']")
	WebElement reportslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DigestAddressDifferences')]")
	WebElement digestAddressDifferenceslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'ConsolidationSheets')]")
	WebElement consolidationSheetslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'CountyDigest')]")
	WebElement countyDigestlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DigestEdit')]")
	WebElement digestEditslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DigestEvaluation')]")
	WebElement digestEvaluationlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DigestSummaryByAuthority')]")
	WebElement digestSummarybyAuthoritylink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'ExemptionsAnalysis')]")
	WebElement exemptionsAnalysislink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[1]/a[8]")
	WebElement HTRGPT553Adjustmentslink;

	@FindBy(how = How.XPATH, using ="/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[1]/a[9]")
	WebElement HTRGPT553Detaillink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[1]/a[10]")
	WebElement HTRGPT553Summarylink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'PropertyStrataDetail')]")
	WebElement propertyStrataDetaillink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'TaxBillEdits')]")
	WebElement taxBillEditslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'TaxBillPrintMobileHome')]")
	WebElement taxBillPrintMobileHomelink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'TaxBillPrintProperty')]")
	WebElement taxBillPrintPropertylink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'TaxBillPrintMassPrinting')]")
	WebElement taxBillPrintMassPrintinglink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'TaxBillPrintSpecialTax')]")
	WebElement taxBillPrintSpecialTaxlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'SpecialTaxPrintExport')]")
	WebElement specialTaxPrintExportlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'Top50Taxpayers')]")
	WebElement top50Taxpayerslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[1]")
	WebElement changedAddresseslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[2]")
	WebElement currentUnpaidBillsByStatuslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[3]")
	WebElement ownerAddressChangeslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[4]")
	WebElement balanceSummaryofPercentPaidNewlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[5]")
	WebElement priorYearnoCurrentYearBillsNewlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[6]")
	WebElement outofBalanceReportlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[7]")
	WebElement paidFifalink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[8]")
	WebElement smallNetDuelink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[9]")
	WebElement unpaidDelinquentDetaillink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[10]")
	WebElement unpaidDelinquentSummarylink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[11]")
	WebElement unpaidBalanceDetaillink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[2]/a[12]")
	WebElement unpaidBalanceSummarylink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[1]")
	WebElement adjNODDetailbyYearlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[2]")
	WebElement adjNODSummarybyYearlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[3]")
	WebElement backTaxesbyDateRegisterlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[4]")
	WebElement depositReportlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[5]")
	WebElement nonPrincipalAdjustmentslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[6]")
	WebElement payoutDetailbyYearlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[7]")
	WebElement payoutSummarybyYearlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[8]")
	WebElement percentPaidlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[9]")
	WebElement principalBalanceReportlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[10]")
	WebElement refundOverpayTransactionslink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[4]/a[11]")
	WebElement bankruptciesYearPropertyTyplink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DailyBalancingTaxBillsPaidInFull')]")
	WebElement taxBillsPaidinFulllink;
	 
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[6]/a[2]")
	WebElement transactionJournallink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DelinquentTaxesByPropertyId')]")
	WebElement delinquentTaxesbyPropertyIDlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[6]/a[4]")
	WebElement delinquentTaxesbyNetlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'DelinquentTaxesByOwner')]")
	WebElement delinquentTaxesbyOwnerlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'FifaDocuments')]")
	WebElement fifaDocumentslink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'LevyLetter')]")
	WebElement levyLetterlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'intenttofifa')]")
	WebElement intentToFiFalink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[6]/a[9]")
	WebElement noticeofLevytoOwnerNewlink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[6]/a[10]")
	WebElement noticeofLevytoTenentNewlink;

	@FindBy(how = How.XPATH, using = ".//a[contains(@href, 'taxstatement')]")
	WebElement taxStatementlink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[1]")
	WebElement penaltyDisbursebyAuthoritylink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[2]")
	WebElement PL65Reportlink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[3]")
	WebElement revenueDisbursebyAuthoritylink;

	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[4]")
	WebElement revenueDisbursebyBillSrclink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[5]")
	WebElement revenueDisbursebyDigestTyplink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[6]")
	WebElement revenueDisbursebyPropTypelink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[7]")
	WebElement revenueDisbursebyYearlink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[8]")
	WebElement revenueDisburseSummarylink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[8]/a[9]")
	WebElement intangibleRecordingslink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[10]/a[1]")
	WebElement decalDetailbyDateRangelink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[10]/a[2]")
	WebElement mobileHomeCitationlink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[10]/a[3]")
	WebElement timberSalesbyYearlink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div/div/div/nav/div/div[1]/div[2]/ul/li[10]/a[4]")
	WebElement timberSalesbyYearQuarterlink;
	
		

	public void clickReportsTab() {
		reportslink.click();
		log.debug("Clicked on Report Tab");
		guiUtility.expliciteWait(500);
		
	}

	public void digestAddressDifferenceslink() {
		digestAddressDifferenceslink.click();
		log.debug("Clicked on Digest Address Differences Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Digest Address Differences", "Digest Address Differences - menu name is not matched.");
	}

	public void consolidationSheetslink() {
		consolidationSheetslink.click();
		log.debug("Clicked on Consolidation Sheets Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Consolidation Sheets", "Consolidation Sheets - menu name is not matched.");
	}

	public void countyDigestlink() {
		countyDigestlink.click();
		log.debug("Clicked on County Digest Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "County Digest", "County Digest - menu name is not matched.");
	}

	public void digestEditslink() {
		digestEditslink.click();
		log.debug("Clicked on Digest Edits Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Digest Edits", "Digest Edits - menu name is not matched.");
	}

	public void digestEvaluationlink() {
		digestEvaluationlink.click();
		log.debug("Clicked on Digest Evaluations Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Digest Evaluation", "Digest Evaluation - menu name is not matched.");
	}

	public void digestSummarybyAuthoritylink() {
		digestSummarybyAuthoritylink.click();
		log.debug("Clicked on Digest Summary by Authority Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Digest Summary by Authority", "Digest Summary by Authority - menu name is not matched.");
	}

	public void exemptionsAnalysislink() {
		exemptionsAnalysislink.click();
		log.debug("Clicked on Exemptions Analysis Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Exemptions Analysis", "Exemptions Analysis - menu name is not matched.");
	}

	public void HTRGPT553Adjustmentslink() {
		HTRGPT553Adjustmentslink.click();
		log.debug("Clicked on HTRG PT-553 Adjustments Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "HTRG PT-553 Adjustments", "HTRG PT-553 Adjustments - menu name is not matched.");
	}

	public void HTRGPT553Detaillink() {
		HTRGPT553Detaillink.click();
		log.debug("Clicked on HTRG PT-553 Detail Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "HTRG PT-553 Detail", "HTRG PT-553 Detail - menu name is not matched.");
	}

	public void HTRGPT553Summarylink() {
		HTRGPT553Summarylink.click();
		log.debug("Clicked on HTRG PT-553 Summary Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "HTRG PT-553 Summary", "HTRG PT-553 Summary - menu name is not matched.");
	}

	public void propertyStrataDetaillink() {
		propertyStrataDetaillink.click();
		log.debug("Clicked on Property Strata Detail Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Property Strata Detail", "Property Strata Detail - menu name is not matched.");
	}

	public void taxBillEditslink() {
		taxBillEditslink.click();
		log.debug("Clicked on Property Strata Detail Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Edits", "Tax Bill Edits - menu name is not matched.");
	}

	public void taxBillPrintMobileHomelink() {
		taxBillPrintMobileHomelink.click();
		log.debug("Clicked on TaxBill Print-Mobile Home Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Print - Mobile Home", "Tax Bill Print - Mobile Home - menu name is not matched.");
	}

	public void taxBillPrintPropertylink() {
		taxBillPrintPropertylink.click();
		log.debug("Clicked on TaxBill Print-Property Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Print - Property", "Tax Bill Print-Property - menu name is not matched.");
	}

	public void taxBillPrintMassPrintinglink() {
		taxBillPrintMassPrintinglink.click();
		log.debug("Clicked on TaxBill Print-Mass Printing Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Print - Mass Printing", "Tax Bill Print-Mass Printing - menu name is not matched.");
	}

	public void taxBillPrintSpecialTaxlink() {
		taxBillPrintSpecialTaxlink.click();
		log.debug("Clicked on TaxBill Print-SpecialTax Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bill Print - Special Tax", "Tax Bill Print-Special Tax - menu name is not matched.");
	}

	public void specialTaxPrintExportlink() {
		specialTaxPrintExportlink.click();
		log.debug("Clicked on Special Tax Print Export Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Special Tax Print Export", "Special Tax Print Export - menu name is not matched.");
	}

	public void top50Taxpayerslink() {
		top50Taxpayerslink.click();
		log.debug("Clicked on Top 50 Tax Payers Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Top 50 Taxpayers", "Top 50 Taxpayers - menu name is not matched.");
	}

	public void changedAddresseslink() {
		changedAddresseslink.click();
		log.debug("Clicked on Changed Addresses Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Changed Addresses", "Changed Addresses - menu name is not matched.");
	}

	public void currentUnpaidBillsByStatuslink() {
		currentUnpaidBillsByStatuslink.click();
		log.debug("Clicked on Current Unpaid Bills By Status link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Current Unpaid Bills By Status", "Current Unpaid Bills By Status - menu name is not matched.");
	}

	public void ownerAddressChangeslink() {
		ownerAddressChangeslink.click();
		log.debug("Clicked on Owner Address Changes Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Owner Address Changes", "Owner Address Changes - menu name is not matched.");
	}

	public void balanceSummaryofPercentPaidNewlink() {
		balanceSummaryofPercentPaidNewlink.click();
		log.debug("Clicked on Balance Summary of Percent Paid(New) link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Balance Summary of Percent Paid (New)", "Balance Summary of Percent Paid (New) - menu name is not matched.");
	}

	public void priorYearnoCurrentYearBillsNewlink() {
		priorYearnoCurrentYearBillsNewlink.click();
		log.debug("Clicked on Prior Year no Current Year Bills(New) link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Prior Year no Current Year Bills (New)", "Prior Year no Current Year Bills (New) - menu name is not matched.");
	}

	public void outofBalanceReportlink() {
		outofBalanceReportlink.click();
		log.debug("Clicked on Out of Balance Report Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Out of Balance Report", "Out of Balance Report - menu name is not matched.");
	}

	public void paidFifalink() {
		paidFifalink.click();
		log.debug("Clicked on Paid Fifa Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Paid Fifa", "Paid Fifa - menu name is not matched.");
	}

	public void smallNetDuelink() {
		smallNetDuelink.click();
		log.debug("Clicked on Small Net Due Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Small Net Due", "Small Net Due - menu name is not matched.");
	}

	public void unpaidDelinquentDetaillink() {
		unpaidDelinquentDetaillink.click();
		log.debug("Clicked on Unpaid/Delinquent Detail Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Unpaid / Delinquent Detail", "Unpaid / Delinquent Detail - menu name is not matched.");
	}

	public void unpaidDelinquentSummarylink() {
		unpaidDelinquentSummarylink.click();
		log.debug("Clicked on Unpaid/Delinquent Summary Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Unpaid / Delinquent Summary", "Unpaid / Delinquent Summary - menu name is not matched.");
	}

	public void unpaidBalanceDetaillink() {
		unpaidBalanceDetaillink.click();
		log.debug("Clicked on Unpaid Balance Detail Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Unpaid Balance Detail", "Unpaid Balance Detail - menu name is not matched.");
	}

	public void unpaidBalanceSummarylink() {
		unpaidBalanceSummarylink.click();
		log.debug("Clicked on Unpaid Balance Summary Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Unpaid Balance Summary", "Unpaid Balance Summary - menu name is not matched.");
	}

	public void adjNODDetailbyYearlink() {
		adjNODDetailbyYearlink.click();
		log.debug("Clicked on Adj/NOD Detail by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Adj/NOD Detail by Year", "Adj/NOD Detail by Year - menu name is not matched.");
	}

	public void adjNODSummarybyYearlink() {
		adjNODSummarybyYearlink.click();
		log.debug("Clicked on Adj/NOD Summary by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Adj/NOD Summary by Year", "Adj/NOD Summary by Year - menu name is not matched.");
	}

	public void backTaxesbyDateRegisterlink() {
		backTaxesbyDateRegisterlink.click();
		log.debug("Clicked on Back Taxes by Date Register Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Back Taxes by Date/Register", "Back Taxes by Date/Register - menu name is not matched.");
	}

	public void depositReportlink() {
		depositReportlink.click();
		log.debug("Clicked on Deposit Report Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Deposit Report", "Deposit Report - menu name is not matched.");
	}

	public void nonPrincipalAdjustmentslink() {
		nonPrincipalAdjustmentslink.click();
		log.debug("Clicked on Non-PrincipalAdjustments Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Non-Principal Adjustments", "Non-Principal Adjustments - menu name is not matched.");
	}

	public void payoutDetailbyYearlink() {
		payoutDetailbyYearlink.click();
		log.debug("Clicked on Payout Detail by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Payout Detail by Year", "Payout Detail by Year - menu name is not matched.");
	}

	public void payoutSummarybyYearlink() {
		payoutSummarybyYearlink.click();
		log.debug("Clicked on Payout Summary by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Payout Summary by Year", "Payout Summary by Year - menu name is not matched.");
	}

	public void percentPaidlink() {
		percentPaidlink.click();
		log.debug("Clicked on Percent Paid Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Percent Paid", "Percent Paid - menu name is not matched.");
	}

	public void principalBalanceReportlink() {
		principalBalanceReportlink.click();
		log.debug("Clicked on Principal Balance Report Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Principal Balance Report", "Principal Balance Report - menu name is not matched.");
	}

	public void refundOverpayTransactionslink() {
		refundOverpayTransactionslink.click();
		log.debug("Clicked on Refund Overpay Transactions Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Refund / Overpay Transactions", "Refund / Overpay Transactions - menu name is not matched.");
	}

	public void bankruptciesYearPropertyTyplink() {
		bankruptciesYearPropertyTyplink.click();
		log.debug("Clicked on BankruptciesYear/Property Typ Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Bankruptcies Year/Property Typ", "Bankruptcies Year/Property Typ - menu name is not matched.");
	}

	public void taxBillsPaidinFulllink() {
		taxBillsPaidinFulllink.click();
		log.debug("Clicked on TaxBills Paid in Full Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Bills Paid in Full", "Tax Bills Paid in Full - menu name is not matched.");
	}

	public void transactionJournallink() {
		transactionJournallink.click();
		log.debug("Clicked on Transaction Journal Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Transaction Journal", "Transaction Journal - menu name is not matched.");
	}

	public void delinquentTaxesbyPropertyIDlink() {
		delinquentTaxesbyPropertyIDlink.click();
		log.debug("Clicked on Delinquent Taxes by PropertyID Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Delinquent Taxes by Property ID", "Delinquent Taxes by Property ID - menu name is not matched.");
	}

	public void delinquentTaxesbyNetlink() {
		delinquentTaxesbyNetlink.click();
		log.debug("Clicked on Delinquent Taxes by Net Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Delinquent Taxes by Net", "Delinquent Taxes by Net - menu name is not matched.");
	}

	public void delinquentTaxesbyOwnerlink() {
		delinquentTaxesbyOwnerlink.click();
		log.debug("Clicked on Delinquent Taxes by Owner Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Delinquent Taxes by Owner", "Delinquent Taxes by Owner - menu name is not matched.");
	}

	public void fifaDocumentslink() {
		fifaDocumentslink.click();
		log.debug("Clicked on Fifa Documents Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Fifa Documents", "Fifa Documents - menu name is not matched.");
	}

	public void levyLetterlink() {
		levyLetterlink.click();
		log.debug("Clicked on Levy Letter Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Levy Letter", "Levy Letter - menu name is not matched.");
	}

	public void intentToFiFalink() {
		intentToFiFalink.click();
		log.debug("Clicked on Intent To FiFa Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Intent To FiFa", "Intent To FiFa - menu name is not matched.");
	}

	public void noticeofLevytoOwnerNewlink() {
		noticeofLevytoOwnerNewlink.click();
		log.debug("Clicked on Notice of Levy to Owner New Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Notice of Levy to Owner (New)", "Notice of Levy to Owner (New) - menu name is not matched.");
	}

	public void noticeofLevytoTenentNewlink() {
		noticeofLevytoTenentNewlink.click();
		log.debug("Clicked on Notice of Levy to Tenent New Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Notice of Levy to Tenant (New)", "Notice of Levy to Tenant (New) - menu name is not matched.");
	}

	public void taxStatementlink() {
		taxStatementlink.click();
		log.debug("Clicked on Tax Statement Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Tax Statement", "Tax Statement - menu name is not matched.");
	}
	
	public void penaltyDisbursebyAuthoritylink() {
		penaltyDisbursebyAuthoritylink.click();
		log.debug("Clicked on Penalty Disburse by Authority Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Penalty Disburse by Authority", "Penalty Disburse by Authority - menu name is not matched.");
	}
	
	public void PL65Reportlink() {
		PL65Reportlink.click();
		log.debug("Clicked on PL-65 Report Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "PL-65 Report", "PL-65 Report - menu name is not matched.");
	}
	
	public void revenueDisbursebyAuthoritylink() {
		revenueDisbursebyAuthoritylink.click();
		log.debug("Clicked on Revenue Disburse by Authority Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse by Authority", "Revenue Disburse by Authority - menu name is not matched.");
	}
	
	public void revenueDisbursebyBillSrclink() {
		revenueDisbursebyBillSrclink.click();
		log.debug("Clicked on Revenue Disburse by Bill Src Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse by Bill Src", "Revenue Disburse by Bill Src - menu name is not matched.");
	}
	
	public void revenueDisbursebyDigestTyplink() {
		revenueDisbursebyDigestTyplink.click();
		log.debug("Clicked on Revenue Disburse by Digest Typ Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse by Digest Typ", "Revenue Disburse by Digest Typ - menu name is not matched.");
	}
	
	public void revenueDisbursebyPropTypelink() {
		revenueDisbursebyPropTypelink.click();
		log.debug("Clicked on Revenue Disburse by Prop Typ Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse by Prop Type", "Revenue Disburse by Prop Type - menu name is not matched.");
	}
	
	public void revenueDisbursebyYearlink() {
		revenueDisbursebyYearlink.click();
		log.debug("Clicked on Revenue Disburse by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse by Year", "Revenue Disburse by Year - menu name is not matched.");
	}
	
	public void revenueDisburseSummarylink() {
		revenueDisburseSummarylink.click();
		log.debug("Clicked on Revenue Disburse by Summary Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Revenue Disburse Summary", "Revenue Disburse Summary - menu name is not matched.");
	}
	
	public void intangibleRecordingslink() {
		intangibleRecordingslink.click();
		log.debug("Clicked on Intangible Recordings Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Intangible Recordings", "Intangible Recordings - menu name is not matched.");
	}
	
	public void decalDetailbyDateRangelink() {
		decalDetailbyDateRangelink.click();
		log.debug("Clicked on Decal Detail by Date Range Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Decal Detail by Date Range", "Decal Detail by Date Range - menu name is not matched.");
	}
	
	public void mobileHomeCitationlink() {
		mobileHomeCitationlink.click();
		log.debug("Clicked on Mobile Home Citation Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Mobile Home Citation", "Mobile Home Citation - menu name is not matched.");
	}
	
	public void timberSalesbyYearlink() {
		timberSalesbyYearlink.click();
		log.debug("Clicked on Timber Sales by Year Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Timber Sales by Year", "Timber Sales by Year - menu name is not matched.");
	}
	
	public void timberSalesbyYearQuarterlink() {
		timberSalesbyYearQuarterlink.click();
		log.debug("Clicked on Timber Sales by Year Quarter Link");
		guiUtility.expliciteWait(500);
		String pageName = driver.findElement(By.xpath(".//div[contains(@class, 'vcstax-application-menu') ]/descendant::div[@class='selected-menu-item']")).getText();
		Assert.assertEquals(pageName, "Timber Sales by Year/Quarter", "Timber Sales by Year/Quarter - menu name is not matched.");
	}
	

	/*
	 * public void reportsTable() { int Noofrows =
	 * reportsTable.findElements(By.tagName("a")).size();
	 * System.out.println(Noofrows); for (int i = 0; i <= Noofrows - 1; i++) {
	 * reportsTable.findElements(By.tagName("a")).get(i).click();
	 * System.out.println("Link: " + ldriver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div/div/div/nav/div/div[2]/span")).getText() +
	 * " - has Open");
	 * ldriver.findElement(By.xpath("//span[text()='Reports']")).click(); //
	 * at.clickActivityTab(); String fileName = ldriver.findElement(By.xpath(
	 * "/html/body/div/div[1]/div/div/div/nav/div/div[2]/span")) .getText();
	 * guiUtility.takeScreenShot(fileName);
	 * 
	 * }
	 * 
	 * }
	 */

}
