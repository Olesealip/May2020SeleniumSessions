package SeleniumSesions;

import java.util.List;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch9and1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		 driver.findElement(By.name("q")).sendKeys("Selenium"); //when you enter the SElenium in search field you get a list of selenium.we have to select selenium python  , first we have to collect the entire list 
		//how you collect ? go to inspect ,check in which list is coming , the are coming inside ul box ,  under the dev and span we have selenium. we will create one parent and child xpath
//it means we are getting elements from entire Box.class span is indirect child of div 
	 Thread.sleep(3000);
		 List<WebElement> sugestionsList= driver.findElements(By.xpath("//ul[@class='erkvQe']/li//span"));
	System.out.println(sugestionsList.size());
	for(int i=0; i<sugestionsList.size(); i++) {
		if(sugestionsList.get(i).getText().equals("selenium python")){
			sugestionsList.get(i).click();
			break;
		}
		//homework :
		//1.create a generic method to select a single value from the list .
		//2. capture all the suggestions in the list and return 
	}//we have to create a generic method and pass a number of values, i want to see what is sugestion list , i want to capture the suggestion list and i want to capture in array list 
	//and then return an array list 
	
	//automationpractice.com/index.php
	//enter the value
	//get the list 
	//then match the specific value  click on it 
	
	
	}

}
