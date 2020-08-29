package Nur;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinksPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.com");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	//for(int i=0; i < links.size(); i++) {
	for(WebElement each : links) {
	String text= each.getText();
	if(text.isEmpty()==false)
	
		System.out.println(text);
	}

	
	

	}

}
