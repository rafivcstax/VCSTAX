package com.vcstax.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	String vcstaxURL = "http://c949tnkvcstax.ecomqc.tlrg.com:8055";
	/*String userName = "rafi";
	String password = "rafi1234"; */

	public static WebDriver driver;
	
	private static Logger log=LogManager.getLogger(BaseClass.class.getName());

	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Chrome Driver Opened");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(2000);
			log.info("Driver getting closed");
			driver.quit();
		}
	}
}
