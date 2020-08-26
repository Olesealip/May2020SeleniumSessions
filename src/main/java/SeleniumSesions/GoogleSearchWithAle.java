package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchWithAle {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.google.com/");
		
		WebElement search =driver.findElement(By.name("q"));
		
		search.sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		
		List< WebElement> list =driver.findElements(By.xpath("//ul[@class='erkvQe']/li//span"));
		
	
		for (int i=0 ; i<list.size();i++) {
		
	String	listtext=list.get(i).getText();		
	System.out.println(listtext);	
	if (listtext.equalsIgnoreCase("selenium testing")) {
	System.out.println(listtext);	
	list.get(i).click();
	break;
		}
	
		
	}
		Thread.sleep(2000);
		
		driver.quit();
	}}
