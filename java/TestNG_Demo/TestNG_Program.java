package TestNG_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Program {
	
	
// priority
//	Enabled
//	invocationCount
//	alwaysRun
	
	
	@Test(alwaysRun = true)
	public void m1() {
		System.out.println("m1 Test");
	}
	
	@Test
	public void m2() {
		System.out.println("m2 Test ");
	}
		
	@Test
	public void m3() {
		System.out.println("m3 Test");
	}
	
	@Test
	public void m4() {
		System.out.println("m4  Test");
	}
	
	@Test
	public void m5() {
		System.out.println("m5 Test");
	}
	
	@Test
	public void m6() {
		System.out.println("m6 Test");
	}
	@Test
	public void m7() {
		System.out.println("m7 Test ");
	}
	
	@Test
	public void m8() {
		System.out.println("m8 Test ");
	}	
}
