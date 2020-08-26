package Nur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SEleniumPractice {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
//	WebElement button =driver.findElement(By.xpath("//button[text() ='Copy Text']"));
//	
//	Actions ac= new Actions(driver);
//	ac.doubleClick(button).build().perform();
//String expected="Hello World!";
//WebElement text = driver.findElement(By.id("field2"));
//String actual=text.getAttribute("value");
//System.out.println(actual);
// 
//if(actual.equals(expected)) {
//	System.out.println("passed");
	
	WebElement button =driver.findElement(By.xpath("//button[text() ='Click Me']"));
	button.click();
	driver.switchTo().alert().accept();
}
	}


