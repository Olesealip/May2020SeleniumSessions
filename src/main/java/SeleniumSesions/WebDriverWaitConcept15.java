package SeleniumSesions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept15 {

	public static void main(String[] args) throws InterruptedException {
	
		//WebDriverWait - is a class, which is extending fluentWait class is implimenting wait interface 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get(" http://www.amazon.com");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);//maximum i can wait 10 sec but what is the condition ? //below is generic method
		
		//condition: wait until your expected condition title contains HubSpot Login
		//wait.until(ExpectedConditions.titleContains("HubSpot Login")); //titleContains("HubSpot Login"))- you dont need to enterr the full string of the title //bellow is generic method 
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));//titleIs- you have to enter the exact name of the title 
		
		//String title= doGetPageTitle(driver, 10, "HubSpot Login");
		
		String title= doGetPageTitleWithContains(driver, 10, "amazon");
		
		System.out.println(title );
		
		//we will create one generic method out of this: 2
		//WebDriverWait wait= new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.urlContains("amazon"));
		System.out.println(doGetPageCurentUrl(driver, 5, "amazon"));
	
		Thread.sleep(3000);
	driver.quit();
	}
//generic method :
	
	public static String doGetPageTitleWithContains(WebDriver driver, int timeOut, String title ) {
		WebDriverWait wait= new WebDriverWait(driver, timeOut) ;
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public static String doGetPageTitle(WebDriver driver, int timeOut,String title) {
		WebDriverWait wait= new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	//2
	public static String doGetPageCurentUrl(WebDriver driver, int timeOut, String urlValue ) {
		WebDriverWait wait= new WebDriverWait(driver, timeOut) ;
		wait.until(ExpectedConditions.urlContains(urlValue ));
		return driver.getCurrentUrl();
	 
	
}}


