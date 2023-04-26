package com.facebook.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class
{
	public WebDriver driver;
	@Parameters({"key","value","url"})
	@BeforeMethod
	public void openApp(String key,String value, String url)
	{
	System.setProperty(key,value);
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
