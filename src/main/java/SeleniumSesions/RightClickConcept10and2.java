package SeleniumSesions;
// in html language right click is called context menu 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept10and2 {

	public static void main(String[] args) throws InterruptedException {
		
		//we want to click pn right click and captrure all the value of the right click 
		WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

WebElement rightClickMe=driver.findElement(By.xpath("//span[text()='right click me']"));

// we have to do right click
Actions ac= new Actions (driver);
ac.contextClick(rightClickMe).perform();
// interview question: how will you do right click? there is no right click method available in selenium , we have context method - its called right click 

//after we have to capture a list of elemts ; we have to use findElements and we have to capture all the list ofn available ul
	
	//ul/        //  "/"- single slash because is direct child of ul tag , i want to capture all the six elements which is available not 7 . after 6 elent there is horizontal line 
//which is called sepaerator line is also web element i want to avoid this separator line 
//so in x path we can exclud thid element by using contains function parantesis @ class coma
	
	
Thread.sleep(4000);	
List<WebElement> rightClickOptions= driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"
		+"/li[contains(@class, 'context-menu-icon')]"));	
System.out.println(rightClickOptions.size()); //rs: 6

for (int i =0; i <rightClickOptions.size(); i++ ) {
	
	//first we want to capture the text 
	String text= rightClickOptions.get(i).getText();  // get i - first element . get text . Gettext will give me String so i will store in the string variable 
	
	//then printed on the console 
	System.out.println(text);
	
	//we have to click on copy 
	if(text.equals("Copy")) {
		rightClickOptions.get(i).click();
	break;
		
	}
		
	//Assignment :create a generic method out of it , first you have to pass the value and inside the method you have to create the list . 
	
	
	
	
}
	
	
	Thread.sleep(5000);
	driver.quit();
	
	
	}
	

}
