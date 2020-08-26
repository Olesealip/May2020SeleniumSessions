package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://skryabin.com/webdriver/html/quote.html");
		
       driver.findElement(By.id("attachment")).sendKeys("/Users/olesea/Downloads/200+ Selenium Interview Questions .docx");
       
       
	}

}
