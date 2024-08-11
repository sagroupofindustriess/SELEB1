package TestP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "path to driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:/Users/satish/Documents/SA%20Group%20of%20Industries/HTMLS/child%20window.html");
		driver.navigate().to("Sitelink");  //will not wait till page load
		driver.findElement(By.xpath("//a[text()='Click here to open the child window']")).click();
		Thread.sleep(3000);
		
		
		String parentwindow = driver.getWindowHandle();   //window name 
		System.out.println(parentwindow);
		Set<String> S = driver.getWindowHandles(); // opned windown names 
		System.out.println("windows opned fr this session"+S);
		
		Iterator<String> i = S.iterator();
		while(i.hasNext()) {
		  
		  String childwindow = i.next();
		  if(!parentwindow.equalsIgnoreCase(childwindow)) {
			  
			  driver.switchTo().window(childwindow);    // switching focus from parent to child 
			  String text = driver.findElement(By.xpath("//a[@id='error-information-button']//preceding::span[1]")).getText();
			  Thread.sleep(3000);
			  System.out.println(text);
			  
		  }
		  driver.switchTo().window(parentwindow);   
	  }
		
		//driver.switchTo().alert().accept();      to click ok in pop window
		
		//driver.switchTo().alert().dismiss();     to click cancel in pop window
		
		driver.close(); //current cuurent of browser; 
		driver.quit();  /// close all driver instances 
		
	}}
