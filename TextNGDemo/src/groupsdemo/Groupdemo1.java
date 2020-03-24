package groupsdemo;

import org.testng.annotations.*;

public class Groupdemo1
{
	@Test(groups={"smoke"})
	public void test1()
	{
		System.out.println("smoke testcase1");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("smoke testcase2");
	}
	@Test(groups={"smoke"})
	public void test3()
	{
		System.out.println("smoke testcase3");
	}
	@Test(groups={"Regression"})
	public void testr1()
	{
		System.out.println("Regression testcase1");
	}


}
