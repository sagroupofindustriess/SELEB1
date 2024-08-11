package TestP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoclass {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. lOGIN
		// 2. CLICKING ON TABS
		// 3. VERIFY THE CONTENTS FROM DASHBOARD 
		// 4. LOGOUT
		
		
		//login
		//cliks
		//logout
		
		System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Timesheets']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Timesheets ']")).click();
		driver.findElement(By.xpath("//span[text()='Reports ']")).click();
		driver.findElement(By.xpath("//a[text()='Project Reports']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		//driver.quit();
		
	}

}
