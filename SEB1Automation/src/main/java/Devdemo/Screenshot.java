package Devdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='authorization-link'][1]")).click();
		Thread.sleep(5000);
		TakesScreenshot screnobj = ((TakesScreenshot)driver);
		File file = screnobj.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Users//alkumar//Documents//SA Group of Industries//New Bitmap image.bmp");
		FileUtils.copyFile(file, dest);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" xx@gmail.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("S$tish@123");
		driver.findElement(By.xpath("//button[@id='send2'][1]")).click();
		Thread.sleep(3000);
	
		
		
		
	
	}


}
