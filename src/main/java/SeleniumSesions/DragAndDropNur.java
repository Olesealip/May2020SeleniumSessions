package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropNur {
	static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

	
	
	
	
WebElement source=	driver.findElement(By.id("draggable"));
WebElement target= driver.findElement(By.id("droppable"));
			
	
	Actions ac=new Actions(driver);
	//ac.dragAndDrop(source, target).build().perform();
	
	ac.clickAndHold(source).moveToElement(target).release().perform();
	
	
	
	}

}
