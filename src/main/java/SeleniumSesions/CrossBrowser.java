package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String browser="safari"; //"firefox";- in which browser you want your script to be executed
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/olesea/Downloads/chromedriver"); //this are configuration to launch Chrome 
			 driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/olesea/Downloads/geckodriver");
			  driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("please pass the correct browser name "+browser);
		}
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
//String browser="safari";// you have to enable allow remote automation in develop bar 
}
