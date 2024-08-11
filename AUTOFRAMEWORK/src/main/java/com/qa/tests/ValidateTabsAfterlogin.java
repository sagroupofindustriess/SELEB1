package com.qa.tests;


import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.objrepo.Elementrepo;
import com.qa.utilities.Baseclass;
import com.qa.utilities.Commonfunctions;

public class ValidateTabsAfterlogin extends Baseclass {

	@BeforeTest
	public void setUp() {
		Initbrowser();
		Browserreqs("Login fiunctionalty and click on tabs");
		navigateurl();
		
	}

	@Test(description = "Login fiunctionalty and click on tabs")
	public void Validationoftabsafterlogin() throws InterruptedException {
		
		Commonfunctions.clickElement(Elementrepo.sigin);
		Commonfunctions.Settext(Elementrepo.username, properties.getProperty("Username"));
		Commonfunctions.Settext(Elementrepo.password, properties.getProperty("password"));
		Commonfunctions.clickElement(Elementrepo.loginbutton);
		Commonfunctions.Sleepforsometime(20);
		Commonfunctions.VerifyUI(Elementrepo.Welcometext, "Welcome, SATISH KUMAR!");
		Commonfunctions.clickElement(Elementrepo.whatsnewtab);
		Commonfunctions.clickElement(Elementrepo.womanstab);
		Commonfunctions.clickElement(Elementrepo.salestab);	
		Commonfunctions.clickElement(Elementrepo.logoutarrow);
		Commonfunctions.clickElement(Elementrepo.signoutlink);
	}

	@AfterTest
	public void tearDown() {
		
		driver.quit();	
	}
	
	

}
