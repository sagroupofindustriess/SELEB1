package TestP;

import org.testng.annotations.Test;

public class Threadsexample {
  @Test
  public void f() {
	  
	  
	  System.out.println("SATISH"+Thread.currentThread().getId());
	  
	  System.out.println();
	 
  }
  
  
  
  @Test
  public void f1() {
	  
	  
	  System.out.println("SAT"+Thread.currentThread().getId());
  }
}
