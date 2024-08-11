package TestP;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Orderingtestng {
	
	
	@Test(enabled = true)
	public void M1() {
		
		
		Assert.assertTrue(false);
		
		System.out.println("Clickiontabs");
	}
	
	
	@Test(priority = 1)
	public void M2() {
		
		System.out.println("verifylinks");
	}
	
	@Test(priority = 3)
	public void M3() {
		
		System.out.println("verifyheader");
	}
	
	@Test(groups = "SANITY")
	public void M4() {
		System.out.println("verifyheader");
	}
	
	@Test(dependsOnMethods = "M2")
	public void M5() {
		System.out.println("after execution of M2");
	}
	
	
	
	
	
	

}
