package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	//Headless means:
	//1.no browser getting open
	//2.testing is happening behind the scene .There is no browser , browser is not getting launch
    //3.fast
	//when we have to use headless mode ? when you are running on linux machine .on linux mashine there is no UI where the console application is available
	//whenever i want to executed on doker contener. or on jenkind
	
	//desadvantaje of headless: 
	//1.whenever you want to do a mouse over sometimes it wont work,
	//2. screenshot how will you take it
	//when you launch the browser that is called headed mode
	public  static void main(String[] args) {
		
		
		 String  expectedTitle= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
//		 WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co= new ChromeOptions(); 
//		co.addArguments("--headless");
//		
//// when you launch the driver driver equal to the new driver you have to pass co inside parantessis. It means - launch my browser with headless mode  
//	//then you run it the browser is not getting open and is very fast.			
//		
		 //WebDriver driver= new ChromeDriver(co);
//		driver.get("http://www.amazon.com");   
//		
//		String actiualTitle=driver.getTitle();  
//		System.out.println("page title is " + actiualTitle); 
//		
//	
//		if (actiualTitle.equals( expectedTitle)) {
//			System.out.println("Correct title");
//		}
//		else {
//			System.out.println("Incorect title");
//		} 
//		
//		String url=driver.getCurrentUrl();
//			System.out.println(url); 
//		
//			
//			if(url.contains("Electronics"))
//			{
//				System.out.println("correct url");
//				}
//		driver.quit();
		 
		 
		// for firefox browser 
		 
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo= new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver= new FirefoxDriver(fo);
		
		driver.get("http://www.amazon.com");   
		
	String actiualTitle=driver.getTitle();  
		System.out.println("page title is " + actiualTitle); 
	
	
		if (actiualTitle.equals( expectedTitle)) {
			System.out.println("Correct title");
		}
	else {
			System.out.println("Incorect title");
		} 
		
	String url=driver.getCurrentUrl();
		System.out.println(url); 
		
			if(url.contains("Electronics"))
			{
			System.out.println("correct url");
			}	
			driver.quit();
		 
		 
		 
		 
	}

}
