package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch firefox// we have to download geckodriver
	System.setProperty("webdriver.gecko.driver", "/Users/olesea/Downloads/geckodriver");
  WebDriver driver= new FirefoxDriver();
  
  driver.get("http://www.amazon.com");
  System.out.println(driver.getTitle());
  Thread.sleep(3000);
  driver.quit();
	}

}
