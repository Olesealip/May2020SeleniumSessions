package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks5and2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
List <WebElement> langlinks=  driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
	System.out.println(langlinks.size());
	
	//The requierments you have to click each and every link one by one .
	for(int i = 0; i<langlinks.size(); i++) {
		langlinks.get(i).click(); //go to specific link i and do click.
		
		//everytume yo have to create a new list of links
		langlinks=  driver.findElements(By.xpath("//*[@id='SIvCob']/a"));//you update your list ones again
	}
	
	
	
	
	
	}

}
