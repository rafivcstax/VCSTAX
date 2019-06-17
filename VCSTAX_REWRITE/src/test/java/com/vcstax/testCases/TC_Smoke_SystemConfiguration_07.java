package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.LoginPage;
import com.vcstax.pageObjects.SettingsTab;
import com.vcstax.pageObjects.SystemConfiguration;

public class TC_Smoke_SystemConfiguration_07 extends BaseClass {

	private LoginPage loginPage = null;
	private SystemConfiguration systemconfig = null;
	private SettingsTab settingTab = null;
	
	
	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		settingTab = new SettingsTab(driver);
		systemconfig = new SystemConfiguration(driver);
		driver.get(vcstaxURL);
	}
	
	@Test(priority = 0)
	public void clickbatchtypeslink() {
		loginPage.login();
		settingTab.clicksettingsTab();
		settingTab.clicksystemConfigurationlink();
		systemconfig.clickbatchtypeslink();
		systemconfig.clicksystemconfigurationlink();
	}

	@Test(priority = 1)
	public void clickbatchofficerslink() {
		systemconfig.clickbatchofficerslink();
		systemconfig.clicksystemconfigurationlink();
	}

	@Test(priority = 2)
	public void clickcountymasterlink() {
		systemconfig.clickcountymasterlink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 3)
	public void clickdisbursementaccountslink() {
		systemconfig.clickdisbursementaccountslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 4)
	public void clickdistrictpropertytypexreflink() {
		systemconfig.clickdistrictpropertytypexreflink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 5)
	public void clickexemptionslink() {
		systemconfig.clickexemptionslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 6)
	public void clickdistrictslink() {
		systemconfig.clickdistrictslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 7)
	public void clickpropertystratalink() {
		systemconfig.clickpropertystratalink();
		systemconfig.clicksystemconfigurationlink();
		
	}
	
	@Test(priority = 8)
	public void clickpropertytypeslink() {
		systemconfig.clickpropertytypeslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 9)
	public void clickregisterslink() {
		systemconfig.clickregisterslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 10)
	public void clicktablessetuplink() {
		systemconfig.clicktablessetuplink();
		systemconfig.clicksystemconfigurationlink();
	}
	
	@Test(priority = 11)
	public void clicktaxaccountslink() {
		systemconfig.clicktaxaccountslink();
		systemconfig.clicksystemconfigurationlink();
	}
	
		
}
