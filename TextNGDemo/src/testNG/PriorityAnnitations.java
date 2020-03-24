package testNG;

import org.testng.annotations.*;

public class PriorityAnnitations
{
	@Test(description="Testcase to start appication")
	public void strartapp()
	{
		System.out.println("Start Applications:");
	}
	
	@Test(priority=1,description="Testcase to login")
	public void loginapp()
	{
		System.out.println("Successfully login:");
	}
	@Test(priority=2,description="Testcase to logout")
	public void signoff()
	{
		System.out.println("Successfully logOut:");
	}
}
