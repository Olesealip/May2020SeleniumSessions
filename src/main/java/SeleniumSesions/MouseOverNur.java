package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverNur {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/");

		WebElement content = driver.findElement(By.xpath("//*[@id=\'headermenudesktop\']/ul/li/a"));
		
	Actions ac= new Actions(driver);
	ac.moveToElement(content).perform();
		
	WebElement courses =driver.findElement(By.xpath("(//a[text()='Courses'])[last()]"));
	courses.click();
	
//	String beforeColor= content.getCssValue("color");
//
//	System.out.println(beforeColor);
//	ac.moveToElement(content).build().perform();
//	
//	String afterColor= content.getCssValue("color");
//	System.out.println(afterColor);
	
	
	
	
	
	tearDown();	
		
	
	}
	
	public static void  tearDown() throws InterruptedException {
		Thread.sleep(5000);	
		driver.quit();	
		
	}

}
