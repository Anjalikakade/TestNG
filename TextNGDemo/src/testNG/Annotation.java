package testNG;

import org.testng.annotations.*;

public class Annotation
{
	@BeforeSuite
	public void setProperty()
	{
		System.out.println("set the property:");
	}
	@BeforeTest
	public void checkURL()
	{
		System.out.println("Check URL:");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("URL Launched:");
	}
	
	@BeforeMethod
	public void getitles()
	{
		System.out.println("fetch Title:");
	}
	@Test
	public void VerifyURL()
	{
		System.out.println("URL verified:");
	}
	@AfterMethod
	public void checklogin()
	{
		System.out.println("login succsessfully");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("log out  succesfully");
	}
	@AfterTest
	public void checkpage()
	{
		System.out.println("correct page");
	}
	
	
	
}
