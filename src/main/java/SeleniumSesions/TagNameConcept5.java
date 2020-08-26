package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept5 {
	
	public static void main (String [] args) {
 WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.amazon.in ");
	//find out the total number of links on the page :
	//print the text of each link on the console 
	
	List<WebElement> linksList = driver.findElements(By.tagName("a"));     //you give me the locator on basis of this i will return the total number of elements . we know the tag name for link is a 
	
	System.out.println("total links: "+ linksList.size());  //rs;total links: 325
	
	//print the text of each link ,we will use a for loop
	
	for(int i=0; i<linksList.size(); i++) {
		String text= linksList.get(i).getText();//whenever you want to capture something from array list you have to use .get
	System.out.println(text);
	
	//ignore the empty / blank text 
	if(!text.isEmpty()) { //if there is a blank text it will return false because of the note
		System.out.println(text);
		
		
		//i have to capture the text of each and every link and i have to print them. the number of inks you get you have to click on them
	}
	}
	
		
}
}