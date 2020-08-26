package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickandSendKeys10and1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

	Thread.sleep(5000);
	By email=By.id("username");
	By password=By.id("password");
	By login= By.id("loginBtn");
	
//	Actions ac= new Actions(driver);
//	ac.sendKeys(getElement(email), "tom@gmail.com").perform();
//	ac.sendKeys(getElement(password), "tom@123").perform();
//	ac.click(getElement(login)).perform();

	doActionsSendKeys(email, "tom@gmail.com");
	doActionsSendKeys( password, "tom@123");
	doActionsSendKeys(email, "tom@gmail.com");
	 doActionsClick(login);
	
	
	Thread.sleep(7000);
	driver.quit();
	}
	//doactionsClick - says fine you give me the by locator and then i will click on a specific button

	public static WebElement getElement(By locator) {
		WebElement element= driver.findElement(locator);
				return element;
	}
	//generic method 
	public static void doActionsClick(By locator ) {
		Actions ac=new Actions(driver);
		ac.click(getElement(locator)).perform();
	}
		public static void doActionsSendKeys(By locator, String value ) {
		Actions ac=new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
		
		}
	}
	// what is difference between Actions class send keys and normal send keys 
//this method is different from webelements send keys, first it will go on the search bar and will perform action on it - it will enter the value on it 
//actions. clicknfirst it will come to login and then will click on login button 

//Actions does not have gettext method and isDisplay  . it is not an action we are just verifying something
//actions - means you have to click, pass something , right click, drog and drop 

