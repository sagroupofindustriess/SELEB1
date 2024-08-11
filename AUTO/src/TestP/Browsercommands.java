package TestP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browsercommands {
	
	
	//get, navifate.to
	// close, quit
	//select

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://Users//satish//Music//Demo//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		WebElement ele =  driver.findElement(By.xpath("//select[@id='mySelect']"));
		Select sectobj = new Select(ele);
		sectobj.selectByValue("100%");
		Thread.sleep(2000);
		sectobj.selectByIndex(2);
		Thread.sleep(2000);
		sectobj.selectByVisibleText("Set to 50%");
		
		boolean flag = ele.isDisplayed();
		boolean flag1 =   ele.isEnabled();  
		System.out.println(flag);
		System.out.println(flag1);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		WebElement ele1 =  driver.findElement(By.xpath("//button[text()='Click Me!']"));
		
		boolean flag2 = ele1.isDisplayed();
		
		boolean flag3 =   ele1.isEnabled(); 
		
		boolean flagh = ele.isSelected();
		
		
		System.out.println("Ele displayed   "+flag);
		
		System.out.println("Ele enabled   "+flag1);
		
		
		driver.switchTo().defaultContent();
		
		
	}

}
