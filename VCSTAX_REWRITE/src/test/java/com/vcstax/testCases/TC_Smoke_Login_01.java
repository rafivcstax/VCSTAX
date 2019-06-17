package com.vcstax.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vcstax.pageObjects.LoginPage;

public class TC_Smoke_Login_01 extends BaseClass {

	@Test(priority = 0)
	public void loginTest() {
		
		driver.get(vcstaxURL);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login();
				
		Assert.assertEquals(driver.findElement(By.className("topbar-brand")).getText(), "VCSTax",
				"Failed to Login into VCSTAX application");
	}

}
