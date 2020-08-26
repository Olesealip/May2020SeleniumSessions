package SeleniumSesions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fresh15and3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
	
		By footerLink = By.cssSelector("ul.footer-nav li a");

		ElementUtil8 elementUtil= new ElementUtil8(driver);
		List<WebElement> footerLinksList = elementUtil.visibilityOfAllElements(10,footerLink );
		System.out.println(footerLinksList.size());
	//we want to print all the text 
		for (WebElement ele : footerLinksList) { //we use for each loop
		System.out.println(ele.getText());	
		}
	
	
	}

}
