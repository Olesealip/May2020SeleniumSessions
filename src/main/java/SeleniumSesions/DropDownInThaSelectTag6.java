package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInThaSelectTag6 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
//		driver.get("http://www.facebook.com/");
//		
//		By day= By.id("day");
//		By month= By.id("month");
//		By year= By.id("year");
//		
//		doSelectValuesByVisibleText(day, "23");
//		doSelectValuesByVisibleText(month, "Oct");
//		doSelectValuesByVisibleText(year, "1990");
//		
//		doSelectvaluesByIndex(day, 5);		
//		doSelectvaluesByIndex(month, 5);		
//		doSelectvaluesByIndex(year, 2020);		
//		
//				WebElement day= driver.findElement(By.id("day"));
//
//		  create an object of select class
//		Select select = new Select(day); //()-give the WebElemengt for which element you want to interact
//		select.selectByVisibleText("10");//("10")- you pass which number you want to be selected
//	select.selectByIndex(5);
//	select.selectByValue("17");
//	
//	WebElement month = driver.findElement(By.id("month"));
//	Select select1 = new Select(month);
//	select.selectByVisibleText("Nov");
//	}
//	public static void doSelectValuesByVisibleText(By locator, String value ) {
//		getElement(locator);
//		Select select =new Select(getElement(locator));//getElement(locator)-is returning you a WebElement
//		select.selectByVisibleText(value);
//		}
//	
//	public static void doSelectvaluesByIndex(By locator, int index) {
//		Select select= new Select (getElement(locator));
//		select.selectByIndex(index);
//		}
//	
//	public static void doSelectByValue(By locator, String value) {
//		Select select= new Select (getElement(locator));
//		select.selectByValue(value);
//		}
//	
//	
// 	    public static WebElement getElement(By locator) {
//		WebElement element= driver.findElement(locator);
//		return element;
//	}
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//create one locator
	By country=	By.id("Form_submitForm_Country");
		
		doSelectValuesByVisibleText(country, "Brazil");

}
	public static void doSelectValuesByVisibleText(By locator, String value ) {
		Select select =new Select(getElement(locator));//getElement(locator)-is returning you a WebElement
		select.selectByVisibleText(value);
}
	 public static WebElement getElement(By locator) {
			WebElement element= driver.findElement(locator);
		return element;
	}}

//there are two types of drop down list one with select tag another without 