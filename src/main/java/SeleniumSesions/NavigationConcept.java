package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		//command+shift+o - all the imports will be generated 
		
		//back and forward button simulation 
		 driver.get("http://www.google.com"); 
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to ("http://www.amazon.com"); // .navigate().to ("http://www.amazon.com")is the same coman as .get (url)
		//.navigate().to- we can do back and forward 
		System.out.println(driver.getTitle());
     
		driver.navigate().back(); // it will go back to Google
    System.out.println(driver.getTitle());

    driver.navigate().forward();
  System.out.println(driver.getTitle());

  driver.navigate().back();
System.out.println(driver.getTitle());
	
	//refresh the browser:
	driver.navigate().refresh();
	}
}
