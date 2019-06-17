
package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.LoginPage;
import com.vcstax.pageObjects.ReportTab;

public class TC_Smoke_RepotsTab_03 extends BaseClass {

	private LoginPage loginPage = null;
	private ReportTab reportTab = null;
	
	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		reportTab = new ReportTab(driver);
		driver.get(vcstaxURL);
	}
	
	@Test(priority = 0)
	public void clickdigestAddressDifferenceslink() {
		loginPage.login();
		reportTab.clickReportsTab();
		reportTab.digestAddressDifferenceslink();
	}
	
	@Test(priority = 1)
	public void clickconsolidationSheetslink() {
		reportTab.clickReportsTab();
		reportTab.consolidationSheetslink();
	}
	
	@Test(priority = 2)
	public void clickcountyDigestlink() {
		reportTab.clickReportsTab();
		reportTab.countyDigestlink();
	}
	
	@Test(priority = 3)
	public void clickdigestEditslink() {
		reportTab.clickReportsTab();
		reportTab.digestEditslink();
	}
	
	@Test(priority = 4)
	public void clickdigestEvaluationlink() {
		reportTab.clickReportsTab();
		reportTab.digestEvaluationlink();
	}
	
	@Test(priority = 5)
	public void clickdigestSummarybyAuthoritylink() {
		reportTab.clickReportsTab();
		reportTab.digestSummarybyAuthoritylink();
	}
	
	@Test(priority = 6)
	public void clickexemptionsAnalysislink() {
		reportTab.clickReportsTab();
		reportTab.exemptionsAnalysislink();
	}
	
	@Test(priority = 7)
	public void clickHTRGPT553Adjustmentslink() {
		reportTab.clickReportsTab();
		reportTab.HTRGPT553Adjustmentslink();
	}
	
	@Test(priority = 8)
	public void clickHTRGPT553Detaillink() {
		reportTab.clickReportsTab();
		reportTab.HTRGPT553Detaillink();
	}
	
	@Test(priority = 9)
	public void clickHTRGPT553Summarylink() {
		reportTab.clickReportsTab();
		reportTab.HTRGPT553Summarylink();
	}
	
	@Test(priority = 10)
	public void clickpropertyStrataDetaillink() {
		reportTab.clickReportsTab();
		reportTab.propertyStrataDetaillink();
	}
	
	@Test(priority = 11)
	public void clicktaxBillEditslink() {
		reportTab.clickReportsTab();
		reportTab.taxBillEditslink();
	}
	
	@Test(priority = 12)
	public void clicktaxBillPrintMobileHomelink() {
		reportTab.clickReportsTab();
		reportTab.taxBillPrintMobileHomelink();
	}
	
	@Test(priority = 13)
	public void clicktaxBillPrintPropertylink() {
		reportTab.clickReportsTab();
		reportTab.taxBillPrintPropertylink();
	}
	
	@Test(priority = 14)
	public void clicktaxBillPrintMassPrintinglink() {
		reportTab.clickReportsTab();
		reportTab.taxBillPrintMassPrintinglink();
	}
	
	@Test(priority = 15)
	public void clicktaxBillPrintSpecialTaxlink() {
		reportTab.clickReportsTab();
		reportTab.taxBillPrintSpecialTaxlink();
	}
	
	@Test(priority = 16)
	public void clickspecialTaxPrintExportlink() {
		reportTab.clickReportsTab();
		reportTab.specialTaxPrintExportlink();;
	}
	
	@Test(priority = 17)
	public void clicktop50Taxpayerslink() {
		reportTab.clickReportsTab();
		reportTab.top50Taxpayerslink();
	}
	
	@Test(priority = 18)
	public void clickchangedAddresseslink() {
		reportTab.clickReportsTab();
		reportTab.changedAddresseslink();
	}
	
	@Test(priority = 19)
	public void clickcurrentUnpaidBillsByStatuslink() {
		reportTab.clickReportsTab();
		reportTab.currentUnpaidBillsByStatuslink();
	}
	
	@Test(priority = 20)
	public void clickownerAddressChangeslink() {
		reportTab.clickReportsTab();
		reportTab.ownerAddressChangeslink();
	}
	
	@Test(priority = 21)
	public void clickbalanceSummaryofPercentPaidNewlink() {
		reportTab.clickReportsTab();
		reportTab.balanceSummaryofPercentPaidNewlink();
	}
	
	@Test(priority = 22)
	public void clickpriorYearnoCurrentYearBillsNewlink() {
		reportTab.clickReportsTab();
		reportTab.priorYearnoCurrentYearBillsNewlink();
	}
	
	@Test(priority = 23)
	public void clickoutofBalanceReportlink() {
		reportTab.clickReportsTab();
		reportTab.outofBalanceReportlink();
	}
	
	@Test(priority = 24)
	public void clickpaidFifalink() {
		reportTab.clickReportsTab();
		reportTab.paidFifalink();
	}
	
	@Test(priority = 25)
	public void clicksmallNetDuelink() {
		reportTab.clickReportsTab();
		reportTab.smallNetDuelink();
	}
	
	@Test(priority = 26)
	public void clickunpaidDelinquentDetaillink() {
		reportTab.clickReportsTab();
		reportTab.unpaidDelinquentDetaillink();
	}
	
	@Test(priority = 27)
	public void clickunpaidDelinquentSummarylink() {
		reportTab.clickReportsTab();
		reportTab.unpaidDelinquentSummarylink();
	}
	
	@Test(priority = 28)
	public void clickunpaidBalanceDetaillink() {
		reportTab.clickReportsTab();
		reportTab.unpaidBalanceDetaillink();
	}
	
	@Test(priority = 29)
	public void clickunpaidBalanceSummarylink() {
		reportTab.clickReportsTab();
		reportTab.unpaidBalanceSummarylink();
	}	
	
	@Test(priority = 30)
	public void clickadjNODDetailbyYearlink() {
		reportTab.clickReportsTab();
		reportTab.adjNODDetailbyYearlink();
	}
	
	@Test(priority = 31)
	public void clickadjNODSummarybyYearlink() {
		reportTab.clickReportsTab();
		reportTab.adjNODSummarybyYearlink();
	}
	
	@Test(priority = 32)
	public void clickbackTaxesbyDateRegisterlink() {
		reportTab.clickReportsTab();
		reportTab.backTaxesbyDateRegisterlink();
	}
	
	@Test(priority = 33)
	public void clickdepositReportlink() {
		reportTab.clickReportsTab();
		reportTab.depositReportlink();
	}
	
	@Test(priority = 34)
	public void clicknonPrincipalAdjustmentslink() {
		reportTab.clickReportsTab();
		reportTab.nonPrincipalAdjustmentslink();
	}

	@Test(priority = 35)
	public void clickpayoutDetailbyYearlink() {
		reportTab.clickReportsTab();
		reportTab.payoutDetailbyYearlink();
	}
	
	@Test(priority = 36)
	public void clickpayoutSummarybyYearlink() {
		reportTab.clickReportsTab();
		reportTab.payoutSummarybyYearlink();
	}
	
	@Test(priority = 37)
	public void clickpercentPaidlink() {
		reportTab.clickReportsTab();
		reportTab.percentPaidlink();
	}
	
	@Test(priority = 38)
	public void clickprincipalBalanceReportlink() {
		reportTab.clickReportsTab();
		reportTab.principalBalanceReportlink();
	}
	
	@Test(priority = 39)
	public void clickrefundOverpayTransactionslink() {
		reportTab.clickReportsTab();
		reportTab.refundOverpayTransactionslink();
	}
	
	@Test(priority = 40)
	public void clickbankruptciesYearPropertyTyplink() {
		reportTab.clickReportsTab();
		reportTab.bankruptciesYearPropertyTyplink();
	}
	
	@Test(priority = 41)
	public void clicktaxBillsPaidinFulllink() {
		reportTab.clickReportsTab();
		reportTab.taxBillsPaidinFulllink();
	}
	
	@Test(priority = 42)
	public void clicktransactionJournallink() {
		reportTab.clickReportsTab();
		reportTab.transactionJournallink();
	}
	
	@Test(priority = 43)
	public void clickdelinquentTaxesbyPropertyIDlink() {
		reportTab.clickReportsTab();
		reportTab.delinquentTaxesbyPropertyIDlink();
	}
	
	@Test(priority = 44)
	public void clickdelinquentTaxesbyNetlink() {
		reportTab.clickReportsTab();
		reportTab.delinquentTaxesbyNetlink();
	}
	
	@Test(priority = 45)
	public void clickdelinquentTaxesbyOwnerlink() {
		reportTab.clickReportsTab();
		reportTab.delinquentTaxesbyOwnerlink();
	}
	
	@Test(priority = 46)
	public void clickfifaDocumentslink() {
		reportTab.clickReportsTab();
		reportTab.fifaDocumentslink();
	}
	
	@Test(priority = 47)
	public void clicklevyLetterlink() {
		reportTab.clickReportsTab();
		reportTab.levyLetterlink();
	}
	
	@Test(priority = 48)
	public void clickintentToFiFalink() {
		reportTab.clickReportsTab();
		reportTab.intentToFiFalink();
	}
	
	@Test(priority = 49)
	public void clicknoticeofLevytoOwnerNewlink() {
		reportTab.clickReportsTab();
		reportTab.noticeofLevytoOwnerNewlink();
	}
	
	@Test(priority = 50)
	public void clicknoticeofLevytoTenentNewlink() {
		reportTab.clickReportsTab();
		reportTab.noticeofLevytoTenentNewlink();
	}
	
	@Test(priority = 51)
	public void clicktaxStatementlink() {
		reportTab.clickReportsTab();
		reportTab.taxStatementlink();
	}
	
	@Test(priority = 52)
	public void clickpenaltyDisbursebyAuthoritylink() {
		reportTab.clickReportsTab();
		reportTab.penaltyDisbursebyAuthoritylink();
	}
	
	@Test(priority = 53)
	public void clickPL65Reportlink() {
		reportTab.clickReportsTab();
		reportTab.PL65Reportlink();
	}
	
	@Test(priority = 54)
	public void clickrevenueDisbursebyAuthoritylink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisbursebyAuthoritylink();
	}
	
	@Test(priority = 55)
	public void clickrevenueDisbursebyBillSrclink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisbursebyBillSrclink();
	}
	
	@Test(priority = 56)
	public void clickrevenueDisbursebyDigestTyplink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisbursebyDigestTyplink();
	}
	
	@Test(priority = 57)
	public void clickrevenueDisbursebyPropTypelink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisbursebyPropTypelink();
	}
	
	@Test(priority = 58)
	public void clickrevenueDisbursebyYearlink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisbursebyYearlink();
	}
	
	@Test(priority = 59)
	public void clickrevenueDisburseSummarylink() {
		reportTab.clickReportsTab();
		reportTab.revenueDisburseSummarylink();
	}
	
	@Test(priority = 60)
	public void clickintangibleRecordingslink() {
		reportTab.clickReportsTab();
		reportTab.intangibleRecordingslink();
	}
	
	@Test(priority = 61)
	public void clickdecalDetailbyDateRangelink() {
		reportTab.clickReportsTab();
		reportTab.decalDetailbyDateRangelink();
	}
	
	@Test(priority = 62)
	public void clickmobileHomeCitationlink() {
		reportTab.clickReportsTab();
		reportTab.mobileHomeCitationlink();
	}
	
	@Test(priority = 63)
	public void clicktimberSalesbyYearlink() {
		reportTab.clickReportsTab();
		reportTab.timberSalesbyYearlink();
	}
	
	@Test(priority = 64)
	public void clicktimberSalesbyYearQuarterlink() {
		reportTab.clickReportsTab();
		reportTab.timberSalesbyYearQuarterlink();
	}
}
