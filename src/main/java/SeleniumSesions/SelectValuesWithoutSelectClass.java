package SeleniumSesions;
//i don't want to use select class how will you capture the value from dropdown

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValuesWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		String dob="18-Nov-2011";
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/   ");
		By day= By.id("day");
		By month= By.id("month");
		By year= By.id("year");
		
	By countryOptions= By.xpath("//select[@id='Form_submitForm_Country']/option");	
		
		
		
		By daysOptions=By.xpath("//select[@id='day']/option");
		By monthsOptions=By.xpath("//select[@id='month']/option");
		By yearOptions=By.xpath("//select[@id='year']/option");
		
//		selectValuesFromDropDownList(driver,daysOptions, dob.split("-")[0]);
//		selectValuesFromDropDownList(driver,monthsOptions,dob.split("-")[1]);
//		selectValuesFromDropDownList(driver,yearOptions, dob.split("-")[2]);

		
	selectValuesFromDropDownList(driver,countryOptions, "India");
		
		//we will use the concept of xpath, press control+f 
//List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option")); //this method will return list of web elements
	//the moment you get it dayslist print the size.
//	System.out.println(dayList.size());
	//this is called hardcoded
	//for(int i=0; i<dayList.size(); i++) {
	//	String text=dayList.get(i).getText();
	//	System.out.println(text);
	//	if(text.equals(18)) {
	//		dayList.get(i).click();//select 18 and click//then you click the work is done so you break then loop.
	//		break;
	//	}
	//}
}
//we can c reate generate utility 
	public static void selectValuesFromDropDownList(WebDriver driver, By locator, String value) {
	List<WebElement> dayList = driver.findElements (locator); //this method will return list of web elements
	//the moment you get it dayslist print the size.
	//System.out.println(dayList.size());
	//this is called hardcoded
	for(int i=0; i<dayList.size(); i++) {
		String text=dayList.get(i).getText();
		//System.out.println(text);
		if(text.equals(value)) {
			dayList.get(i).click();//select 18 and click//then you click the work is done so you break then loop.
			break;
		}
		}
	}
}
