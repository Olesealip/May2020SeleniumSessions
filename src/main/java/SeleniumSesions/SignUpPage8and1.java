package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage8and1 {

	public static void main(String[] args) throws InterruptedException {
	 
		String browser= "chrome";
		//create an object of webdriver factory to launch the browser
		WebDriverFactory  wf= new WebDriverFactory ();
		WebDriver driver= wf.launchBrowser(browser);
 wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
 System.out.println(wf.getPageTitle()); //get page title 
 
         By firstName= By.id("Form_submitForm_FirstName");
		 By lastName= By.id("Form_submitForm_LastName");
		 By countryName= By.id("Form_submitForm_Country");
		 
		 //i want to access util class . i need to create an object of this class
		 ElementUtil8 elementUtil= new  ElementUtil8(driver);
		 elementUtil.doSendKeys(firstName, "Olesea"); //locator- , value
		 elementUtil.doSendKeys(lastName, "Lipchenko"); //locator- , value
	Thread.sleep(5000);
		 elementUtil.doSelectValuesByVisibleText(countryName, "United States");//we have to enter drop down value 
	
		 //wf.closeBrowser();
	
	}

}
