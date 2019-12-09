package TestScripts;

import org.testng.annotations.*;

public class TestClass {

	@Test(groups = {"Smoke"})
	public void testCase3() {
		System.out.println("in test case 3");
	}	
	
	@Test(groups = {"Sanity"})
	public void testCase1() {
		System.out.println("in test case 1");
	}	
	
	// test case 2
	@Test(groups = {"Regression", "Sanity"})
	public void testCase2() {
		System.out.println("in test case 2");
	}

	

}
