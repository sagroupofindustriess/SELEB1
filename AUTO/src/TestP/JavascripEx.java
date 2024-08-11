package TestP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascripEx {

	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {


		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("Scripts", "args");
		
		
		// click 
		
		js.executeScript("document.getElementById('myButton').click();");
		
		// Type 
		
		js.executeScript("document.getElementById('id').value = 'SATISH';");
		
		
		
		//Scrolling ------- > Window.scrllTo. Window.scrollBy ,   ScrollIntoview
		
		
		
		js.executeScript("Window.scrollTo(250, 0)");
		js.executeScript("Window.scrollBy(0,250)");
		js.executeScript("arguments[0].scrollIntoview", driver.findElement(By.id("cdcsdsc")));
 		
		
		
		
		
		
		
		

	}

}
