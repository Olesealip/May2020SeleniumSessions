package Nur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
   
		WebElement slider= driver.findElement(By.xpath("//div[@id='slider']"));
	Actions action= new Actions(driver);
	action.clickAndHold(slider).moveByOffset(624,522).release().build().perform();
	slider.click();
	
	
		
		
		
		
		
	}

}
