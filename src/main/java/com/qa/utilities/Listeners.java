package com.qa.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class Listeners extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		logg.info("Test execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logg.info("Test case pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName() + System.currentTimeMillis();
		try {
			ScreenShotClass.ScreenshotMethod(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logg.info("Test case fail");
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		logg.info("Test case skipped");
	}
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		logg.info("Execution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		logg.info("Execution Finished");
	}

}
