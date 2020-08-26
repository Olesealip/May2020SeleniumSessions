package SeleniumSesions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaiConcept14 {

	public static void main(String[] args) {
	
		
		//the problem with Thread.sleap(5000)- it is static wait// it wiil pose the script for 5 sec .
		//thread-is a class ; sleep is a method 
//Thread.sleep(is very risky what if tomorow this application is taking more time );
		
		
		//dynamic waits :
		//1.Implicitly wait - it is global wait  it is only applied  for webelemnts . global - means by default will be applied for all webelements .When you design a framework you shoud forget about implicity wait 
		//2.Explicit wait
		   //2.a WebDriverWait - we have to use as a class
		   //2.b FluentWait-we have to use as a class
		
		
		//Implicitly wait you have to apply globaly
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // this wait is dynamic- it means when you launch url is taking around 5 sec  of time but the maximum time is 15 sec  . if element is found in 5 sec then rest of 10 sec will be ignored 
		//if teh elemnt is not found in 15 sec it will throw an exception no such element
		driver.get(" http://www.hubspot.com/login");
		System.out.println(driver.getTitle());//rs: Checking browser - that is not correct title implicitly wait didn't apply for title because its not webElement //title is not webElement is a browser property .
	driver.findElement(By.id("username")).sendKeys("testnaveen");
	
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); //we can overrite  implicitly wait //- for the next web elemnts will wait for 6 sec 
	driver.findElement(By.id("password")).sendKeys("privet");
	
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);// - nullify implicitly wait //- i don't want to apply any implicitly wait 
	driver.findElement(By.id("loginBtn")).click();
	
	
	
	}

}
