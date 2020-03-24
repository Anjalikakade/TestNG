package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationsDemo implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) 
	{
		System.out.println("Test cases Started and test case name is:"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test cases failure and test case name is:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test cases Skipped and test case name is:"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		System.out.println("Test cases Success and test case name is:"+result.getName());
	}

}
