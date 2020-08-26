package com.myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	

	
	
	@Test
	 public void crmHomePageTest(){
		
     doLoginMethod();
     
	Assert.assertEquals(driver.getTitle(),"HubSpot Login");
	}

public void doLoginMethod() {
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleIs("Hubspot Login"));
	driver.findElement(By.id("username")).sendKeys("shukurlunurlan@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Test@7221213");
	driver.findElement(By.id("loginBtn")).click();
}
		
	}
	
	//CRMPRO  - CRM software for customer relationship management, sales, and support.] but found [CRMPRO - CRM software for customer relationship management, sales, and support.]


