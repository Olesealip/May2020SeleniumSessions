package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept5and3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://hubspot.com/login");
		Thread.sleep(5000);
WebElement element=  driver.findElement(By.id("username"));
	element.sendKeys("Olesika_22@yahoo.com");//i would enter the value 
driver.navigate().refresh();    //refresh the page//after you refresh the page the ne page is coming with the same text field but is domversion number v2 
	//i will enter some diferent value on the same WebElement
//element=  driver.findElement(By.id("username"));
element.sendKeys("daniel_22@yahoo.com"); //we got an exception //rs:StaleElementReferenceException //you cannot use this element because you created at v1 and after refresh its v2 . the solution is to create the same  webelemt (element=  driver.findElement(By.id("username"));)once again
	
	
	}

}
