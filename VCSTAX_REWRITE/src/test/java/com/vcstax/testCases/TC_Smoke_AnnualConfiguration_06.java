package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.AnnualConfiguration;
import com.vcstax.pageObjects.LoginPage;
import com.vcstax.pageObjects.SettingsTab;

public class TC_Smoke_AnnualConfiguration_06 extends BaseClass {

	private LoginPage loginPage = null;
	private AnnualConfiguration annualconfig = null;
	private SettingsTab settingTab = null;
	
	
	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		settingTab = new SettingsTab(driver);
		annualconfig = new AnnualConfiguration(driver);
		driver.get(vcstaxURL);
	}
	
	@Test(priority = 0)
	public void clickannualDefaultlink() {
		loginPage.login();
		settingTab.clicksettingsTab();
		settingTab.clickannualConfigurationlink();
		annualconfig.clickannualDefaultlink();
		annualconfig.clickannualConfigurationlink();
	}

	@Test(priority = 1)
	public void clickbillnumblink() {
		annualconfig.clickbillnumblink();
		annualconfig.clickannualConfigurationlink();
	}

	@Test(priority = 2)
	public void clickcommissionrateslink() {
		annualconfig.clickcommissionrateslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 3)
	public void clickdistributionmethodlink() {
		annualconfig.clickdistributionmethodlink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 4)
	public void clickdecalnumberslink() {
		annualconfig.clickdecalnumberslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 5)
	public void clickdistricttaxacctxreflink() {
		annualconfig.clickdistricttaxacctxreflink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 6)
	public void clickconsolidationsheetprtvalueslink() {
		annualconfig.clickconsolidationsheetprtvalueslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 7)
	public void clickexemptionamountslink() {
		annualconfig.clickexemptionamountslink();
		annualconfig.clickannualConfigurationlink();
		
	}
	
	@Test(priority = 8)
	public void clickexemptionexceptionslink() {
		annualconfig.clickexemptionexceptionslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 9)
	public void clickmortgageaccountslink() {
		annualconfig.clickmortgageaccountslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 10)
	public void clicklatefeeamountslink() {
		annualconfig.clicklatefeeamountslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 11)
	public void clicklatefeeinterestlink() {
		annualconfig.clicklatefeeinterestlink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 12)
	public void clicklatefeepenaltylink() {
		annualconfig.clicklatefeepenaltylink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 13)
	public void clicktaxbillspecialexemptionamountslink() {
		annualconfig.clicktaxbillspecialexemptionamountslink();
		annualconfig.clickannualConfigurationlink();
	}
	
	@Test(priority = 14)
	public void clicktaxbillspecialtaxamountslink() {
		annualconfig.clicktaxbillspecialtaxamountslink();
		annualconfig.clickannualConfigurationlink();
	} 
	
	@Test(priority = 15)
	public void clicktaxaccountrateslink() {
		annualconfig.clicktaxaccountrateslink();
		annualconfig.clickannualConfigurationlink();
	}
	
}
