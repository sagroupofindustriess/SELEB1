package Devdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(Log4j.class);

	public static void main(String[] args) throws InterruptedException {
		
		
		PropertyConfigurator.configure("C://Users//alkumar//Documents//SA Group of Industries//logg4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		log.info("Application was navigated");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		log.info("window was maximized");
		log.info("Uname provided");
		log.info("pwd proided");
		log.info("Clicked on button");
		
		
		driver.quit();
		
		
	}

}
