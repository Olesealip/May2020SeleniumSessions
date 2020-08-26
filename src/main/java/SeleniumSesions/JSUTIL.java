package SeleniumSesions;
//what are the different ways of getting the title?
//one is using driver.getTitle(); and another by using javascript - document.title 

//how you refresh the webpage ? using driver.navigate. refresh or 
//history.go(0);- in javascript means refresh the webpage  

//to fetch all the text from the webpage ?
//document.documentElement.innerText 

//how many browsers are running on my laptop ?
//  navigator.userAgent 

//while executing highliht specific element ?




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSUTIL {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://classic.crmpro.com/");

	JavaScriptUtil jsUtil= new JavaScriptUtil ();
	
	
	
	
	
	
	}
	

}
