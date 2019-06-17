package com.vcstax.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.LoginPage;
import com.vcstax.pageObjects.SettingsTab;

public class TC_Smoke_SettingsTab_04 extends BaseClass {

	private LoginPage loginPage = null;
	private SettingsTab settingTab = null;
	
	@BeforeClass
	public void defineTestObjects() {
		loginPage = new LoginPage(driver);
		settingTab = new SettingsTab(driver);
		driver.get(vcstaxURL);
	}

	@Test(priority = 0)
	public void clickannualConfigurationlink() {
		loginPage.login();
		settingTab.clicksettingsTab();
		settingTab.clickannualConfigurationlink();
		}

	@Test(priority = 1)
	public void clicksystemConfigurationlink() {
		settingTab.clicksettingsTab();
		settingTab.clicksystemConfigurationlink();
	}

	@Test(priority = 2)
	public void clicktextEditorlink() {
		settingTab.clicksettingsTab();
		settingTab.clicktextEditorlink();
	}
	
	@Test(priority = 3)
	public void clickrolesManagerlink() {
		settingTab.clicksettingsTab();
		settingTab.clickrolesManagerlink();
	}
	
	@Test(priority = 4)
	public void clickuserAccountsManagerlink() {
		settingTab.clicksettingsTab();
		settingTab.clickuserAccountsManagerlink();
	}
	
	@Test(priority = 5)
	public void clickproductInformationlink() {
		settingTab.clicksettingsTab();
		settingTab.clickproductInformationlink();
	}
	
	@Test(priority = 6)
	public void clickreleaseNoteslink() {
		settingTab.clicksettingsTab();
		settingTab.clickreleaseNoteslink();
	}
}
