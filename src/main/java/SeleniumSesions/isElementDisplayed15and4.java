package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isElementDisplayed15and4 {
     static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		 driver.get("https://app.hubspot.com/login");

	
	By email=By.id("username");
	By password=By.id("password");
	By login= By.id("loginBtn");
	
	ElementUtil8  elementUtil= new ElementUtil8(driver, 10);
	System.out.println(elementUtil.isElementDisplayed(email,10));
	

	}

}
