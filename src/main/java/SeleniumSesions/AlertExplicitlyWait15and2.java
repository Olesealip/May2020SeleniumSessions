package SeleniumSesions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExplicitlyWait15and2 {

	public static void main(String[] args) throws InterruptedException {

		
		//WebDriverWait - is a class, which is extending fluentWait class is implimenting wait interface 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();

By signIn=By.name("proceed");
ElementUtil8 elementUtile= new ElementUtil8(driver);
System.out.println(elementUtile.doGetPageCurentUrl(10, "rediff"));

elementUtile.clickWhenready(signIn, 10);
Alert alert= elementUtile.waitForAlertPresent(5);
System.out.println(alert.getText());
alert.accept();


//we want to wait for alert to come
//WebDriverWait wait= new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.alertIsPresent());

Alert alert = waitForAlertPresent(driver, 20);
System.out.println(alert.getText() );
alert.accept() ;

Thread.sleep(5000);
driver.quit();

	}
public static Alert waitForAlertPresent(WebDriver driver,int timeOut) {
WebDriverWait wait= new WebDriverWait(driver, timeOut);
return wait.until(ExpectedConditions.alertIsPresent());//what this method is returning now 
}	
	
}
