package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts4 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
// create an WebElement and then perform an action on it 
		//WE+ click
		//WE+sendKeys
		//WE+getText
		// how we create an WebElement? we need to use the method . findElement(By)//(By)-locator By- class
		
//1. By Id	
	//driver.findElement(By.id("username")).sendKeys("Olesea@gmail.com"); //email address
	//driver.findElement(By.id("password")).sendKeys("portnov123"); //password
	//driver.findElement(By.id("loginBtn")).click(); //log in button
	
		//or by Id different 
	//WebElement email=driver.findElement(By.id("username"));
	//WebElement password=driver.findElement(By.id("password"));
	//WebElement loginButton=driver.findElement(By.id("loginBtn"));
	
    //email.sendKeys("Olesea@gmail.com");	
	//password.sendKeys("portnov123");
	//loginButton.click();
	
	
		//3. approach with the help of locators 
		//we cannot perform any actions (click, sendKeys) on By locators we need WebElements always 
    //with By locators you will not get any exception
    //By email=By.id("username"); 
    //By password=By.id("password");
   //By loginButton =By.id("loginBtn");

   //how we create WebElements out of By locators
   //driver.findElement(email).sendKeys("Olesea@gmail.com");
   //driver.findElement(password).sendKeys("portnov123");
   //driver.findElement(loginButton).click();

   //getElement(email).sendKeys("Olesea@gmail.com");
   //getElement(password).sendKeys("portnov123");
    //getElement(loginButton).click();
   ////
   //doSendKeys(email,"Olesea@gmail.com" );
   //doSendKeys(password,"portnov123" );
   //doClick(loginButton);	
   
//2. by name : 
		//driver.findElement(By.name("username")).sendKeys("Olesea@gmail.com");
		
//3. BY className: //you cannot usemultiple classes together
		//driver.findElement(By.className("login-email")).sendKeys("Olesea@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("portnov123");
	
//4. by  xpath
		//you inspect the element , right click on a tag (input ), go to copy ,select copy xpath

		//	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Olesea@gmail.com");  ////*[@id="username"]- insed of double quots you have to use single quots 
       //	driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("portnov123");  ////*[@id="username"]- insed of double quots you have to use single quots 

		
//5. by cssSelector:
		//you inspect the element , right click on a tag (input ), go to copy ,select copy selector 
       //	driver.findElement(By.cssSelector("#username")).sendKeys("Olesea@gmail.com");
       //	driver.findElement(By.cssSelector("#password")).sendKeys("portnov123");
       //	driver.findElement(By.cssSelector("#loginBtn")).click();

	
		
//6. by linkText: only for links: // if its a link on a page should be assosiated with a tag // for sign up 
		//driver.findElement(By.linkText("Sign up")).click();
	
	
//7. by partialLinkText: only for links
		//driver.findElement(By.partialLinkText("Sign ")).click();	
		
		//the problem : one sign up other sign in 
		
		
//8. by tagName
	}
	//i will create generated method: you give me the By locator i will give you the WebElement
	/**
	 * This method is used to create WebElement on the basis of giving By locator
	 * @param locator
	 * @return
	 */
	
	
	public static WebElement getElement(By locator) {
		WebElement element= driver.findElement(locator);
		return element;
	}
	//create custom function for actions 
public static void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}
public static void doClick(By locator) {
	getElement(locator).click();

}
}
