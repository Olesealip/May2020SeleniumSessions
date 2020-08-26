package SeleniumSesions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopHandle7and1 {

	public static void main(String[] args) throws InterruptedException {
		//there is alert that is called JS pop up 
		//you cannot inspect the alerts
		//you need to copture the text and press ok button
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		//we sweech the driver to alert page
		Alert alert=driver.switchTo().alert();//Alert -is an interface 
		String text= alert.getText();//getText- what ever text is available you capture to me 
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("this is correct alert mesage");
	}
		else {
			System.out.println("incorrect alert mesage");
		}
		
		alert.accept();//now we need to click on ok  button
		//alert.dismiss();//i dont want to accept the alert
		//what kind mof alert- its java script pop up, we cannot inspect the web elementon this particular alert
	//now we need to swittch the alert back to main page
		driver.switchTo().defaultContent();
		
	
	}
}
