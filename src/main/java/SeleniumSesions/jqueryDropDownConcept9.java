package SeleniumSesions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueryDropDownConcept9 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	
			Thread.sleep(5000);
		//to see all the option we have to click on 
			//then only all this drop down value will be visible
			driver.findElement(By.id("justAnInputBox")).click();
			
			//we have to collect all this elements together
	// so we will use the ccs selector.when you write css selector - you simple write tag name.class name 		

	//	List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle")); //findElements- create a list
	
//	for(int i=0; i<choiceList.size(); i++ ) {
//		
//		String text= choiceList.get(i).getText(); 
//		System.out.println(text);
//		if(text.equals("choice 2")) {
//			choiceList.get(i).click();
//		break;	
//		}
//	}
		
			By allChoices=	By.cssSelector("span.comboTreeItemTitle");
		
		//this code is not very useful i have to call this	method again and again with different values 
	
	//	selectChoiceValues(allChoices, "choice 2 2" );	
	//	selectChoiceValues(allChoices, "choice 6" );	
	//	selectChoiceValues(allChoices, "choice 7" );
	//}
	
	//public static void selectChoiceValues(By locator, String value) { 
	//	List<WebElement> choiceList = driver.findElements(locator);
	//	for(int i=0; i<choiceList.size(); i++ ) {
			
	//		String text= choiceList.get(i).getText(); 
	//		System.out.println(text);
	//		if(text.equals(value)) {
	//			choiceList.get(i).click();
	//		break;	
	//		}
		//there are 3 scenarios:
		//1. single value selection (selectChoiceValues(allChoices, "choice 2 2" );- this scenario works perfect )
		//2.multiple values selection - to solve this problem we will use ...operators
			
		//you have to create the locators inside the main method 	
	
			//selectChoiceValues(allChoices, "choice 2 2" );
			selectChoiceValues(allChoices, "choice 2 2" ,"choice 6 2", "choice 7" );
			//selectChoiceValues(allChoices, "all");
		Thread.sleep(5000);
			driver.quit();
	}
	//create a generate method 
	
	public static void selectChoiceValues(By locator, String... value) { //String... value- this String will behaive as an array
		List<WebElement> choiceList = driver.findElements(locator);
		
		if(!value[0].equalsIgnoreCase("All")) {
		for(int i=0; i<choiceList.size(); i++ ) {
			String text= choiceList.get(i).getText(); 
			System.out.println(text);
			
			for(int k =0; k<value.length ; k++) {
				if(text.equals(value[k])) {//if whatever value you have capture equals 
			choiceList.get(i).click();
			break;
			}
			
			}
	}	
		
	}
		//select all the values
else {
	try {
		for(int all=0; all<choiceList.size();all++) {
			choiceList.get(all).click();
		}
	}
		catch(Exception e) {
	  }
	}
	
 }
}
