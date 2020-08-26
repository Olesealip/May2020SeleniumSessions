package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
//WebDriver driver= new ChromeDriver();
//driver.get("http://www.amazon.com");
//System.out.println(driver.getTitle());
//Thread.sleep(3000);
//driver.quit();
		
	//Firefox to get launched:	
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new FirefoxDriver();
		//driver.get("http://www.amazon.com");
		//String actualTitle=driver.getTitle();
		//System.out.println("The title is : "+ actualTitle);
		//Thread.sleep(3000);
		//driver.close();
		
		//Safari to get launched:
		
		WebDriverManager.getInstance(SafariDriver.class).setup();
		WebDriver driver= new SafariDriver();
		driver.get("http://www.amazon.com");
		String actualDriver= driver.getTitle();
		System.out.println(actualDriver);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
