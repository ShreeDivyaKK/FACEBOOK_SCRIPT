package com.facebook.automation.testscript;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.facebook.automation.generic.Base_Class;
import com.facebook.automation.generic.Data_Provider;
import com.facebook.automation.pom.Pom_Class;
@Listeners(com.facebook.automation.generic.ListenerClass.class)
public class TestScript_FB_Login extends Base_Class 
{
	@Test(dataProvider="TestData", dataProviderClass=Data_Provider.class)
	public void script(String fn, String ln, String em, String pwd, String dates, String months, String years) throws InterruptedException, IOException
	{
		ExtentHtmlReporter report=new  ExtentHtmlReporter("./report/extant.html");
		ExtentReports  reports=new ExtentReports();
		reports.attachReporter(report);
		ExtentTest test = reports.createTest("Extent Test Report");
		Pom_Class pcm=new Pom_Class(driver);	
		String home_page = pcm.logo_home().getAttribute("alt");
		Assert.assertEquals(home_page, "Facebook");
		Reporter.log("Facebook Main Page is Displayed");
		pcm.create().click();
		Thread.sleep(1500);
		String signup_Page = pcm.logo_signup().getTagName();
		Assert.assertEquals(signup_Page, "div");
		Reporter.log("Facebook Sign Up page is displayed");
		pcm.firstname().sendKeys(fn);
		Thread.sleep(1500);
		pcm.surname().sendKeys(ln);
		Thread.sleep(1500);
		pcm.email().sendKeys(em);
		Thread.sleep(1500);
		pcm.reenterem().sendKeys(em);
		Thread.sleep(1500);
		pcm.password().sendKeys(pwd);
		WebElement day1 = pcm.day();
		Select sel1=new Select(day1);
		if(dates=="12")
		{
			test.log(Status.PASS, "Date is selected");	
		}
		else {
		test.log(Status.FAIL,"Date not Selected");
		test.addScreenCaptureFromPath(screenShot());
		}
		sel1.selectByVisibleText(dates);
		
		Thread.sleep(3000);
		WebElement month1=pcm.month();
		Select sel2=new Select(month1);
		sel2.selectByVisibleText(months);
		Thread.sleep(3000);
		WebElement year1=pcm.year();
		Select sel3=new Select(year1);
		sel3.selectByVisibleText(years);
		Thread.sleep(1500);
		pcm.gender().click();		
	}
	public String screenShot()
	{
		String path="./screenshot/ .jpeg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path);
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ". "+path;
	}
}
//wewill achieving oops concepts in entire frame work we are creating class inhering all the methods we are creating objects 
		//typed thing is hiding data encapsulation, dataflow is inheritence,modules are called as objects,
		//order id or response details achieve abstraction