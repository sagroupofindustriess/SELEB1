package TestP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "PATHto driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/demo_page");
		
		Actions actionobj =  new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//input[@id='myTextInput']"));
		//SATISH -----> SHIDT DOWN + satish + SHIFT UP
		
		//action i  ---- > build.perform
		
//Interview question ----> Build+perform = create a chain of actions +Execute 

		//Typing a word In a text box.
		actionobj.sendKeys(ele, "SATISH").build().perform();
		
		actionobj.keyDown(Keys.SPACE).keyUp(Keys.SPACE).build().perform();
		
		//Type capital letters
		actionobj.keyDown(Keys.SHIFT).sendKeys(ele, "kumar").keyUp(Keys.SHIFT).build().perform();
		
		// Typing a word with out obj ref.
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		actionobj.keyDown(Keys.SHIFT).sendKeys("kumar").keyUp(Keys.SHIFT).build().perform();
		
		
		WebElement mouseover = driver.findElement(By.xpath("//div[@id='myDropdown']"));
		WebElement clickobk = driver.findElement(By.xpath("//button[@id='myButton']"));
		WebElement rightclik = driver.findElement(By.xpath("//h2[text()='SeleniumBase']"));
		
		
		actionobj.moveToElement(mouseover).build().perform();
		actionobj.click(clickobk).build().perform();
		Thread.sleep(3000);
		
		actionobj.doubleClick(clickobk).build().perform();
		actionobj.contextClick(rightclik).build().perform();
		actionobj.dragAndDrop(clickobk, rightclik);
		actionobj.click(rightclik);

	}

}
