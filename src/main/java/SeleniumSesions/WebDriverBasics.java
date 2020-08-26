package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
static String  expectedTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","/Users/olesea/Downloads/chromedriver"); //this are configuration to launch Chrome 
		WebDriver driver= new ChromeDriver();//ChromeDriver- child class// you need to import because its coming from selenium// it should be refered by webDriver interface// WebDriver you have to import
	//oject here is - new ChromeDriver()
	//class is -ChromeDriver
	//driver- is object reference name from WebDriver
	//WebDriver - is an interface
	//WebDriver driver= new ChromeDriver();- this is top casting- child class object can be refered by parent interface reference  variable 
	//can i create an object of WebDriver ex : WebDriver driver= new WebDriver();? no, because WebDriver is an interface and we cannot create an object of an interface 
	//if you want to access google and launch the application and test in Chrome browser you have to go to google and download Chrome driver download
	
	driver.get("http://www.amazon.com");    //to open the URL
	
	String actiualTitle=driver.getTitle();   // ger the page title 
	System.out.println("page title is " + actiualTitle); //rs:page title is Google
	
	// i want to verify if the title is correct  this is called Verification point or checkpoint 
	// testing means expectedl vs actual result
	if (actiualTitle.equals( expectedTitle)) {
		System.out.println("Correct title");
	}
	else {
		System.out.println("Incorect title");
	} //rs: Correct title
	
	String url=driver.getCurrentUrl();
		System.out.println(url); //rs:https://www.google.com/?gws_rd=ssl
	
		//i want to validate if this url is correct or not 
		if(url.contains("Electronics"))
		{
			System.out.println("correct url");
			}
	//System.out.println(driver.getPageSource()); //get a page source
	//sortcut for to view page source option+comand+U
	//comand+f - to search the source code ,tags
		//method to pause your script 
		Thread.sleep(3000);  //3000milisecond = 3 sec // you have to right click to declare 
		 
		//method to close the browser
		driver.quit();
	}

}
//rs: Only local connections are allowed.
//Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
//ChromeDriver was started successfully.
//Jul 12, 2020 4:06:08 PM org.openqa.selenium.remote.ProtocolHandshake createSession
//INFO: Detected dialect: W3C
//page title is Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
//Correct title
//https://www.amazon.com/

