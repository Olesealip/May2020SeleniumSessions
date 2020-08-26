package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForWebElements15and1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get(" http://www.hubspot.com/login");

By email= By.id("username");
By password= By.id("password");
By rememberMe = By.id("checkbox-content-4");
By login= By.id("loginBtn");

//below we created generic method 
//WebDriverWait wait = new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.presenceOfElementLocated(email));

//waitForEmement(driver, 10, email).sendKeys("Olesika_22@yahoo.com");

////driver.findElement(email).sendKeys("Olesika_22@yahoo.com");
//driver.findElement(password).sendKeys("privet");
//driver.findElement(rememberMe).click();
//driver.findElement(login).click();

WebDriverWait wait= new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(login)).click(); 
//we can use for alert 

Thread.sleep(5000);	
driver.quit();	
	}
	//generic method 
	public static WebElement waitForEmement( WebDriver driver, int timeOut, By locator) {
	WebDriverWait wait= new WebDriverWait(driver, timeOut);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	
	
	}
	

}
