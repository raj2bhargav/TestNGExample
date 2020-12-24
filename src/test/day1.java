package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test(groups= {"Smoke"})
	public void firstTest() {
		System.out.println("First Test");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second Test");
		Assert.assertTrue(false);
	}
	
	

}


