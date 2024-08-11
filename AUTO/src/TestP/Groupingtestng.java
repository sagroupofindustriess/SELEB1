package TestP;

import org.testng.annotations.Test;

public class Groupingtestng {
	
  @Test(groups = "Regression")
  public void f() {
	  
	System.out.println("SATISH");
  }
  
  
  @Test(groups = "sanity")
  public void f1() {
	  
	System.out.println("KUMAR");
  }
  
  
  
  //Group.xml will be the example testng.xml file to run this example
  
  
}
