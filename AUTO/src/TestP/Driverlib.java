package TestP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Driverlib extends Objrepo{
	
	public static WebDriver driver;
	
	static void openbrowser(String Browser) {
	
		switch (Browser) {
		case "FF":
			System.setProperty("webdriver.gecko.driver", "C://Users//alkumar//Music//Demo//geckodriver.exe");
			driver =  new FirefoxDriver();
			break;
			
		case "CHROME":	
			System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}									
	}
	
	static void navigatetourl(String url) throws InterruptedException {
		
		try {
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void loginHRM() throws InterruptedException {
		
		driver.findElement(By.cssSelector(uname)).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(pwd)).sendKeys("admin123");
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		driver.quit();		
	}
	
	
	public static void loginSTB() throws InterruptedException {
		
		driver.findElement(By.xpath("//li[@class='authorization-link'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" xx@gmail.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("S$tish@123");
		driver.findElement(By.xpath("//button[@id='send2'][1]")).click();
		Thread.sleep(3000);
		
		String ActualText = driver.findElement(By.xpath("//li[@class='greet welcome'][1]")).getText();
		
		String ExpectedText = "Welcome, SATISH KUMAR!";
		
		if(ActualText.equals(ExpectedText)) {
			
			Assert.assertTrue(true);
			//System.out.println("Test case passed");
		} else {
			Assert.assertTrue(false);
			//System.out.println("Test case failed");
		}
		
		driver.quit();						
	}

	public static void main(String[] args) throws InterruptedException {
		
		openbrowser("CHROME");
		navigatetourl("https://magento.softwaretestingboard.com/");
		loginSTB();	
		
		//loginHRM();
		//loginSTB();
			
	}

}
