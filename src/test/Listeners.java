package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed!");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed!!!");
	}
	
}