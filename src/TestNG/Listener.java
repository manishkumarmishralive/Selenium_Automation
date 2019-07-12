package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase failed and testcase details are "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcase skipped and testcase details are "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testcase started and tescase details are "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase success and details are "+result.getName());
	}

}
