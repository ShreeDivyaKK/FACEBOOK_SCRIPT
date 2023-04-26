package com.facebook.automation.generic;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
	System.out.println("on test success"+result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test success precentage"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test failed percentage"+result.getName());
	}	
}
