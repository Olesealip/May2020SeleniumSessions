package com.myTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

WebDriver driver;
	String browserName = "chrome";

	@Parameters("browser")

	@BeforeMethod
	
	public void setup(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browser....");
		}

		driver.get("https://app.hubspot.com/login");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("Hubspot Login"));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	
	
	
	
	@AfterMethod
	
	public void tearDown () {
		
		driver.quit();
	}


	
	}





