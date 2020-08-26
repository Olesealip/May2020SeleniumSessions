package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightClickNur {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
	Actions ac= new Actions(driver);
		ac.contextClick(rightClick).perform();
		
		List <WebElement> select =driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		
		for (int i= 0; i<select.size(); i++) {
		String list=	select.get(i).getText();
		
			System.out.println(select.get(i).getText());
			if (list.equals("Copy")) {
				select.get(i).click();
				
				break;
				
					
			}
				
			}
		String alertText= driver.switchTo().alert().getText();
		if(alertText.contains("copy")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
Thread.sleep(5000);
driver.quit();
}}
