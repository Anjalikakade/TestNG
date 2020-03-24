package listenersuitedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AlwaysRunDemo
{
	WebDriver driver;
	@Test()
	public void strartapp()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		System.out.println("Start Applications:");
	}
	@Test(dependsOnMethods="strartapp")
	public void checkTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		Assert.assertEquals(title, "Demo Web Shop");
	}
	@Test(dependsOnMethods="checkTitle")
	public void loginapp()
	{
		driver.findElement(By.id("Email")).sendKeys("anjalik2997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Anjali");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("Successfully login:");
	}
	@Test(dependsOnMethods="loginapp")
	public void signoff()
	{
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		System.out.println("Successfully logOut:");
	}
	@Test(dependsOnMethods="signoff",alwaysRun=true)
	public void closebrowser()
	{
		driver.close();
	}

}
