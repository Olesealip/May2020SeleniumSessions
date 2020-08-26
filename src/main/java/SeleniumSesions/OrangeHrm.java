package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By lastName =By.id("Form_submitForm_LastName");
		By firstName= By.id("Form_submitForm_FirstName");
		By jobTitle= By.id("Form_submitForm_JobTitle");
		By email= By.id("Form_submitForm_Email");
		By companyName = By.id("Form_submitForm_CompanyName");
		By employee= By.id("Form_submitForm_NoOfEmployees");
		By phone= By.id("Form_submitForm_Contact");
		By industry= By.id("Form_submitForm_Industry");
		By country= By.id("Form_submitForm_Country");
		
		By checkMark= By.xpath("//*[@id=\"Form_submitForm_SetDummyData_Holder\"]/label");
		doSendkeys(lastName ,"Lipchenko");
		doSendkeys(firstName, "Olesea");
		doSendkeys(jobTitle,"SDET" );
		doSendkeys(email,"Olesika_22@yahoo.com" );
		
///driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Lipchenko");
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Olesea");
//		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("SDET");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("Olesika_22@yahoo.com");
//		driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("Samsung");
//		WebElement employes= driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
//		
//	
		
	doSelect(employee, "51 - 75");
	doSelectIndex(country, 5);	
	doClick(checkMark);	
	
	//*[@id="Form_submitForm_SetDummyData"]
		

	}
	public static void doSendkeys(By locator,String value) {
		driver.findElement(locator).sendKeys(value);	
	}
		public static void doSelect(By locator, String value) {
			
	Select select= new Select( driver.findElement(locator));
			select.selectByVisibleText(value);
				
		} 
		public static void doSelectIndex(By locator, int index) {
			
			Select select= new Select( driver.findElement(locator));
					select.selectByIndex(index);
						}
		public static void doClick(By locator) {
			driver.findElement(locator).click();
		}
		
	
	
	


}