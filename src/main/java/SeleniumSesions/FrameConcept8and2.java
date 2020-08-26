package SeleniumSesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept8and2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//Switching the driver o frame 
		//driver.switchTo().frame(2);//its unpredictable to use this method, they can introduce one more frame in between so the index will change 
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		
		WebElement  header= driver.findElement( By.tagName("h2"));
		System.out.println(header.getText());

	}//frame is also WebElement.Frame has own HTML dom
	//it could be 2 types of frames : 1.frame
	                                //2.iframe
	//both are samething
//homework on 45:00
	//classic.freecrm.com/index.html
	//username batchautomation
	//password test@12345
}
