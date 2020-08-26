package SeleniumSesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthotenficationPopUp7and2 {

	public static void main(String[] args) {
		// Authetification pop up - i cannot inspect the web elements

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	String username= "admin";
	String password="admin";
	
	
	driver.get("https://"+username+":"+ password+"@"+"the-internet.herokuapp.com/basic_auth"); //within the url you have to enter username and password @ and then your domain name
	
	}

}
