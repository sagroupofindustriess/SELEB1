package TestP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//satish//Music//Demo//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));    //implicit wait 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));  //explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='username']")));
		
		try {
			
			driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");

			driver.findElement(By.cssSelector("[type='password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		
		
		

	}

}
