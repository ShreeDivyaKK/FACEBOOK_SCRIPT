package com.facebook.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class
{
	@FindBy(xpath="//img[@alt='Facebook']")
	private WebElement logo_address;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createaccount;
	
	@FindBy(xpath="//div[text()='Sign Up']")
	private WebElement signup_logo;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement emailormobile;
	@FindBy(xpath="//input[@aria-label='Re-enter email address']")
	private WebElement reenteremailormobile;
	
	@FindBy(xpath="//input[@aria-label='New password']")
	private WebElement pass_word;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement day_drop;
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month_drop;
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year_drop;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement selgender;
	
	public Pom_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement logo_home()
	{
		return logo_address;
	}
	
	public WebElement create()
	{
		return createaccount;
	}
	public WebElement logo_signup()
	{
		return signup_logo;
	}
	public WebElement firstname()
	{
		return first_name;
	}
	public WebElement surname()
	{
		return last_name;
	}
	public WebElement email()
	{
		return emailormobile;
	}
	public WebElement reenterem()
	{
		return reenteremailormobile;
	}
	public WebElement password()
	{
		return pass_word;
	}
	public WebElement day()
	{
		return day_drop;
	}
	public WebElement month()
	{
		return month_drop;
	}
	public WebElement year()
	{
		return year_drop;
	}
	public WebElement gender()
	{
		return selgender;
	}
	
}
