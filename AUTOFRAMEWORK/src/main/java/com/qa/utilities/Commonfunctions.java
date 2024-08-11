package com.qa.utilities;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.objrepo.Elementrepo;

public class Commonfunctions extends Baseclass {
		
	public static WebElement getobject(Elementrepo element) {

		WebElement finalelement = null;
		switch (element.getType()) {
		case "XPATH":
			finalelement = Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element.getlocater())));
			break;
		case "ID":
			finalelement = Wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element.getlocater())));
			break;
		case "NAME":
			finalelement = Wait.until(ExpectedConditions.presenceOfElementLocated(By.name(element.getlocater())));
			break;
		case "CLASSNAME":
			finalelement = Wait.until(ExpectedConditions.presenceOfElementLocated(By.className(element.getlocater())));
			break;
		}
		return finalelement;
	}
	
	public static void clickElement(Elementrepo element) {
		if (getobject(element).isDisplayed()) {
			getobject(element).click();
			TEST.pass(element.getDescription()+" Clicked successfully");			
		}
	}
	
	public static void Settext(Elementrepo element, String Text) {
		if (getobject(element).isDisplayed()) {
			getobject(element).sendKeys(Text);
			TEST.pass(Text +" Typed successfully in "+element.getDescription()+" Text box");
		}
	}
	
	public static void VerifyUI(Elementrepo element, String ExpectedValue) {
		if (getobject(element).isDisplayed()) {
			if (getobject(element).getText().equalsIgnoreCase(ExpectedValue)) {
				assertTrue(true, ExpectedValue + "Matched with "+getobject(element).getText()+" availble from the UI");
				TEST.pass("Expacted and Actuall Text are maching");
			} else {
				assertTrue(false, ExpectedValue + "Not matched with "+getobject(element).getText()+" availble from the UI");
				TEST.fail("Expacted and Actuall Text are not maching");
			}
		}
	}
	
	public static void Sleepforsometime(int time) throws InterruptedException {
		Thread.sleep(time*1000);
	}

		
	}
	
