package TestP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngorder {
	
	
	@AfterClass
	public void mehtod7() {
		
		System.out.println("@afterclass");
	}
	
	
	@BeforeClass
	public void mehtod6() {	
		System.out.println("@beforeclass");
	}
	
	
	@BeforeMethod
	public void mehtod4() {
		
		
		System.out.println("@beforemethod");
	}
		
	@AfterTest
	public void Method1() {
				
		System.out.println("@aftertest");
		
	}
	
	@Test
	public void Method2() {
				
		System.out.println("@Test");
		
	}
	
	@BeforeTest
	public void Method3() {
				
		System.out.println("@beforetest");
		
	}
	
	@AfterMethod
	public void mehtod5() {
		
		
		System.out.println("@Aftermethod");
	}
	
	@AfterSuite
	public void mehtod8() {
		
		
		System.out.println("@AfterSuite");
	}
	
	@BeforeSuite
	public void mehtod9() {
		
		
		System.out.println("@BeforeSuite");
	}
	
	
	
	
	
	
	
	
	
	
	

}
