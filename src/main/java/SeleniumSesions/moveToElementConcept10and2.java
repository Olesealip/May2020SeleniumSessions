package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToElementConcept10and2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();

driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
Thread.sleep(5000);

	//we need mouse over on  content and then click courses //content-is a parent menu; courses- is a cjld submenu 
		
		WebElement menulink= driver.findElement(By.className("menulink"));
		
		Actions ac= new Actions(driver);
		
		ac.moveToElement(menulink).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		//WebElement chooseOptions =	driver.findElement(By.linkText("COURSES"));
		
		//chooseOptions.click();
		
	quit();
		
	}
public static void quit() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
//homework assigment: spicejet.com 
//this is a three level parent , child and subchild  
//go to login
//go nto spiceClub Members
//then mouse over on member login
//click on member login