package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithSelect {

	public static void main(String[] args) {
   WebDriverManager.chromedriver().setup();
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
    
   By country = By.id("Form_submitForm_Country");
   
   WebElement element = driver.findElement(country);
   
   Select select = new Select(element);
   select.selectByVisibleText("Moldova");
   

   
   
	}

}
