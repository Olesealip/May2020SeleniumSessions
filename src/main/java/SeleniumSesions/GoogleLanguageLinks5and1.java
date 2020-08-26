package SeleniumSesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks5and1 {

	
		public static void main(String[] args) {
		//i have to capture the text of each and every link and i have to print them. the number of inks you get you have to click on them
        //first you have to capture all the language list and  you have to click on them one by one 
		//so to validate your xpath you need to press control+F
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new  ChromeDriver();
        driver.get("http://www.google.co.in/");
        languageClick (driver, "privet");
}
		
		/**
		 * 
		 * @param driver
		 * @param langName
		 */
		
		
        public static void languageClick(WebDriver driver, String langName) { //you give me the lanuage name and i simply click on it

   ////so to validate your xpath you need to press control+F in dev tools
   List <WebElement> langLinks= driver.findElements(By.xpath("//*[@id='SIvCob']/a")); //what elements will return findElements? list of WebElements
	                                                  //what element will return findElement? webElement
	
	System.out.println(langLinks.size()); //rs: 9
	
	//now print all the values 
	for(int i=0; i<langLinks.size(); i++) {
	String text= langLinks.get(i).getText(); //get- capture the text 
	System.out.println(text);
	
	//i want to click on the specific link
	
	//if(text.equals("langName")){ //put the link to which to click
	//langLinks.get(i).click(); // then you get to the text gfyfffyjust click on it 
	//break; // break the loop after my requierment is done
	}
	
	}
	
		
	
	

}
