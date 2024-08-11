package TestP;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
	
	
	@Test
	public void excerr() {
	
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter  sprk = new ExtentSparkReporter("C://Users//alkumar//Documents//SA Group of Industries//REPORTS//Report.html");
		sprk.config().setTheme(Theme.DARK);
		sprk.config().setDocumentTitle("MyReport");
		sprk.config().setReportName("reports");
		
		
		
		extent. attachReporter(sprk);
		
	
		ExtentTest Test = extent.createTest("MyFirstTest");
		Test.pass("pass");
		
		
		ExtentTest Test1 = extent.createTest("Second Tst");
		Test1.pass("pass");
		
		extent.flush();
		
		
	}
		

	

}
