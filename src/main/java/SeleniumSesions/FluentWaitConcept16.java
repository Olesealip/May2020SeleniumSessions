package SeleniumSesions;
//whae we design frameworkwe should avoid using implicity w cvbm,.;lkiuytrewq		q4567890-[=ait 
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept16 {

	public static void main(String[] args) {
		//fluent wait --- is dynamic excplicitly wait 
  // a.we can define our timeOut
		//b.polling period 
		//if any exception is comming  you can write please ingnore the exception  
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http:/classic.crmpro.com/");
	
		By username=By.name("username");
		By password= By.name("password");
		By loginButton= By.xpath("//input[@value='Login']");
		
//		//fluent wait is a class which internali is  implimenting wait interface 
//		Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
//		                      .withTimeout(Duration.ofSeconds(15)) //what is a maximum timeout you have to wait on that 
//		                      .pollingEvery(Duration.ofSeconds(3)) // how many time will go in there 5 times 15/3
//	                          .ignoring(NoSuchElementException.class); //if you are finding any exception write ingnoring this particular exception//add  unimplemented method  
//
//		wait.until(new Function<WebDriver,WebElement>(){
//		
//			@Override
//			public WebElement apply(WebDriver driver) {
//				
//				return driver.findElement(By.name("username"));
		//driver.findElement(username).sendKeys("batchautomation");//we used fl
			
		waitForElementWithFluentWait(driver, username, 10).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginButton).click();
			} 
	public  static WebElement  waitForElementWithFluentWaitConcept(WebDriver driver, By locator, int timeOut ) {
		Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15)) //what is a maximum timeout you have to wait on that 
                .pollingEvery(Duration.ofSeconds(3)) // how many time will go in there 5 times 15/3
                .ignoring(NoSuchElementException.class); //if you are finding any exception write ingnoring this particular exception//add  unimplemented method  
return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	//generic method 
			public  static WebElement  waitForElementWithFluentWait(WebDriver driver, final By locator, int timeOut ) {
				Wait<WebDriver>wait = new FluentWait<WebDriver>(driver)
		                .withTimeout(Duration.ofSeconds(15)) //what is a maximum timeout you have to wait on that 
		                .pollingEvery(Duration.ofSeconds(3)) // how many time will go in there 5 times 15/3
		                .ignoring(NoSuchElementException.class); //if you are finding any exception write ingnoring this particular exception//add  unimplemented method  

				WebElement element = wait.until(new Function<WebDriver,WebElement>(){

		@Override
		public WebElement apply(WebDriver driver) {
			
			return driver.findElement(locator);	
		}
		});
				return element;
		}
}