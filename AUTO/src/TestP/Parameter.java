package TestP;

import org.testng.annotations.Parameters;

public class Parameter {
	
	
	
  @Parameters({"browser"})
  public void f(String browser) {
	  
	System.out.println(browser);
  }
}
