package com.flipkart.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.craftsvilla.generic.BaseTest;

public class ScreenShotCapture  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName= result.getMethod().getMethodName();
		EventFiringWebDriver event =new EventFiringWebDriver(BaseTest.driver);
		try
		{
			File src = event.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+methodName+".png"));
		}
		catch(Exception e)
		{
			Reporter.log("Unable to capture the screenshot : "+e);
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
		
	}

	
	
}
