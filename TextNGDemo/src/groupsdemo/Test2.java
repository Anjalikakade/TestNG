package groupsdemo;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups={"Regression"})
	public void testr1()
	{
		System.out.println("Regression testcase2");
	}
	@Test(groups={"Regression"})
	public void testr2()
	{
		System.out.println("Regression testcase3");
	}
	@Test(groups={"Regression"})
	public void testr3()
	{
		System.out.println("Regression testcase4");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("Smoke testcase4");
	}


}
