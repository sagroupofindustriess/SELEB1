package Devdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Ereports {
	
	
  @Test
  public void f() {
	  
	  
	 ExtentReports extent = new ExtentReports();
	 ExtentSparkReporter  spark = new ExtentSparkReporter("C://Users//alkumar//Documents//SA Group of Industries//REPORTS//Reports1.html");
	 ExtentSparkReporter  sparkfail = new ExtentSparkReporter("C://Users//alkumar//Documents//SA Group of Industries//REPORTS//Reportsfailed.html").filter().statusFilter().as(new Status  [] {Status.FAIL}).apply();
	 spark.config().setTheme(Theme.DARK);
	 spark.config().setDocumentTitle("Automation Report");
	 spark.config().setReportName("Auto Test Reports");
	 
	 extent.attachReporter(spark, sparkfail);
	 
	 ExtentTest test1 = extent.createTest("Verify login fiunctionalty");
	 
	 test1.pass("pass");
	 ExtentTest test2 = extent.createTest("Verify home page fiunctionalty");
	 
	 test2.pass("pass");
	 test2.fail("failed");
	  extent.flush();  
	  
	 
  }
  
}
