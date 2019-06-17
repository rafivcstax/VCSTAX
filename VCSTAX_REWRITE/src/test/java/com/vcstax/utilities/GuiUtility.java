package com.vcstax.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GuiUtility {
	private WebDriver ldriver;

	public GuiUtility(WebDriver rdriver) {
		ldriver = rdriver;
	}
	
	public void takeScreenShot(String fileName) {
		String location = "C:\\Users\\UX014563\\TR Workspace\\VCSTAX_REWRITE\\Screenshots\\";
		try {
			File screenshots = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshots, new File(location + fileName + ".png"));
		} catch (Exception exe) {
			exe.printStackTrace();
		}
	}
	
	public void expliciteWait(long milliSecs) {
		try {
			Thread.sleep(milliSecs);
		} catch(InterruptedException exe) {
			exe.printStackTrace();
		}
	}

}
