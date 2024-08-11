package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




		@RunWith(Cucumber.class)
		@CucumberOptions(features = "src/test/resources/Features",
		glue = {"Stepdefination"},
		monochrome = true,
		plugin = {"pretty", "html:target/Htmlcucumber.html"})
	//	tags = {"@SmokeTest,@EndtoEndTest"}
		
				//plugin = {"pretty", "junit:target/Htmlcucumber.xml"})



public class Testrunner {
	
	
	
			

}
