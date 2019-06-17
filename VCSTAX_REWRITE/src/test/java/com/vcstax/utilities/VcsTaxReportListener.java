package com.vcstax.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vcstax.testCases.BaseClass;

public class VcsTaxReportListener implements ITestListener {

	private ExtentReports extent;
	private ExtentHtmlReporter htmlreports;
	private ExtentTest test;

	public void onTestStart(ITestResult result) {
//		System.out.println("This is onTestStart Method");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "- Test Case PASSED", ExtentColor.GREEN));
	//	System.out.println("In OnSucces Method Method");
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "- Test Case FAILED", ExtentColor.RED));
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshots/" + result.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
	}

	public void onFinish(ITestContext context) {
		if (extent != null) {
			extent.flush();
		}
	//	System.out.println("In OnFinish Method");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		//System.out.println("This is on Start Method");
		String timestamp = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss").format(new Date());
		String reportname = "VCSTAX-SMOKE-Report-" + timestamp + ".html";
		htmlreports = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + reportname);
		htmlreports.config().setDocumentTitle("VCSTAX Report");
		htmlreports.config().setReportName("SMOKE TEST");
		htmlreports.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlreports);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "Test Env - 8055");
		extent.setSystemInfo("Tester Name", "Rafi");
		extent.setSystemInfo("OS", "Windows 7");
		extent.setSystemInfo("Browser", "Chrome");
	}

}
