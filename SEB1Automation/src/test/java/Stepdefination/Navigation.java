package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation {
	
	
	public WebDriver driver;
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {

		System.out.println("I want to write a step with precondition");
		
		//Assert.assertTrue(false);
	}

	@And("some other precondition")
	public void some_other_precondition() {

		System.out.println("some other precondition");
	}

	@When("I complete action")
	public void i_complete_action() {

		System.out.println("I complete action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

		System.out.println("I validate the outcomes");
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
	}
	
	@Given("Navigate STH application")
	public void navigate_sth_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//alkumar//Music//Demo//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='authorization-link'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='send2'][1]")).click();
	}

	@And("Enter uname and password")
	public void enter_uname_and_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" xx@gmail.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("S$tish@123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='send2'][1]")).click();
	}

	@And("wait for some time to load the page")
	public void wait_for_some_time_to_load_the_page() throws InterruptedException {
		Thread.sleep(5000);
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		String ActualText = driver.findElement(By.xpath("//li[@class='greet welcome'][1]")).getText();
		String ExpectedText = "Welcome, SATISH KUMAR!";
		if(ActualText.equals(ExpectedText)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	 }

	@And("Validate home page")
	public void validate_home_page() {
		String ActualText = driver.findElement(By.xpath("//li[@class='greet welcome'][1]")).getText();
		String ExpectedText = "Welcome, SATISH KUMAR!";
		if(ActualText.equals(ExpectedText)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.quit();}

	@And("Enter {string} and {string}")
	public void enter_fname_and_fpwd(String uname, String pwd ) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys(pwd);
	}

	@When("validate error message")
	public void validate_error_message() {
	    
		System.out.println("Error message displayed");
		driver.quit();
		
		
	}

	
	
	
	
	
	
	
	

}
