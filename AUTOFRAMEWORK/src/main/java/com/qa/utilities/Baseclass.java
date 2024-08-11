package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Baseclass {

	public static WebDriver driver;
	public static Properties properties;
	public static WebDriverWait Wait;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest TEST;

	public Baseclass() {

		try {

			properties = new Properties();
			File file = new File("src//main//java//com//qa//config//Config.properties");
			FileInputStream config = new FileInputStream(file);
			properties.load(config);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@BeforeSuite
	public static void initreports() {
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("src//test//resources//REPORTS//ExtentReports.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Auto Test Reports");
		extent.attachReporter(spark);		
	}
	
	public static void Initbrowser() {

		String Browser = properties.getProperty("browser");

		switch (Browser) {
		case "FF":
			System.setProperty("webdriver.gecko.driver", "src//main//resources/Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "src//main//resources//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
	}

	public static void Browserreqs(String DESC) {

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// commenting this line because would to use explicit wait to save execution
		// time
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		TEST = extent.createTest(DESC);
		
	}

	public static void navigateurl() {

		driver.get(properties.getProperty("Application"));

	}
	
	
	@AfterSuite
	public static void fleshreports() {
		
		extent.flush();
		
	}

}
