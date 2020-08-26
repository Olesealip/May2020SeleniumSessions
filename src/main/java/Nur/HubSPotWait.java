package Nur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSPotWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get ("https://app.hubspot.com/login/");
		WebDriverWait wait= new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("Olesika_22@yahopo.com");
		
		
		
		

	}

}
