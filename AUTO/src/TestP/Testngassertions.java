package TestP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngassertions {
	
	
	 public WebDriver driver;
	
	@BeforeClass
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
	}
		
	@Test
	public void validateloginurl() throws InterruptedException {
		
		String actualvalue =  driver.getTitle();
		String expectedvalue = "https://magento.softwaretestingboard.com";
		Assert.assertEquals(actualvalue, expectedvalue);
	
	}
	
	@AfterClass
	public void close() {
         driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
