package Nur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe [@class='demo-frame']")));    
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();;
	WebElement calendar= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	
	String text= calendar.getText();
	
	System.out.println(text);
	String month= "September 2020";
	String date = "24";
	WebElement arrow= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	while (true) {
	if (text.equals(month)) {
		break;	
	
		}
		else {
			arrow.click();
		}	
	driver.findElement(By.xpath("//a[contains(text(),'"+date+"')]")).click();
	}
        
	}

}
