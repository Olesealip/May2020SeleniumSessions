package SeleniumSesions;
//this is called utility class - will be common this class for all the application

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author olesea
 *
 */
public class WebDriverFactory {
	
	WebDriver driver;//reference was created 
	
	//i will give you browser you return to me driver
	
	/**                        
	 * This method is used to launch the browser on the basis of given browser name 
	 * @param browser
	 * @return driver
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("browser value is "+ browser) ;
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();//it is to set up chromeDriver.exe file
			 driver = new ChromeDriver(); //launch the browser
			}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			}
		else if (browser.equalsIgnoreCase("Safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver= new SafariDriver();
			}
		else {
			System.out.println("Please pass the correct browser " + browser);
		}
		return driver;
	}
	
	/**
	 * This is used to launch url
	 * @param url
	 */
	public void launchUrl(String url) {
	driver.get(url);
	}
	
	/**
	 * this is used to get page title
	 * @return page title 
	 */
	public String getPageTitle() {
		return driver.getTitle();
		}
	
	/**
	 * This page is used to get current url
	 * @return current url
	 */
	public String getPageCurentUrl() {
		return driver.getCurrentUrl();
		}
	/**
	 * this will close the browser
	 */
	
	public void closeBrowser() {
	driver.quit();
	
	}
	
	
	
	
	
	
	

	

}
